package com.subway.railme.home.domain.repository


import android.util.Log
import com.subway.railme.home.domain.model.ArrivalModel
import com.subway.railme.home.subwayapi.RetrofitClient
import com.subway.railmek.unit.Unit.API1
import java.lang.Exception

class SubwayRepositoryImpl(
    private val client: RetrofitClient
) : SubWayRepository {
    override suspend fun getSubwayInfo(statnNm:String): List<ArrivalModel> {
        val response = client.api.getSubway(API1, "xml", 0, 5, stationName= statnNm)
        val subwayInfoList = response.rows
        val result = response.result

        val infoResult =
            try {
                subwayInfoList?.map { infoItem ->
                    ArrivalModel(
                        subwayId = infoItem.subwayId,
                        trainLineNm = infoItem.trainLineNm,
                        statnId = infoItem.statnId,
                        statnNm = infoItem.statnNm,
                        btrainSttus = infoItem.btrainSttus,
                        barvlDt = infoItem.barvlDt
                    )
                } ?: emptyList() // Return an empty list if subwayInfoList is null
            } catch(e: Exception) {
                Log.e("sh", "getSearch $e")
                emptyList() // Return an empty list if an exception occurs
            }
        return infoResult
    }
}