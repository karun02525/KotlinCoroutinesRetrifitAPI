package com.kaju.network

import com.kaju.model.BaseResponseModel
import com.kaju.model.UserModel
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST


interface ApiService {


    /*@POST("/api/v1/login")
    fun doLoginAsync(@Body mobile: HashMap<String,String>?): Deferred<Response<BaseResponseModel>>
*/
    @GET("/api/authenticate/getall")
    fun getUserAsync(): Deferred<Response<UserModel>>


}