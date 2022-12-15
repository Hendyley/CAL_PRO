package com.project.cal_pro;

public class ChatBox {

    private int chat_id;
    private String chat_txt;
    private String chat_history;

    public void sendMsg(){

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
