package memoizrlabs.com.fastviewtest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appTheme = randomlyEither(InvertedTheme(), DefaultTheme())
        setContentView(SettingsView(this))
    }
}

fun <T> randomlyEither(a: T, b: T) = if (Math.random() > 0.5) a else b
