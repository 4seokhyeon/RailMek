package com.subway.railmek.retrofit

import com.subway.railmek.data.SubwayArrivalInfo
import com.subway.railmek.unit.Unit.API2
import retrofit2.http.GET
import retrofit2.http.Query

interface RealTimeInterface {

    @GET("realtimeStationArrival")
    suspend fun getRealtimeInfo(
        @Query("KEY") key: String = API2,
        @Query("TYPE") type: String = "json",
        @Query("SERVICE") service: String = "realtimeStationArrival",
        @Query("START_INDEX") startIndex: Int,
        @Query("END_INDEX") endIndex: Int,
        @Query("statnNm") statnNm: String
    ): SubwayArrivalInfo
}