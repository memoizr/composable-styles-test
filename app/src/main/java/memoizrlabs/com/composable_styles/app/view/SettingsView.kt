package memoizrlabs.com.composable_styles.app.view

import android.content.Context
import memoizrlabs.com.composable_styles.utils.inflate
import org.jetbrains.anko._RelativeLayout
import org.jetbrains.anko.onClick

class SettingsView(context: Context) : _RelativeLayout(context) {
    val lo = SettingsViewLayout().inflate(this)

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        lo.headlineTextView.text = lo.headlineTextView.text.toString() + "nope"
        lo.subltitleTextView.onClick { println("I've been clicked!") }
    }
}