package com.example.admin.dialogtest;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
            String[] itemArr={"박지민","전정국","김석진","김태형"};
            Button butDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butDialog=(Button)findViewById(R.id.but_dialog);
//지금 현재 클래스 즉 메인액티비티가 핸들러니까 this
        butDialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);

        dialog.setTitle("First Dialog");
        dialog.setIcon(R.mipmap.ic_launcher);
      //  dialog.setMessage("It is the place to write the message.");
/*        dialog.setItems(itemArr, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
//i가 박지민 김석진 얘네 받음.
                butDialog.setText(itemArr[i]);

            }
        });*/

        //라디오 버튼 목록
    /*    dialog.setSingleChoiceItems(itemArr,0,new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                butDialog.setText(itemArr[i]);

            }
        });*/
        //체크 박스 목록
//      선택 여부 배열
        //음성녹음 해둠
        boolean[] checkedItems={true,false,true,false};
        dialog.setMultiChoiceItems(itemArr, checkedItems, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i, boolean b){
                if(b)
                butDialog.setText(itemArr[i]);
            }
        });

        // dialog.setPositiveButton("OK",null);
        dialog.show();
    }
}








