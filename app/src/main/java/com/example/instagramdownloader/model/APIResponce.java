package com.example.instagramdownloader.model;

import java.io.Serializable;

public class APIResponce implements Serializable {
    public Graphql getGraphql() {
        return graphql;
    }

    public void setGraphql(Graphql graphql) {
        this.graphql = graphql;
    }

    Graphql graphql;


}
