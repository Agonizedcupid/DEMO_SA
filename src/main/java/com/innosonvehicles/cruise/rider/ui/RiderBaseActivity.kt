package com.innosonvehicles.cruise.rider.ui

import android.content.Intent
import android.os.Bundle
import com.innosonvehicles.cruise.common.components.BaseActivity
import com.innosonvehicles.cruise.common.models.Request
import com.innosonvehicles.cruise.common.networking.socket.interfaces.SocketNetworkDispatcher
import com.innosonvehicles.cruise.common.utils.TravelRepository
import com.innosonvehicles.cruise.common.utils.TravelRepository.get
import com.innosonvehicles.cruise.common.utils.TravelRepository.set
import com.innosonvehicles.cruise.rider.activities.splash.SplashActivity

abstract class RiderBaseActivity : BaseActivity() {
    var travel: Request?
        get() = get(this, TravelRepository.AppType.RIDER)
        protected set(request) {
            set(this, TravelRepository.AppType.RIDER, request!!)
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if(SocketNetworkDispatcher.instance.socket == null) {
            startActivity(Intent(this, SplashActivity::class.java))
            finish()
            return
        }
    }
}