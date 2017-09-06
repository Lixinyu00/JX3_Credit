package com.lxy.jx3_credit;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * @author LiXinyu
 * @date 2017/9/6 15:19.
 */

public class SearchActivity extends Activity{

    private TextView textView;
    private String itemname;
    private String content;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        initData();
        initView();
        initListener();
    }

    private void initData() {
        Bundle bundle=this.getIntent().getExtras();
        itemname=bundle.getString("itemname");
        content=bundle.getString("content");
    }

    private void initView() {
        textView=(TextView)findViewById(R.id.text);
        textView.setText(itemname+"\n"+content);
    }

    private void initListener() {

    }
}
