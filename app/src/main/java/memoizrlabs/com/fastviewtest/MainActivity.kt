package memoizrlabs.com.fastviewtest

import android.content.Context
import android.graphics.Typeface
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import org.jetbrains.anko.alignParentRight
import org.jetbrains.anko.below
import org.jetbrains.anko.padding
import org.jetbrains.anko.textColor

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(SettingsView(this))
    }
}

class SettingsView(context: Context) : RelativeLayout(context) {
    private val layout = SettingsViewLayout(this)

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        layout.headlineTextView.text = "nope"
    }
}

class SettingsViewLayout(view: SettingsView) {
    lateinit var headlineTextView: TextView private set

    init {
        view.apply {
            textView(HeadLine) {
                headlineTextView = this
                text = "Big Headline!"
            }

            linearLayout(Column) {
                textView(NewsItemBody) {
                    text = "Some Context"
                }
                textView(Subtitle) {
                    text = "Subtitle"
                }
            }.params {
                below(headlineTextView)
            }

            textView(Date) {
                text = "Date"
            }.params {
                alignParentRight()
                below(headlineTextView)
            }
        }
    }
}

val HeadLine: TextView.() -> Unit = {
    Header()
    Accent()
}

val NewsItemBody: TextView.() -> Unit = {
    textSize = 16f
    typeface = Typeface.MONOSPACE
}

val Header: TextView.() -> Unit = {
    textSize = 24f
}

val Date: TextView.() -> Unit = {
    Gray()
}

val Subtitle: TextView.() -> Unit = {
    Gray()
    textSize = 10f
}

val Gray: TextView.() -> Unit = {
    textColor = Colors.Gray
}

val Accent: TextView.() -> Unit = {
    textColor = Colors.Accent
}

val Column: LinearLayout.() -> Unit = {
    orientation = LinearLayout.VERTICAL
    padding = 24
}

object Colors {
    val Gray = 0xffaaaaaa.toInt() //Color.parseColor("#AAAAAA")
    val Accent = 0xffFFaaaa.toInt()
}

//val Header: Style<TextView> = {
//    textSize = 20f
//}
//
//val Red: Style<TextView> = {
////    Header(this)
//    textColor = context.getColor(R.color.colorPrimary)
//}
//
//val Horizontal: Style<LinearLayout> = {
//    orientation = LinearLayout.HORIZONTAL
//}

//typealias Style<T> = T.() -> Unit

fun <VG : ViewGroup> VG.textView(vararg style: TextView.() -> Unit, structure: TextView.() -> Unit): TextView {
    val textView = TextView(context).apply(structure)
    textView.id = View.generateViewId()
    style.forEach { it(textView) }
    addView(textView)
    return textView
}

fun <VG : ViewGroup> VG.fooView(vararg style: FooView.() -> Unit, structure: FooView.() -> Unit): FooView {
    val textView = FooView(context).apply(structure)
    textView.id = View.generateViewId()
    style.forEach { it(textView) }
    addView(textView)
    return textView
}

class FooView(context: Context) : View(context) {
    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        println("attaching now fooView")
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        println("detaching now fooView")
    }
}

fun <VG : ViewGroup> VG.relativeLayout(structure: RelativeLayout.() -> Unit) = RelativeLayout(context).apply(structure)
fun <VG : ViewGroup> VG.linearLayout(vararg style: LinearLayout.() -> Unit, structure: LinearLayout.() -> Unit): LinearLayout {
    return LinearLayout(context).apply(structure).apply { style.forEach { it() } }.apply { this@linearLayout.addView(this) }
}

fun LinearLayout.params(params: RelativeLayout.LayoutParams.() -> Unit): LinearLayout {
    foo(params)
    return this
}

fun TextView.params(params: RelativeLayout.LayoutParams.() -> Unit): TextView {
    foo(params)
    return this
}

private fun View.foo(params: RelativeLayout.LayoutParams.() -> Unit) {
    val layoutParams = RelativeLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
    params(layoutParams)
    this.layoutParams = layoutParams
}

val Vertical = { linearLayout: LinearLayout ->
    linearLayout.orientation = LinearLayout.VERTICAL
}

val ListItem = { view: View ->
}
