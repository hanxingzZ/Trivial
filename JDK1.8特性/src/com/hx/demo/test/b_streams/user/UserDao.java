package com.hx.demo.test.b_streams.user;

import java.util.Map;

/**
 * Created by 林皓 on 2017/3/28 0028.
 */
public class UserDao {
    private Map<Long,User> userMap;

    public UserDao(Map<Long, User> userMap) {
        this.userMap = userMap;
    }

    public User getById(Long id){
        return userMap.get(id);
    }
}
