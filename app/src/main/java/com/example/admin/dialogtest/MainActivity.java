package com.example.admin.dialogtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butDialog=(Button)findViewById(R.id.but_dialog);
//지금 현재 클래스 즉 메인액티비티가 핸들러니까 this
        butDialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
