fun <VG : android.view.ViewGroup> VG.textView(vararg style: android.widget.TextView.() -> Unit, structure: android.widget.TextView.() -> Unit): android.widget.TextView {
    val textView = android.widget.TextView(context).apply(structure)
    textView.id = android.view.View.generateViewId()
    style.forEach { it(textView) }
    addView(textView)
    return textView
}

fun <VG : android.view.ViewGroup> VG.relativeLayout(structure: android.widget.RelativeLayout.() -> Unit) = android.widget.RelativeLayout(context).apply(structure)
fun <VG : android.view.ViewGroup> VG.linearLayout(vararg style: android.widget.LinearLayout.() -> Unit, structure: android.widget.LinearLayout.() -> Unit): android.widget.LinearLayout {
    return android.widget.LinearLayout(context).apply(structure).apply { style.forEach { it() } }.apply { this@linearLayout.addView(this) }
}

fun android.widget.LinearLayout.params(params: android.widget.RelativeLayout.LayoutParams.() -> Unit): android.widget.LinearLayout {
    setParams(params)
    return this
}

fun android.widget.TextView.params(params: android.widget.RelativeLayout.LayoutParams.() -> Unit): android.widget.TextView {
    setParams(params)
    return this
}

private fun android.view.View.setParams(params: android.widget.RelativeLayout.LayoutParams.() -> Unit) {
    val layoutParams = android.widget.RelativeLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
    params(layoutParams)
    this.layoutParams = layoutParams
}