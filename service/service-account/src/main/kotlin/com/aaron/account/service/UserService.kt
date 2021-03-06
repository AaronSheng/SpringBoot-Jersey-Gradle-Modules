package com.aaron.account.service

import com.aaron.account.api.pojo.User
import org.springframework.stereotype.Service

/**
 * Created by Aaron Sheng on 2018/6/19.
 */
@Service
class UserService {
    fun getUser(id: Long): User {
        return User(id)
    }
}