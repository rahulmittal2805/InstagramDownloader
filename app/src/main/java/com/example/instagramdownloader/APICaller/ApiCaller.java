package com.example.instagramdownloader.APICaller;


import com.example.instagramdownloader.model.APIResponce;

import java.util.HashMap;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;


/**
 * Created by girnar
 */
public interface ApiCaller {


    @GET("/?__a=1")
    public void requestData(Callback<APIResponce> callback);

}
