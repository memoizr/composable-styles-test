package memoizrlabs.com.composable_styles

import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko._RelativeLayout
import org.jetbrains.anko.wrapContent

fun <V: ViewGroup, Y: AnkoComponent<V>> Y.inflate(viewGroup: V) = this.apply {
    createView(AnkoContext.createDelegate(viewGroup)); Unit
}

val <T: _RelativeLayout> T.params: View.(android.widget.RelativeLayout.LayoutParams.() -> Unit) -> View get() =  { extraParams ->
    if (this.layoutParams == null)  android.widget.RelativeLayout.LayoutParams(wrapContent, wrapContent)
    (layoutParams as RelativeLayout.LayoutParams).extraParams()
    this.layoutParams = layoutParams
    this
}

fun <V : View, C : AnkoContext<V>> C.render(vararg styles: V.() -> Unit, init: V.() -> Unit): V {
    this.owner.init()
    styles.forEach { this.owner.it() }
    return this.owner
}
