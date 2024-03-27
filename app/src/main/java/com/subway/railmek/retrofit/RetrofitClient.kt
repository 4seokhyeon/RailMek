package com.subway.railme.home.subwayapi

import com.subway.railmek.unit.Unit.API1
import com.subway.railmek.unit.Unit.BASE_URL1
import com.tickaroo.tikxml.TikXml
import com.tickaroo.tikxml.retrofit.TikXmlConverterFactory
import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    val api: RetrofitInterface get() = instance.create(RetrofitInterface::class.java)

    private val instance: Retrofit
        get() {
            val httpClient = OkHttpClient.Builder().addInterceptor { chain ->
                val request: Request = chain.request()
                    .newBuilder()
                    .addHeader("Authorization",API1)
                    .build()
                chain.proceed(request)
            }.build()

            return Retrofit.Builder()
                .baseUrl(BASE_URL1)
                .client(httpClient)
                .addConverterFactory(TikXmlConverterFactory.create(TikXml.Builder().exceptionOnUnreadXml(false).build()))
                .build()
        }

}