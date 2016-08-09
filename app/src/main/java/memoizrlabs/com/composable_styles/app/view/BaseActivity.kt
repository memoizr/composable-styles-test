package memoizrlabs.com.composable_styles.app.view

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.view.ViewManager
import android.widget.LinearLayout
import memoizrlabs.com.composable_styles.app.styles.GlobalStyles
import memoizrlabs.com.composable_styles.app.styles.InvertedTheme
import memoizrlabs.com.composable_styles.utils.appTheme
import memoizrlabs.com.composable_styles.utils.inflate
import memoizrlabs.com.composable_styles.utils.render
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko._LinearLayout
import org.jetbrains.anko.appcompat.v7.toolbar
import org.jetbrains.anko.custom.ankoView
import org.jetbrains.anko.matchParent


class FooActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        super.setContentView(SettingsView(this))
    }

    override fun setContentView(view: View) {
        rootView.layout.viewStub.inflate(view)
    }
}

abstract class BaseActivity : AppCompatActivity() {
    lateinit var rootView: RootView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appTheme = InvertedTheme()//randomlyEither(InvertedTheme(), DefaultTheme())
        rootView = RootView(this)
        super.setContentView(rootView)
        setSupportActionBar(rootView.layout.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
    }

    override fun setContentView(view: View) {
        rootView.layout.viewStub.inflate(view)
    }
}

class RootView(context: Context) : _LinearLayout(context) {
    val layout = RootLayout().inflate(this)
}

class RootLayout : AnkoComponent<RootView> {
    var toolbar: Toolbar by ViewDelegate()
    var viewStub: Stub by ViewDelegate()
    override fun createView(ui: AnkoContext<RootView>): View {
        return ui.render {
            lparams {
                height = matchParent
                width = matchParent
            }
            orientation = LinearLayout.VERTICAL
            toolbar(GlobalStyles.ToolbarStyle) {
                toolbar = this
            }
            stub {
                lparams {
                    height = matchParent
                    width = matchParent
                }
                viewStub = this
            }
        }
    }
}

fun ViewManager.stub(): Stub = stub({})
inline fun ViewManager.stub(init: Stub.() -> Unit): Stub {
    return ankoView({ Stub(it) }, 0) { init() }
}
//fun ViewManager.toolbar(vararg styles: _Toolbar.() -> Unit, init: _Toolbar.() -> Unit): Toolbar {
//    return toolbar(styles, init).apply { styles.forEach { this.it() } ; id = View.generateViewId() }
//}
