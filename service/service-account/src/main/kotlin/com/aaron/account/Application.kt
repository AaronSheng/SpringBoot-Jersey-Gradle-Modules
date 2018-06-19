package com.aaron.account

import com.aaron.common.service.MircoServiceApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Created by Aaron Sheng on 2018/6/19.
 */
@SpringBootApplication
class Application

fun main(args: Array<String>) {
    MircoServiceApplication.run(Application::class, args)
}