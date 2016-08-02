package memoizrlabs.com.fastviewtest

import android.view.View
import android.widget.TextView
import memoizrlabs.com.fastviewtest.TextStyle.DateTextStyle
import org.jetbrains.anko.*

class SettingsViewLayout : AnkoComponent<SettingsView> {
    lateinit var headlineTextView: TextView private set

    override fun createView(ui: AnkoContext<SettingsView>): View =
            ui.render(Container) {
                textView(TextStyle.Headline) {
                    headlineTextView = this
                    text = "Big Headline!"
                }

                linearLayout(Column) {
                    textView(TextStyle.NewsItemBody) {
                        text = "Some Context"
                    }
                    textView(TextStyle.Subtitle) {
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

                button(ButtonStyle.Borderless) {
                    text = "click me"
                }.params {
                    alignParentBottom()
                }
            }
}
