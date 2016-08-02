package memoizrlabs.com.fastviewtest

import android.view.View
import android.widget.TextView
import memoizrlabs.com.fastviewtest.TextStyle.DateTextStyle
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.alignParentRight
import org.jetbrains.anko.below

class SettingsViewLayout : AnkoComponent<SettingsView> {
    lateinit var headlineTextView: TextView private set

    override fun createView(ui: AnkoContext<SettingsView>): View =
            ui.render(Container) {
                textView(HeadlineTextStyle) {
                    headlineTextView = this
                    text = "Big Headline!"
                }

                linearLayout(Column) {
                    textView(NewsItemBodyStyle) {
                        text = "Some Context"
                    }
                    textView(SubtitleTextStyle) {
                        text = "Subtitle"
                    }
                    checkBox {
                        text = "check this!"
                    }
                }.params {
                    below(headlineTextView)
                }

                textView(DateTextStyle) {
                    text = "Date"
                }.params {
                    alignParentRight()
                    below(headlineTextView)
                }
            }
}
