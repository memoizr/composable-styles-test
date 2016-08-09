package memoizrlabs.com.composable_styles.app.view

import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import memoizrlabs.com.composable_styles.R
import memoizrlabs.com.composable_styles.app.styles.*
import memoizrlabs.com.composable_styles.utils.Style
import memoizrlabs.com.composable_styles.utils.appTheme
import memoizrlabs.com.composable_styles.utils.render
import org.jetbrains.anko.*

class SettingsViewLayout : AnkoComponent<SettingsView> {
    lateinit var headlineTextView: TextView private set
    var subltitleTextView: TextView by ViewDelegate(); private set
    var checkBox: CheckBox by ViewDelegate(); private set

    val map = mutableMapOf<String, Pair<Class<View>, View>>()

    override fun createView(ui: AnkoContext<SettingsView>): View =
            ui.render {
                style = GlobalStyles.Container
                style?.invoke(this)
                textView() {
                    id = View.generateViewId()
                    style = TextStyle.Headline
                    style?.invoke(this)
                    headlineTextView = this
                }

                linearLayout(GlobalStyles.Column) {
                    textView(TextStyle.NewsItemBody) {
                        text = "Some Context"
                    }
                    textView() {
                        subltitleTextView = this
//                        Subtitle()
                        text = "Subtitle"
                    }
                    checkBox {
                        checkBox = this
                        text = "check this!"
                    }
                }.lparams {
                    below(headlineTextView)
                }

                textView(TextStyle.DateTextStyle) {
                    text = "Date"
                }.lparams {
                    alignParentRight()
                    below(headlineTextView)
                }

                button {
                    style = ButtonStyle.Borderless
                    println("Style is $style")
                    style?.invoke(this)
                    text = "click me"
//                    style = Borderless
                    onClick {
                        postDelayed({
                            val foo = (parent as ViewGroup)
//                            foo.context.appTheme = InvertedTheme()
//                            foo.style.invoke(this@render)
                            foo.setTheme(DefaultTheme())
                            Toast.makeText(context, foo.toString(), Toast.LENGTH_SHORT).show()
                        }, 400)
//                        parent.requestLayout()
                    }
//
                }.lparams {
                    alignParentBottom()
                }
//                recyclerView()
            }
}

fun ViewGroup.setTheme(theme: AppTheme): Unit {
    context.appTheme = theme
    childrenSequence().forEach {
        when (it) {
            is ViewGroup -> {
                it.style?.invoke(it)
                it.setTheme(theme)
            }
            is View -> it.style?.invoke(it)
        }
    }
}

var <T : View> T.style: Style<T>?
    set(value) {
        tag = value
    }
    get() = tag as Style<T>?

object KeyRegister {
    val key = R.id.uniqueId
}
