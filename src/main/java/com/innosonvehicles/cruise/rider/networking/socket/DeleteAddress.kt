package com.innosonvehicles.cruise.rider.networking.socket

import com.innosonvehicles.cruise.common.networking.socket.interfaces.SocketRequest

class DeleteAddress(id: Int): SocketRequest() {
    init {
        this.params = arrayOf(id)
    }
}