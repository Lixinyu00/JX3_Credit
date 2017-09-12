package com.lxy.jx3_credit.Bean;

import cn.bmob.v3.BmobObject;

/**
 * @author LiXinyu
 * @date 2017/9/11 15:05.
 */

public class UserId extends BmobObject{
    private String id;
    private User user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
