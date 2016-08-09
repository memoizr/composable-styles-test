package memoizrlabs.com.composable_styles.app.view

import android.view.View
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class ViewDelegate<T, V: View> : ReadWriteProperty<T, V> {
    lateinit var view: V
    override fun getValue(thisRef: T, property: KProperty<*>): V {
        return view
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: V) {
        value.setTag(KeyRegister.key, property.name)
        view = value
    }
}