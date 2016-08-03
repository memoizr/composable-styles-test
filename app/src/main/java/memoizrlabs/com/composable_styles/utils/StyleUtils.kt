package memoizrlabs.com.composable_styles.utils

import android.content.res.ColorStateList
import android.graphics.drawable.RippleDrawable
import android.util.TypedValue
import android.view.View
import android.view.ViewGroup

fun View.rippleDrawable(accent: Int) = RippleDrawable(ColorStateList.valueOf(accent), null, null)

fun View.dimensionFromAttribute(attribute: Int): Int {
    val typedValue = TypedValue()
    context.theme.resolveAttribute(attribute, typedValue, true)
    return context.resources.getDimensionPixelSize(typedValue.resourceId)
}

inline fun View.layout(foo: ViewGroup.LayoutParams.() -> Unit) = this.layoutParams.foo()

typealias Style<T> = T.() -> Unit
