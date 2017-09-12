package com.lxy.jx3_credit.Utils;

import com.lxy.jx3_credit.Bean.User;

import cn.bmob.v3.BmobQuery;

/**
 * @author LiXinyu
 * @date 2017/9/11 17:20.
 */

public class BmobUtil<T> {

    private static User user;

    public User getuser(T t){
        BmobQuery<T>  bmobQuery=new BmobQuery<T>();
        return user;
    }
}
