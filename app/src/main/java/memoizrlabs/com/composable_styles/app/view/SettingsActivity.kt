package memoizrlabs.com.composable_styles.app.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import memoizrlabs.com.composable_styles.app.styles.DefaultTheme
import memoizrlabs.com.composable_styles.app.styles.InvertedTheme
import memoizrlabs.com.composable_styles.utils.appTheme
import memoizrlabs.com.composable_styles.utils.randomlyEither

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appTheme = randomlyEither(InvertedTheme(), DefaultTheme())
        setContentView(SettingsView(this))
    }
}

