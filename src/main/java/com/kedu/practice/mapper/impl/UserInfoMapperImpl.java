package com.kedu.practice.mapper.impl;

import com.kedu.practice.entity.UserInfo;
import com.kedu.practice.mapper.UserInfoMapper;
import org.springframework.stereotype.Component;

/**
 * @author liuzifeng
 * @date 2019/11/27
 */
@Component
public class UserInfoMapperImpl implements UserInfoMapper {

    @Override
    public UserInfo getById(int id) {
        UserInfo user = new UserInfo();
        user.setId(id);
        user.setName("Jacky");
        user.setAge(20);
        return user;
    }
}
