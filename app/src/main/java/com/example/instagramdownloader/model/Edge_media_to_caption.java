package com.example.instagramdownloader.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Edge_media_to_caption implements Serializable {

    private ArrayList<Edges> edges;

    public ArrayList<Edges> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<Edges> edges) {
        this.edges = edges;
    }
}
