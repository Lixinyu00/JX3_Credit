package com.lxy.jx3_credit.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.lxy.jx3_credit.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Spinner spinner;
    private ArrayAdapter<String> arrayAdapter;
    private EditText editText;
    private Button button_search;
    private Button button_jubao;
    private String[] items;
    private String itemname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
        initListener();
    }

    private void initData() {
        items = getResources().getStringArray(R.array.spinner_item);
    }

    private void initView() {
        spinner = (Spinner) findViewById(R.id.spinner_main);
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setDropDownVerticalOffset(40);
        spinner.setAdapter(arrayAdapter);
        editText = (EditText) findViewById(R.id.edit_main);
        button_search = (Button) findViewById(R.id.button_search);
        button_jubao = (Button) findViewById(R.id.button_jubao);
    }

    private void initListener() {
        spinner.setOnItemSelectedListener(new MyItemListener());
        button_search.setOnClickListener(this);
        button_jubao.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_search:
                Intent intent=new Intent();
                Bundle bundle=new Bundle();
                bundle.putString("itemname",itemname);
                bundle.putString("content",editText.getText().toString());
                intent.putExtras(bundle);
                intent.setClass(MainActivity.this,SearchActivity.class);
                startActivity(intent);
                break;
            case R.id.button_jubao:
                break;
        }
    }

    private class MyItemListener implements AdapterView.OnItemSelectedListener {

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            itemname=items[position];
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
}
