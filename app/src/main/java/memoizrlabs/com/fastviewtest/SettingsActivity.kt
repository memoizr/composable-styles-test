package memoizrlabs.com.fastviewtest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        customTheme = DefaultTheme()
        setContentView(SettingsView(this))
    }
}
