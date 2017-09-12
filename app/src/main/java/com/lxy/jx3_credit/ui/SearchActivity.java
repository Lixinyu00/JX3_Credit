package com.lxy.jx3_credit.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.lxy.jx3_credit.Bean.Comment;
import com.lxy.jx3_credit.Bean.User;
import com.lxy.jx3_credit.Bean.UserId;
import com.lxy.jx3_credit.Utils.BmobUtil;
import com.lxy.jx3_credit.confing.Confing;
import com.lxy.jx3_credit.R;

import java.util.List;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.datatype.BmobPointer;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;

/**
 * @author LiXinyu
 * @date 2017/9/6 15:19.
 */

public class SearchActivity extends Activity implements View.OnClickListener {

    private TextView textView;
    private Button button;
    private String itemname;
    private String content;
    private String s="";
    private User user;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Bmob.initialize(this, Confing.appid);
        initData();
        initView();
        initListener();
    }

    private void initData() {
        Bundle bundle = this.getIntent().getExtras();
        itemname = bundle.getString("itemname");
        content = bundle.getString("content");
    }

    private void initView() {
        textView = (TextView) findViewById(R.id.text);
        button = (Button) findViewById(R.id.btn_1);
    }

    private void initListener() {
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        BmobQuery<UserId> userquery=new BmobQuery<UserId>();
        userquery.addWhereEqualTo("id",content);
        userquery.findObjects(new FindListener<UserId>() {
            @Override
            public void done(List<UserId> list, BmobException e) {
                user=list.get(0).getUser();
                Log.e("44444", "done: "+user.getObjectId() );
                BmobQuery<Comment> query = new BmobQuery<Comment>();
                query.addWhereEqualTo("user", new BmobPointer(user));
                query.include("user");
                query.findObjects(new FindListener<Comment>() {
                    @Override
                    public void done(List<Comment> list, BmobException e) {
                        if (e == null) {
                            for (Comment comment : list) {
                                s+=comment.getComment() + "\n" + comment.getName() + comment.getUser().getCreatedAt();
                                textView.setText(s);
                            }
                        } else {
                            Log.e("456456", "done: " + e);
                        }
                    }
                });
            }
        });

    }
}
