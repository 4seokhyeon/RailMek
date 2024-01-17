package com.subway.railmek.data

data class SubwayArrivalInfo(
    val subwayId: String,
    val updnLine: String,
    val trainLineNm: String,
    val statnFid: String,
    val statnTid: String,
    val statnId: String,
    val statnNm: String,
    val trnsitCo: String,
    val ordkey: String,
    val subwayList: String,
    val statnList: String,
    val btrainSttus: String,
    val barvlDt: String,
    val btrainNo: String,
    val bstatnId: String,
    val bstatnNm: String,
    val recptnDt: String,
    val arvlMsg2: String,
    val arvlMsg3: String,
    val arvlCd: String  //도착 코드 역을 검색 or 마커 클릭하면 정보가 모두 뜨게 해야할거같음
)
