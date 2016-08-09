package memoizrlabs.com.composable_styles

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.widget.TextView
import memoizrlabs.com.composable_styles.app.view.FooActivity
import memoizrlabs.com.composable_styles.app.view.SettingsViewLayout
import memoizrlabs.com.composable_styles.utils.appTheme
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Rule @JvmField
    var activityRule = ActivityTestRule(FooActivity::class.java, true, false)
    val layout = SettingsViewLayout::class.java
    init {
    }

    @Before
    fun before() {
        activityRule.launchActivity(Intent())
    }

    @Test
    fun useAppContext() {
        onView(withName(SettingsViewLayout::subltitleTextView)).perform(click()).check({ view, noMatchingViewException ->
            Assert.assertEquals("Subtitle", (view as TextView).text)
//            expect that (view as TextView).text isEqualToIgnoringCase "foo"
        })
        onView(withName(SettingsViewLayout::checkBox)).perform(click())
    }

    @Test
    fun hasAToolbar() {
        Thread.sleep(1000)
        onView(withName("toolbar")).perform(click()).check { view, noMatchingViewException ->
            println("${(view.background as ColorDrawable).color} ${view.context.appTheme.accent}")
        }
    }
}

