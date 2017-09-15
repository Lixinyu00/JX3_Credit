package com.lxy.jx3_credit.Utils;

import com.lxy.jx3_credit.Bean.User;

import java.util.List;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;

/**
 * @author LiXinyu
 * @date 2017/9/11 17:20.
 */

public class BmobUtil<T> {

    private T user;

    public T getuser(String content){
        BmobQuery<T>  bmobQuery=new BmobQuery<T>();
        bmobQuery.addWhereEqualTo("id",content);
        bmobQuery.findObjects(new FindListener<T>() {
            @Override
            public void done(List<T> list, BmobException e) {
                user=list.get(0);
            }
        });
        return user;
    }
}
