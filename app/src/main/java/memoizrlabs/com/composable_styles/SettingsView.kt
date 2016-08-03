package memoizrlabs.com.composable_styles

import android.content.Context
import org.jetbrains.anko._RelativeLayout

class SettingsView(context: Context) : _RelativeLayout(context) {
    private val layout = SettingsViewLayout().inflate(this)

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        layout.headlineTextView.text = layout.headlineTextView.text.toString() + "nope"
    }
}