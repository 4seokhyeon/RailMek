package com.subway.railmek.retrofit

import com.subway.railmek.unit.Unit.API
import com.subway.railmek.unit.Unit.BASE_URL
import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object FullRouteInformation {
    val api: FullRouteInfoInterface get() = instance.create(FullRouteInfoInterface::class.java)

    private val instance: Retrofit
        get() {
            val httpClient = OkHttpClient.Builder().addInterceptor { chain ->
                val request: Request = chain.request()
                    .newBuilder()
                    .addHeader("Authorization", "$API")
                    .build()
                chain.proceed(request)
            }.build()

            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient)
                .build()
        }
}