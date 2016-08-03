package memoizrlabs.com.composable_styles.app.view

import android.view.View
import android.widget.TextView
import memoizrlabs.com.composable_styles.app.styles.ButtonStyle
import memoizrlabs.com.composable_styles.app.styles.GlobalStyles
import memoizrlabs.com.composable_styles.app.styles.TextStyle
import memoizrlabs.com.composable_styles.app.styles.TextStyle.DateTextStyle
import memoizrlabs.com.composable_styles.utils.*
import org.jetbrains.anko.*

class SettingsViewLayout : AnkoComponent<SettingsView> {
    lateinit var headlineTextView: TextView private set

    override fun createView(ui: AnkoContext<SettingsView>): View =
            ui.render(GlobalStyles.Container) {
                textView(TextStyle.Headline) {
                    headlineTextView = this
                    text = "Big Headline!"
                }

                linearLayout(GlobalStyles.Column) {
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
