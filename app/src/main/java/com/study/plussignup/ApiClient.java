package com.study.plussignup;

import android.util.Log;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by $raina on $5/23/2017.
 */

public class ApiClient {
    public static final String BASE_URL="http://surajbhandari.com.np/myportfolio/";
    public static Retrofit retrofit = null;

    public static Retrofit getAPIclient(){

        if (retrofit==null){
            Log.e("retrofit","called");
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
            Log.e("Retrofita",retrofit+"");
        }

        return retrofit;
    }
}
