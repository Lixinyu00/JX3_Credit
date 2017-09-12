package com.lxy.jx3_credit.Bean;

import cn.bmob.v3.BmobObject;

/**
 * @author LiXinyu
 * @date 2017/9/11 15:06.
 */

public class UserAli extends BmobObject {
    private String ali;
    private User user;

    public String getAli() {
        return ali;
    }

    public void setAli(String ali) {
        this.ali = ali;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
