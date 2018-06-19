package com.aaron.account.resources

import com.aaron.account.api.UserResource
import com.aaron.account.api.pojo.User
import com.aaron.account.service.UserService
import com.aaron.common.api.pojo.Result
import com.aaron.common.web.RestResource
import org.springframework.beans.factory.annotation.Autowired

/**
 * Created by Aaron Sheng on 2018/6/19.
 */
@RestResource
class UserResourceImpl @Autowired constructor(
        private val userService: UserService
): UserResource {
    override fun get(userId: Long): Result<User> {
        return Result(userService.getUser(userId))
    }
}