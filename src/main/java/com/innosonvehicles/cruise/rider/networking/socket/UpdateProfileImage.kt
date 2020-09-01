package com.innosonvehicles.cruise.rider.networking.socket

import com.innosonvehicles.cruise.common.networking.socket.interfaces.SocketRequest

class UpdateProfileImage(data: ByteArray): SocketRequest() {
    init {
        this.params = arrayOf(data)
    }
}