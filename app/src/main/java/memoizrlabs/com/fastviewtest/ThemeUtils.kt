package memoizrlabs.com.fastviewtest

import android.content.Context
import android.view.View
import org.jetbrains.anko.dip
import org.jetbrains.anko.sp
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

var Context.dimens: CustomResources by ResourcesDelegate()
val View.dimens: CustomResources get() = context.dimens

class ResourcesDelegate() : ReadWriteProperty<Context, CustomResources> {
    var resources: CustomResources? = null

    override fun getValue(thisRef: Context, property: KProperty<*>): CustomResources {
        if (resources == null) resources = DefaultResources(thisRef)
        return resources!!
    }

    override fun setValue(thisRef: Context, property: KProperty<*>, value: CustomResources) {
        resources = value
    }
}

interface CustomResources {
    val _1x: Int
    val _2x: Int
    val smallTextSize: Float
    val mediumTextSize: Float
}

class DefaultResources(private val context: Context): CustomResources {
    override val mediumTextSize: Float get() = context.sp(18).toFloat()
    override val smallTextSize: Float get() = context.sp(5).toFloat()
    override val _1x: Int get() = context.dip(8)
    override val _2x: Int get() = context.dip(16)
}
