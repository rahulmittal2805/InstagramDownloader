package com.example.instagramdownloader.model;

import java.io.Serializable;

public class Edges implements Serializable {

   private Node node;

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }
}
