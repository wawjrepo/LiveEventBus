package com.jeremyliao.lebapp

import com.jeremyliao.liveeventbus.LiveEventBus

class KotlinDemo {
    fun test() {
        LiveEventBus.get(LiveEventBusDemo.KEY_TEST_ACTIVE_LEVEL).post("xxx")
    }
}