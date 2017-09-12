package com.lxy.jx3_credit.Bean;

import cn.bmob.v3.BmobObject;

/**
 * @author LiXinyu
 * @date 2017/9/11 14:55.
 */

public class User extends BmobObject{
    private String servername;

    public String getServername() {
        return servername;
    }

    public void setServername(String servername) {
        this.servername = servername;
    }
}
