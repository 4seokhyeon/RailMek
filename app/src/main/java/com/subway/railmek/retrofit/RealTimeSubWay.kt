package com.subway.railmek.retrofit

import androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion.instance
import com.subway.railmek.unit.Unit.API2
import com.subway.railmek.unit.Unit.BASE_URL_REALTIME
import okhttp3.OkHttp
import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RealTimeSubWay {

    val api2: RealTimeInterface get()= instance.create(RealTimeInterface::class.java)

    private val instance:Retrofit
        get(){
            val httpClient = OkHttpClient.Builder().addInterceptor{chain ->
                val request:Request =chain.request()
                    .newBuilder()
                    .addHeader("RealTime","$API2")
                    .build()
                chain.proceed(request)
            }.build()

            return Retrofit.Builder()
                .baseUrl(BASE_URL_REALTIME)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient)
                .build()
        }
}