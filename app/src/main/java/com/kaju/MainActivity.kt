package com.kaju

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.kaju.login.LoginActivityViewModel
import com.kaju.model.UserData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val instanceViewModel by lazy { LoginActivityViewModel() }
    private val adapter = MainAdapter(listOf())
    private lateinit var mContext:Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mContext = this


        initObservers()
        recycler.adapter = adapter
        swipeRefresh.setOnRefreshListener {
            loadData(false) }
        loadData(true)

    }

    private fun loadData(isLoader: Boolean) {
        setProgressVisible(isLoader)
        instanceViewModel.getUserApiCall()
    }

    private fun initObservers() {
            instanceViewModel.requestUserData.observe(this, Observer {
                setProgressVisible(false)
                userData(it)
            })
            instanceViewModel.errorMess.observe(this, Observer {
                Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
                setProgressVisible(false)
            })
        }

    private fun userData(it: List<UserData>?) {
        adapter.items = it!!
        adapter.notifyDataSetChanged()
    }

    private fun setProgressVisible(isShown: Boolean) {
        swipeRefresh.isRefreshing = false
        progress.visible = isShown
    }

    private var View.visible
        get() = this.visibility == View.VISIBLE
        set(isVisible) = if (isVisible) this.visibility = View.VISIBLE else this.visibility = View.GONE
}