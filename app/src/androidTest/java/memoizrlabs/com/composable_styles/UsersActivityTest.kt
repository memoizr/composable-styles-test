package memoizrlabs.com.composable_styles

import android.content.Intent
import android.support.test.espresso.Espresso.onView
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.memoizrlabs.Shank
import com.memozr.assertk.expect
import io.kotlintest.specs.BehaviorSpec
import memoizrlabs.com.composable_styles.app.view.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class UsersActivityTest : BehaviorSpec() {
    @Rule @JvmField
    var activityRule = ActivityTestRule(UsersActivity::class.java, true, false)
    val users = listOf(aUser(), aUser(), aUser())

    @Test
    fun fooBar() {
        Shank.registerFactory(UsersPresenter::class.java) { ->
            UsersPresenter(object : UserRepository {
                override fun getUsers(): List<User> {
                    return users
                }
            })
        }
        activityRule.launchActivity(Intent())
        onView(withName("recyclerView")).check { view, noMatchingViewException ->
            view.post {
                val textViews = (view as RecyclerView).layoutManager.findViewByPosition(0).findTextViewWithText("foo")
                expect that textViews[0].text isEqualToIgnoringCase users[0].name
                expect that textViews[1].text isEqualToIgnoringCase users[1].name
            }
        }
    }
}

fun View.findTextViewWithText(text: String): List<TextView> {
    val mutableArray = arrayListOf<View>()
    findViewsWithText(mutableArray, text, View.FIND_VIEWS_WITH_TEXT)
    return mutableArray.map { it as TextView }
}

fun aUser() = User("foo", 3, UserAvatar("there"))
