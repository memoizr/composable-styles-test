package memoizrlabs.com.fastviewtest

import android.widget.TextView
import linearLayout
import org.jetbrains.anko.alignParentRight
import org.jetbrains.anko.below
import params
import textView

class SettingsViewLayout(view: SettingsView) {
    lateinit var headlineTextView: TextView private set

    init {
        view.apply {
            textView(HeadLine) {
                headlineTextView = this
                text = "Big Headline!"
            }

            linearLayout(Column) {
                textView(NewsItemBody) {
                    text = "Some Context"
                }
                textView(Subtitle) {
                    text = "Subtitle"
                }
            }.params {
                below(headlineTextView)
            }

            textView(Date) {
                text = "Date"
            }.params {
                alignParentRight()
                below(headlineTextView)
            }
        }
    }
}