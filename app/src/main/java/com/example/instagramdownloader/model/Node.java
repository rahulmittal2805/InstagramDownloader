package com.example.instagramdownloader.model;

import java.io.Serializable;

public class Node implements Serializable {
    private  String text;
    private String display_url;

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    private String video_url;



    public String get__typename() {
        return __typename;
    }

    public void set__typename(String __typename) {
        this.__typename = __typename;
    }

    String  __typename;







    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public String getDisplay_url() {
        return display_url;
    }

    public void setDisplay_url(String display_url) {
        this.display_url = display_url;
    }
}
