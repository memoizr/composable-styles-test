package memoizrlabs.com.composable_styles

import android.app.Application
import com.memoizrlabs.Shank
import com.memoizrlabs.ShankModule
import com.memoizrlabs.ShankModuleInitializer
import memoizrlabs.com.composable_styles.app.view.User
import memoizrlabs.com.composable_styles.app.view.UserAvatar
import memoizrlabs.com.composable_styles.app.view.UserRepository
import memoizrlabs.com.composable_styles.app.view.UsersPresenter

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        ShankModuleInitializer.initializeModules(UsersModule())
    }
}

class UsersModule: ShankModule {
    override fun registerFactories() {
        Shank.registerFactory(UsersPresenter::class.java) { ->
            UsersPresenter(object : UserRepository {
                override fun getUsers(): List<User> {
                    return listOf(
                            User("hello", 3, UserAvatar("image")),
                            User("ther", 3, UserAvatar("image")),
                            User("I am", 3, UserAvatar("image"))
                            )
                }
            })
        }
    }
}