package memoizrlabs.com.fastviewtest

import android.graphics.Typeface
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import org.jetbrains.anko.matchParent
import org.jetbrains.anko.padding
import org.jetbrains.anko.textColor

val HeadlineTextStyle: TextView.() -> Unit = {
    Header()
    TextColorAccent()
}

val NewsItemBodyStyle: TextView.() -> Unit = {
    textSize = 16f
    typeface = Typeface.MONOSPACE
}

val Header: TextView.() -> Unit = {
    textSize = dimens.mediumTextSize
}

object TextStyle {
    val DateTextStyle: TextView.() -> Unit = {
        TextColorPrimaryDark()
        layout {
            width = matchParent
            height = matchParent
            gravity = Gravity.BOTTOM or Gravity.RIGHT
        }
    }
}

inline fun View.layout(foo: ViewGroup.LayoutParams.() -> Unit) = this.layoutParams.foo()

val SubtitleTextStyle: TextView.() -> Unit = {
    TextColorPrimaryDark()
    textSize = dimens.smallTextSize
}

val TextColorPrimaryDark: TextView.() -> Unit = {
    textColor = context.customTheme.primaryDark
}

val TextColorAccent: TextView.() -> Unit = {
    textColor = context.customTheme.accent
}

val Column: LinearLayout.() -> Unit = {
    orientation = LinearLayout.VERTICAL
    padding = dimens._2x
}

val Container: View.() -> Unit = {
    padding = dimens._1x
}


//val Header: Style<TextView> = {
//    textSize = 20f
//}
//
//val Red: Style<TextView> = {
////    Header(this)
//    textColor = context.getColor(R.color.colorPrimary)
//}
//
//val Horizontal: Style<LinearLayout> = {
//    orientation = LinearLayout.HORIZONTAL
//}

//typealias Style<T> = T.() -> Unit
