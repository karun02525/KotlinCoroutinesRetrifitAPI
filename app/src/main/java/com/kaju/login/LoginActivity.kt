package com.kaju.login

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.kaju.R
import com.kaju.model.LoginModel
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity() {


    private val instanceViewModel by lazy { LoginActivityViewModel() }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        initObservers()
        instanceViewModel.getLoginApiCall("", "")


    }

    private fun initObservers() {
        instanceViewModel.requestLoginData.observe(this, Observer {
            progress.visibility=View.GONE
            successfullyLogin(it)
        })
        instanceViewModel.errorMess.observe(this, Observer {
            Toast.makeText(this,it,Toast.LENGTH_SHORT).show()
            progress.visibility=View.GONE

        })
    }

    private fun successfullyLogin(it: LoginModel?) {
        val name=it!!.name
        Toast.makeText(this@LoginActivity,name,Toast.LENGTH_SHORT).show()
    }

}
