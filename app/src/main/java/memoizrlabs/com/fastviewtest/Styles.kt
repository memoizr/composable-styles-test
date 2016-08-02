package memoizrlabs.com.fastviewtest

import android.content.res.ColorStateList
import android.graphics.Typeface
import android.graphics.drawable.RippleDrawable
import android.util.TypedValue
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import memoizrlabs.com.fastviewtest.TextStyle.TextViewStyle
import org.jetbrains.anko.matchParent
import org.jetbrains.anko.padding
import org.jetbrains.anko.textColor

object TextStyle {
    typealias TextViewStyle = Style<TextView>

    val Headline: TextViewStyle = {
        Header()
        TextColorAccent()
    }

    val NewsItemBody: TextViewStyle = {
        textSize = 16f
        typeface = Typeface.MONOSPACE
    }

    val Header: TextViewStyle = {
        textSize = dimens.mediumTextSize
    }

    val DateTextStyle: TextViewStyle = {
        TextColorPrimaryDark()
        layout {
            width = matchParent
            height = matchParent
            gravity = Gravity.BOTTOM or Gravity.RIGHT
        }
    }

    val Subtitle: TextViewStyle = {
        TextColorPrimaryDark()
        textSize = dimens.smallTextSize
    }

    val TextColorPrimaryDark: TextViewStyle = {
        textColor = context.customTheme.primaryDark
    }

    val TextColorAccent: TextViewStyle = {
        textColor = context.customTheme.accent
    }
}

object ButtonStyle {
    val Borderless: Button.() -> Unit = {
        val valueOf = ColorStateList.valueOf(context.customTheme.accent)
        background = RippleDrawable(valueOf, null, null)
        layout {
            height = context.resources.getDimensionPixelSize(resolveAttribute(R.attr.actionBarSize))
        }
    }
}

inline fun View.resolveAttribute(attribute: Int): Int {
    val typedValue = TypedValue()
    context.theme.resolveAttribute(attribute, typedValue, true)
    return typedValue.resourceId
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
