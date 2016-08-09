package memoizrlabs.com.composable_styles

import android.view.View
import memoizrlabs.com.composable_styles.app.view.KeyRegister
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.TypeSafeMatcher
import kotlin.reflect.KMutableProperty1

fun <T, P> withName(x: KMutableProperty1<T, P>): Matcher<View> = withName(x.name)


fun withName(name: String): Matcher<View> {
    return object : TypeSafeMatcher<View>() {
        override fun describeTo(description: Description?) {
            description?.appendText(" $name")
        }

        override fun matchesSafely(item: View?): Boolean {
            return item?.getTag(KeyRegister.key)?.let { (it as String) == name } ?: false
        }
    }
}
