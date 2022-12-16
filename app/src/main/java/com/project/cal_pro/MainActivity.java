package com.project.cal_pro;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private String TAG = this.getClass().getName()+ " ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calpro_chatbox);

        Button chatboxB = (Button) findViewById(R.id.chatbox_send);
        EditText InputCB = (EditText) findViewById(R.id.chatbox_input);
        TextView MainCB = (TextView) findViewById(R.id.Chatbox);


        chatboxB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChatBox CB = new ChatBox();
                CB.sendMsg();
            }
        });

    }




}

