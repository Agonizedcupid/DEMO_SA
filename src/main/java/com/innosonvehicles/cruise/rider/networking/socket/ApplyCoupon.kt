package com.innosonvehicles.cruise.rider.networking.socket

import com.innosonvehicles.cruise.common.networking.socket.interfaces.SocketRequest

class ApplyCoupon(code: String) : SocketRequest() {
    init {
        this.params = arrayOf(code)
    }
}