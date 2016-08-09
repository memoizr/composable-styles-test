package memoizrlabs.com.composable_styles.app.view

import android.os.Bundle

class SettingsActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(SettingsView(this))
//        setContentView(R.layout.activity_main)
    }
}

