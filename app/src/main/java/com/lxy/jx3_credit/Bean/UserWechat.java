package com.lxy.jx3_credit.Bean;

import cn.bmob.v3.BmobObject;

/**
 * @author LiXinyu
 * @date 2017/9/11 15:07.
 */

public class UserWechat extends BmobObject {
    private String wechat;
    private User user;

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
