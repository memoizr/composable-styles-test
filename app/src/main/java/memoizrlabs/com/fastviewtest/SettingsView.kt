package memoizrlabs.com.fastviewtest

import android.content.Context
import android.widget.RelativeLayout

class SettingsView(context: Context) : RelativeLayout(context) {
    private val layout = SettingsViewLayout(this)

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        layout.headlineTextView.text = "nope"
    }
}