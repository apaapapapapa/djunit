package com.example.djunit;

public class Sample {

    private String msg = null;

    public void setMsg(String msg){
        this.msg = msg;
    }

    public String getMsg() {

        if (msg != null && msg.isEmpty()) {
            return msg;
        } else {
            return "Hello!!";
        }
    }
}