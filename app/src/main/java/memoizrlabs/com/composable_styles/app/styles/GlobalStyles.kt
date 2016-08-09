package memoizrlabs.com.composable_styles.app.styles

import android.R
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.LinearLayout
import memoizrlabs.com.composable_styles.utils.*
import org.jetbrains.anko.backgroundColor
import org.jetbrains.anko.matchParent
import org.jetbrains.anko.padding

object GlobalStyles {
    val Column: Style<LinearLayout> = {
        orientation = LinearLayout.VERTICAL
        padding = dimens._2x
    }

    val Container: Style<View> = {
        padding = dimens._1x
    }

    val ToolbarStyle: Style<Toolbar> = {
        layout {
            height = dimensionFromAttribute(R.attr.actionBarSize)
            width = matchParent
        }
        backgroundColor = context.appTheme.accent
        elevation = dimens.actionBarElevation
    }
}