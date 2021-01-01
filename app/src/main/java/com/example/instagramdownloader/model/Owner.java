package com.example.instagramdownloader.model;

import java.io.Serializable;

public class Owner implements Serializable {

   private String username;
    private  String profile_pic_url;
    private  boolean is_private ;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProfile_pic_url() {
        return profile_pic_url;
    }

    public void setProfile_pic_url(String profile_pic_url) {
        this.profile_pic_url = profile_pic_url;
    }

    public boolean isIs_private() {
        return is_private;
    }

    public void setIs_private(boolean is_private) {
        this.is_private = is_private;
    }

    public boolean isHas_blocked_viewer() {
        return has_blocked_viewer;
    }

    public void setHas_blocked_viewer(boolean has_blocked_viewer) {
        this.has_blocked_viewer = has_blocked_viewer;
    }

    public boolean isFollowed_by_viewer() {
        return followed_by_viewer;
    }

    public void setFollowed_by_viewer(boolean followed_by_viewer) {
        this.followed_by_viewer = followed_by_viewer;
    }

    private  boolean  has_blocked_viewer;
    private  boolean  followed_by_viewer;
}
