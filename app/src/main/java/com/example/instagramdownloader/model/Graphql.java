package com.example.instagramdownloader.model;

import java.io.Serializable;

public class Graphql implements Serializable {

    public Shortcode_media getShortcode_media() {
        return shortcode_media;
    }

    public void setShortcode_media(Shortcode_media shortcode_media) {
        this.shortcode_media = shortcode_media;
    }

    Shortcode_media shortcode_media;
}
