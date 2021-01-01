package com.example.instagramdownloader.model;

import java.io.Serializable;



public class Shortcode_media implements Serializable {

     String __typename;
    String id;
    String shortcode;
    String gating_info;
    String fact_check_overall_rating;
    String fact_check_information;
    String media_preview;
    private   Edge_media_to_caption edge_media_to_caption;
    private  Edge_sidecar_to_children edge_sidecar_to_children;
    String video_url;

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    private Owner owner;




    public String get__typename() {
        return __typename;
    }

    public void set__typename(String __typename) {
        this.__typename = __typename;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShortcode() {
        return shortcode;
    }

    public void setShortcode(String shortcode) {
        this.shortcode = shortcode;
    }

    public String getGating_info() {
        return gating_info;
    }

    public void setGating_info(String gating_info) {
        this.gating_info = gating_info;
    }

    public String getFact_check_overall_rating() {
        return fact_check_overall_rating;
    }

    public void setFact_check_overall_rating(String fact_check_overall_rating) {
        this.fact_check_overall_rating = fact_check_overall_rating;
    }

    public String getFact_check_information() {
        return fact_check_information;
    }

    public void setFact_check_information(String fact_check_information) {
        this.fact_check_information = fact_check_information;
    }

    public String getMedia_preview() {
        return media_preview;
    }

    public void setMedia_preview(String media_preview) {
        this.media_preview = media_preview;
    }

    public String getDisplay_url() {
        return display_url;
    }

    public void setDisplay_url(String display_url) {
        this.display_url = display_url;
    }

    String display_url;

    public Edge_media_to_caption getEdge_media_to_caption() {
        return edge_media_to_caption;
    }

    public void setEdge_media_to_caption(Edge_media_to_caption edge_media_to_caption) {
        this.edge_media_to_caption = edge_media_to_caption;
    }

    public Edge_sidecar_to_children getEdge_sidecar_to_children() {
        return edge_sidecar_to_children;
    }

    public void setEdge_sidecar_to_children(Edge_sidecar_to_children edge_sidecar_to_children) {
        this.edge_sidecar_to_children = edge_sidecar_to_children;
    }
}
