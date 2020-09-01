package com.innosonvehicles.cruise.rider.networking.http

import com.innosonvehicles.cruise.common.models.Rider
import com.innosonvehicles.cruise.common.networking.http.interfaces.HTTPRequest

class Login(fireBaseToken: String): HTTPRequest() {
    override val path: String = "rider/login"
    init {
        this.params = mapOf("token" to fireBaseToken)
    }
}

data class LoginResult(
    val token: String,
    val user: Rider
)