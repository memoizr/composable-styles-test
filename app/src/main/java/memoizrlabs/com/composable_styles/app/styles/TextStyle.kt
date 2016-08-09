package memoizrlabs.com.composable_styles.app.styles

import android.graphics.Typeface
import android.view.Gravity
import android.widget.TextView
import memoizrlabs.com.composable_styles.app.styles.TextStyle.TextViewStyle
import memoizrlabs.com.composable_styles.utils.Style
import memoizrlabs.com.composable_styles.utils.colors
import memoizrlabs.com.composable_styles.utils.dimens
import memoizrlabs.com.composable_styles.utils.layout
import org.jetbrains.anko.matchParent
import org.jetbrains.anko.textColor
import org.jetbrains.anko.wrapContent

object TextStyle {
    typealias TextViewStyle = Style<TextView>

    val Headline: TextViewStyle = {
        Header()
        TextColorAccent()
    }

    val NewsItemBody: TextViewStyle = {
        textSize = dimens.mediumTextSize
        typeface = Typeface.MONOSPACE
    }

    val Header: TextViewStyle = {
        textSize = dimens.giantTextSize
    }

    val DateTextStyle: TextViewStyle = {
        TextColorPrimaryDark()
        layout {
            width = matchParent
            height = wrapContent
            gravity = Gravity.BOTTOM or Gravity.RIGHT
        }
    }

    val Subtitle: TextViewStyle = {
        TextColorPrimaryDark()
        textSize = dimens.smallTextSize
    }

    val TextColorPrimaryDark: TextViewStyle = {
        textColor = colors.primaryDark
    }

    val TextColorAccent: TextViewStyle = {
        textColor = colors.accent
    }
}