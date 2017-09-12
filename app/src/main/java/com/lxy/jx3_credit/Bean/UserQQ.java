package com.lxy.jx3_credit.Bean;

import cn.bmob.v3.BmobObject;

/**
 * @author LiXinyu
 * @date 2017/9/11 15:05.
 */

public class UserQQ extends BmobObject{
    private String qq;
    private User user;

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
