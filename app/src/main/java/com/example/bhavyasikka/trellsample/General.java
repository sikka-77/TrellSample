package com.example.bhavyasikka.trellsample;

public class General {

    private int mthumbnail;
    private String mtext;
    public General()
    {

    }

    public General(String text){
        mtext=text;
    }
    public General(String text,int thumbnail)
    {
        mthumbnail=thumbnail;
        mtext=text;
    }

    public int getThumbnail() {
        return mthumbnail;
    }

    public String getText(){
        return mtext;
    }

}
