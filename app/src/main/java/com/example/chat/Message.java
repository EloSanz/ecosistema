package com.example.chat;

public class Message {

    public static String SENT_BY_ME = "me";
    public static String SENT_BY_BOT = "bot";

    String massage;
    String sentBy;



    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public String getSentBy() {
        return sentBy;
    }

    public void setSentBy(String sentBy) {
        this.sentBy = sentBy;
    }


    public Message(String massage, String sentBy) {
        this.massage = massage;
        this.sentBy = sentBy;
    }



}

