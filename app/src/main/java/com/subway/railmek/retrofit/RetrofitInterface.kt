package com.subway.railmek.retrofit

import com.subway.railmek.data.SubwayInfo
import com.subway.railmek.unit.Unit.API
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitInterface {

    @GET("subwayRouteInfo")
    suspend fun getSubwayInfo(
        @Query("serviceKey") serviceKey: String = API,
        @Query("format") format: String ="json",
        @Query("lnCd") lnCd: String ="1",
        @Query("mreaWideCd") mreaWideCd: String ="01"
    ): SubwayInfo
}