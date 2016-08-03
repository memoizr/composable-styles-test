package memoizrlabs.com.composable_styles

import android.content.res.ColorStateList
import android.graphics.drawable.RippleDrawable
import android.util.TypedValue
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import org.jetbrains.anko.padding

object ButtonStyle {
    val Borderless: Button.() -> Unit = {
        background = rippleDrawable(context.appTheme.accent)
        layout {
            height = dimensionFromAttribute(R.attr.actionBarSize)
        }
    }
}

fun View.rippleDrawable(accent: Int) = RippleDrawable(ColorStateList.valueOf(accent), null, null)

fun View.dimensionFromAttribute(attribute: Int): Int {
    val typedValue = TypedValue()
    context.theme.resolveAttribute(attribute, typedValue, true)
    return context.resources.getDimensionPixelSize(typedValue.resourceId)
}

inline fun View.layout(foo: ViewGroup.LayoutParams.() -> Unit) = this.layoutParams.foo()

val Column: LinearLayout.() -> Unit = {
    orientation = LinearLayout.VERTICAL
    padding = dimens._2x
}

val Container: View.() -> Unit = {
    padding = dimens._1x
}

typealias Style<T> = T.() -> Unit
