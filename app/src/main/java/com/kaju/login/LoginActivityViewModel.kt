package com.kaju.login


import android.annotation.SuppressLint
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kaju.model.LoginModel
import com.kaju.model.UserData
import com.kaju.network.ApiStatus.isCheckAPIStatus
import com.kaju.network.RestClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.android.Main
import kotlinx.coroutines.launch


class LoginActivityViewModel : ViewModel() {

    val requestLoginData = MutableLiveData<LoginModel>()
    val requestUserData = MutableLiveData<List<UserData>>()
    val errorMess = MutableLiveData<String>()


    @SuppressLint("CheckResult")
    fun getLoginApiCall(mob: String, pass: String) {
        val paramObject = HashMap<String, String>()
        paramObject["mobile"] = "9945309440"
        paramObject["password"] = "05296877"
        paramObject["lang"] = "guj"
        paramObject["device_id"] = "fwbBfskQxCY"
        paramObject["version"] = "ios"
        paramObject["os"] = "1.2"

        /*GlobalScope.launch(Dispatchers.Main) {
            try {
            RestClient.webServices().doLoginAsync(paramObject).await().let {
                if (it.isSuccessful)
                    requestLoginData.value = it.body()!!.data
                else
                    errorMess.value=isCheckAPIStatus(it.code(),it.errorBody())
                }
            }
            catch (e:Exception){
               e.printStackTrace()
                errorMess.value="Internet not available!!"
            }
        }*/
        }



    @SuppressLint("CheckResult")
    fun getUserApiCall() {
        GlobalScope.launch(Dispatchers.Main) {
            try {
                RestClient.webServices().getUserAsync().await().let {
                    if (it.isSuccessful)
                        requestUserData.value = it.body()!!.data
                    else
                        errorMess.value=isCheckAPIStatus(it.code(),it.errorBody())
                }
            }
            catch (e:Exception){
                e.printStackTrace()
                errorMess.value="Internet not available!!"
            }
        }
    }

}