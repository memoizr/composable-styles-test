package memoizrlabs.com.composable_styles

import android.widget.RelativeLayout
import android.widget.TextView
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).

 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class ExampleUnitTest {

    @Test
    @Throws(Exception::class)
    fun addition_isCorrect() {
        val layout = RelativeLayout(null)
        val view = TextView(null)

        layout.addView(view)
    }
}