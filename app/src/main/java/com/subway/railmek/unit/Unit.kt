package com.subway.railmek.unit

import com.subway.railmek.BuildConfig

object Unit {
    const val API = BuildConfig.SubWay_Api_Key
    const val API2 = BuildConfig.SubWay_realtime_Key

    const val BASE_URL_REALTIME = "https://data.seoul.go.kr/dataList/OA-12764/A/1/datasetView.do"
    const val BASE_URL = "https://openapi.kric.go.kr/openapi/trainUseInfo/subwayRouteInfo"
}