package com.project.cal_pro;

public class Notification {
    private int notification_id;
    private Notify_type notification_type;
    private String notification_header;
    private String notification_txt;
    private int notification_TTL;

    public void giveNotify(){

    }

    public void deleteNotify(){

    }

    public void acknowledge(){

    }

    public int getNotification_id() {
        return notification_id;
    }

    public int getNotification_TTL() {
        return notification_TTL;
    }

    public Notify_type getNotification_type() {
        return notification_type;
    }

    public String getNotification_header() {
        return notification_header;
    }

    public String getNotification_txt() {
        return notification_txt;
    }

    public void setNotification_header(String notification_header) {
        this.notification_header = notification_header;
    }

    public void setNotification_id(int notification_id) {
        this.notification_id = notification_id;
    }

    public void setNotification_TTL(int notification_TTL) {
        this.notification_TTL = notification_TTL;
    }

    public void setNotification_txt(String notification_txt) {
        this.notification_txt = notification_txt;
    }

    public void setNotification_type(Notify_type notification_type) {
        this.notification_type = notification_type;
    }
}
