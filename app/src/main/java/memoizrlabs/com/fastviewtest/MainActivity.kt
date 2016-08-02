package memoizrlabs.com.fastviewtest

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import org.jetbrains.anko.alignParentRight
import org.jetbrains.anko.backgroundColor
import org.jetbrains.anko.below
import org.jetbrains.anko.textColor

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(SettingsView(this).layout)
//        absoluteLayout {
//            imageView(R.id.action_bar_activity_content).lparams() VG
//        }
    }
}

class SettingsView(context: Context) : View(context) {
    val layout = SettingsViewLayout(context)

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        layout.label.text = "nope"
    }
}

interface CustomLayout {
//    val context: Context
//    val root: RelativeLayout
}

class SettingsViewLayout(context: Context) : CustomLayout, RelativeLayout(context) {
//    override val root: RelativeLayout = this
    lateinit var label: TextView

    init {
        label = textView(Header, Red) {
            id = 424242
            text = "Privacy setting"
        }.params { alignParentRight() }
        linearLayout(Horizontal) {
            this.textView() {
                text = "1 2 3"
//                }.params {
//                    alignParentRight()
            }
//                sendStatisticButton = button(SettingsButton)
        }.params { below(label) }
        textView {
            text = "trolololol"
        }.params { }
    }
}

fun <VG : ViewGroup> VG.textView(vararg style: TextView.(VG) -> Unit, structure: TextView.() -> Unit): TextView {
    println(this)
    val textView = TextView(context).apply(structure)
    style.forEach { it(textView, this) }
    addView(textView)
    return textView
}

fun <VG : ViewGroup> VG.relativeLayout(structure: RelativeLayout.() -> Unit) = RelativeLayout(context).apply(structure)
fun <VG : ViewGroup> VG.linearLayout(vararg style: LinearLayout.(VG) -> Unit, structure: LinearLayout.() -> Unit): LinearLayout {
    return LinearLayout(context).apply(structure).apply { style.forEach { it(this@linearLayout) } }.apply { this@linearLayout.addView(this) }
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

val Header = { textView: TextView, parent: RelativeLayout -> textView.textSize = 10f }
val Red = { textView: TextView, parent: RelativeLayout -> textView.textColor = textView.context.getColor(android.R.color.holo_blue_bright) }
val Horizontal = { linearLayout: LinearLayout, parent: RelativeLayout ->
    linearLayout.orientation = LinearLayout.HORIZONTAL
    linearLayout.backgroundColor = R.color.colorPrimary
}

val ListItem = { view: View, parent: RelativeLayout ->
}
