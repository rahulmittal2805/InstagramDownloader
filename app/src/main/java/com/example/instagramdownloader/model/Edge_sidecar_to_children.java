package com.example.instagramdownloader.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Edge_sidecar_to_children implements Serializable {

    private ArrayList<Edges> edges;

    public ArrayList<Edges> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<Edges> edges) {
        this.edges = edges;
    }
}
