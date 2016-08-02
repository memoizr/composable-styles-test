package memoizrlabs.com.fastviewtest

import android.graphics.Typeface
import android.widget.LinearLayout
import android.widget.TextView
import org.jetbrains.anko.padding
import org.jetbrains.anko.textColor

val HeadLine: TextView.() -> Unit = {
    Header()
    Accent()
}

val NewsItemBody: TextView.() -> Unit = {
    textSize = 16f
    typeface = Typeface.MONOSPACE
}

val Header: TextView.() -> Unit = {
    textSize = 24f
}

val Date: TextView.() -> Unit = {
    Gray()
}

val Subtitle: TextView.() -> Unit = {
    Gray()
    textSize = 10f
}

val Gray: TextView.() -> Unit = {
    textColor = Colors.Gray
}

val Accent: TextView.() -> Unit = {
    textColor = context.customTheme.accent
}

val Column: LinearLayout.() -> Unit = {
    orientation = LinearLayout.VERTICAL
    padding = 24
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
