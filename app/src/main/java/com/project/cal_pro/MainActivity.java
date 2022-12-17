package com.project.cal_pro;

import androidx.appcompat.app.AppCompatActivity;


import android.nfc.Tag;
import android.os.Bundle;
import android.telecom.Call;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.project.cal_pro.databinding.CalproChatboxPageBinding;
import com.project.cal_pro.ChatBox;

public class MainActivity extends AppCompatActivity {

    private String TAG = this.getClass().getName()+ " ";

    CalproChatboxPageBinding ccpbinding;
    //ccpbinding = CalproChatboxPageBinding.inflate(getLayoutInflater());

    public Button chatboxB = (Button) findViewById(R.id.chatbox_send);
    public EditText InputCB = (EditText) findViewById(R.id.chatbox_input);
    public TextView MainCB = (TextView) findViewById(R.id.Chatbox);

    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calpro_chatbox_page);

        chatboxB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ChatBox CB = new ChatBox();
                //CB.sendMsg();
                Call();
            }
        });

        InputCB.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View view, int keyCode, KeyEvent keyevent) {
                //If the keyevent is a key-down event on the "enter" button
                if ((keyevent.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    //Call();

                    ChatBox CB = new ChatBox();
                    CB.sendMsg();

                    return true;
                }
                return false;
            }
        });

    }

    public void Call(){


        EditText InputCB = (EditText) findViewById(R.id.chatbox_input);
        TextView MainCB = (TextView) findViewById(R.id.Chatbox);

        System.out.println(TAG +"Call ");
        StringBuilder temps = new StringBuilder();
        temps.append( MainCB.getText().toString() );
        temps.append("\n"+InputCB.getText());
        System.out.println(TAG+temps.toString());
        MainCB.setText(temps.toString());
        InputCB.setText("");
    }






}

