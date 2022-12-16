package com.project.cal_pro;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChatBox extends AppCompatActivity {

    private String TAG = this.getClass().getName()+ " ";

    private int chat_id;
    private String chat_txt;
    private String chat_history;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calpro_chatbox);
    }

    public ChatBox(){
        System.out.println(this.TAG+"Created");
    }

    public void sendMsg(){

        EditText InputCB = (EditText) findViewById(R.id.chatbox_input);
        TextView MainCB = (TextView) findViewById(R.id.Chatbox);
        String x = MainCB.getText().toString();
        System.out.println(TAG+" say text "+x+InputCB.getText());
        MainCB.setText(x+" "+InputCB.getText());
        InputCB.setText("");

    }
    public void deleteMsg(){

    }

    public int getChat_id(){
        return chat_id;
    }

    public String getChat_history() {
        return chat_history;
    }

    public String getChat_txt() {
        return chat_txt;
    }

    public void setChat_history(String chat_history) {
        this.chat_history = chat_history;
    }

    public void setChat_id(int chat_id) {
        this.chat_id = chat_id;
    }

    public void setChat_txt(String chat_txt) {
        this.chat_txt = chat_txt;
    }
}
