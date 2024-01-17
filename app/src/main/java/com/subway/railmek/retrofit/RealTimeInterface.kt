package com.subway.railmek.retrofit

import com.subway.railmek.data.SubwayArrivalInfo
import retrofit2.http.GET
import retrofit2.http.Query

interface RealTimeInterface {

    @GET("realtimeStationArrival")
    suspend fun getRealtimeInfo(
        @Query("KEY") key: String,
        @Query("TYPE") type: String,
        @Query("SERVICE") service: String,
        @Query("START_INDEX") startIndex: Int,
        @Query("END_INDEX") endIndex: Int,
        @Query("statnNm") statnNm: String
    ): SubwayArrivalInfo
}