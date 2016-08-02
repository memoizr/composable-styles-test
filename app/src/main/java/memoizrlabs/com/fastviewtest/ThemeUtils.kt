package memoizrlabs.com.fastviewtest

import android.content.Context
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class ThemeDelegate : ReadWriteProperty<Context, CustomTheme> {
    var theme: CustomTheme = DefaultTheme()

    override fun getValue(thisRef: Context, property: KProperty<*>): CustomTheme {
        return theme
    }

    override fun setValue(thisRef: Context, property: KProperty<*>, value: CustomTheme) {
        theme = value
    }
}

var Context.customTheme: CustomTheme by ThemeDelegate()