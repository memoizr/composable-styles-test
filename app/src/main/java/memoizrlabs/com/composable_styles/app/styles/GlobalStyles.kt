package memoizrlabs.com.composable_styles.app.styles

import android.view.View
import android.widget.LinearLayout
import memoizrlabs.com.composable_styles.utils.dimens
import org.jetbrains.anko.padding
import memoizrlabs.com.composable_styles.utils.Style

object GlobalStyles {
    val Column: Style<LinearLayout> = {
        orientation = LinearLayout.VERTICAL
        padding = dimens._2x
    }

    val Container: Style<View> = {
        padding = dimens._1x
    }
}