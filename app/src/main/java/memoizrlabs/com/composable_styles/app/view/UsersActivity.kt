package memoizrlabs.com.composable_styles.app.view

import android.content.Context
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.memoizrlabs.Shank
import memoizrlabs.com.composable_styles.app.styles.GlobalStyles
import memoizrlabs.com.composable_styles.utils.appTheme
import memoizrlabs.com.composable_styles.utils.dimens
import memoizrlabs.com.composable_styles.utils.inflate
import memoizrlabs.com.composable_styles.utils.render
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView

class UsersActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(SummaryView(this))
    }
}

interface UserRepository {
    fun getUsers(): List<User>
}

class UsersPresenter(private val userRepository: UserRepository) {
    fun onViewAttached(view: View) {
        view.showUsers(userRepository.getUsers())
    }

    interface View {
        fun showUsers(users: List<User>)
    }
}

class SummaryView(context: Context) : _FrameLayout(context), UsersPresenter.View {
    private val userAdapter = UserAdapter()
    private var layout = SummaryLayout().inflate(this)
    private val presenter = Shank.provideNew(UsersPresenter::class.java)

    init {
        layout.recyclerView.layoutManager = LinearLayoutManager(context)
        layout.recyclerView.adapter = userAdapter
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        presenter.onViewAttached(this)
    }

    override fun showUsers(users: List<User>) {
        userAdapter.items = users
    }

    class UserAdapter : RecyclerView.Adapter<UserAdapter.ViewHolder>() {
        var items = emptyList<User>()
            set(value) {
                field = value
                notifyDataSetChanged()
            }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.view.layout.userNameTextView.text = items[position].name
            holder.view.layout.followerNumberTextView.text = items[position].numberOfFollowers.toString()
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            return ViewHolder(UserItemView(parent.context))
        }

        override fun getItemCount(): Int {
            return items.size
        }

        class ViewHolder(val view: UserItemView) : RecyclerView.ViewHolder(view)

        class UserItemView(context: Context) : _LinearLayout(context) {
            val layout = UserItemLayout().inflate(this)

            class UserItemLayout : AnkoComponent<UserItemView> {
                var userNameTextView: TextView by ViewDelegate(); private set
                var followerNumberTextView: TextView by ViewDelegate(); private set

                override fun createView(ui: AnkoContext<UserItemView>): View {
                    return ui.render(GlobalStyles.Container) {
                        lparams {
                            width = matchParent
                            topMargin = dimens._1x
                        }
                        elevation = dimens._1x.toFloat() / 2
                        backgroundColor = context.appTheme.primaryDark
                        userNameTextView = textView().lparams { weight = 1f }
                        followerNumberTextView = textView()
                    }
                }
            }
        }
    }
}

class SummaryLayout : AnkoComponent<SummaryView> {
    var recyclerView: RecyclerView by ViewDelegate(); private set

    override fun createView(ui: AnkoContext<SummaryView>): View {
        return ui.render {
            recyclerView {
                lparams {
                    width = matchParent
                    height = matchParent
                }
                recyclerView = this
            }
        }
    }
}

data class User(val name: String, val numberOfFollowers: Int, val avatar: UserAvatar)
data class UserAvatar(val url: String)
