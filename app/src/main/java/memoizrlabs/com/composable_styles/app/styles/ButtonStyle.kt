package memoizrlabs.com.composable_styles.app.styles

import android.widget.Button
import memoizrlabs.com.composable_styles.R
import memoizrlabs.com.composable_styles.utils.appTheme
import memoizrlabs.com.composable_styles.utils.dimensionFromAttribute
import memoizrlabs.com.composable_styles.utils.layout
import memoizrlabs.com.composable_styles.utils.rippleDrawable

object ButtonStyle {
    val Borderless: Button.() -> Unit = {
        background = rippleDrawable(context.appTheme.accent)
        layout {
            height = dimensionFromAttribute(R.attr.actionBarSize)
        }
    }
}