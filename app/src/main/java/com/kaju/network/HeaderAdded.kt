package com.kaju.network
import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException


//This interceptor adds auth token to all request dynamically
class HeaderAdder : Interceptor {
    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder()
            .addHeader("Content-Type", "application/json")
            .addHeader("Accept", "application/json")
          //  .addHeader("lang", SharedPrefUtils.instance.checkLanguage!!)
            //.addHeader("Accept-Language", SharedPrefUtils.instance.checkLanguage!!)
           // .addHeader("app-version", BuildConfig.VERSION_NAME)
           // .addHeader("device-build", android.os.Build.MODEL)
           // .addHeader("Authorization", "Bearer " + SharedPrefUtils.instance.authToken!!)
          .build()
        return chain.proceed(request)
    }
}
