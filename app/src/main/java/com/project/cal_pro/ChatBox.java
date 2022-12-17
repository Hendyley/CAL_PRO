package com.project.cal_pro;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

public class ChatBox extends MainActivity{

    private String TAG = this.getClass().getName()+ " ";

    private int chat_id;
    private String chat_txt;
    private String chat_history;


    public ChatBox(){
        System.out.println(this.TAG+"Created");
    }

    public void sendMsg(){

        StringBuilder temps = new StringBuilder();
        temps.append( MainCB.getText().toString() );
        temps.append("\n"+InputCB.getText());
        System.out.println(TAG+temps.toString());
        MainCB.setText(temps.toString());
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
