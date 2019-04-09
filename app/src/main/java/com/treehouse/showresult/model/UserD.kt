package com.treehouse.showresult.model

data class UserDat(
    val address: Address,
    val company: Company,
    val email: String, // Rey.Padberg@karina.biz
    val id: String, // 10
    val name: String, // Clementina DuBuque
    val phone: String, // 024-648-3804
    val username: String, // Moriah.Stanton
    val website: String // ambrose.net
)

data class Company(
    val bs: String, // target end-to-end models
    val catchPhrase: String, // Centralized empowering task-force
    val name: String // Hoeger LLC
)

data class Address(
    val city: String, // Lebsackbury
    val geo: Geo,
    val street: String, // Kattie Turnpike
    val suite: String, // Suite 198
    val zipcode: String // 31428-2261
)

data class Geo(
    val lat: String, // -38.2386
    val lng: String // 57.2232
)