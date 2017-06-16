package com.study.plussignup;

import java.util.List;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

/**
 * Created by $raina on $5/23/2017.
 */

public interface ApiInterface {

    @GET("index.php/User/test_123")

    Call<Contact> getContact();

    @FormUrlEncoded
    @POST("index.php/User/test_123")
     Call<Contact> insertInfo(@Field("token_id") String token_id,
                                        @Field("personName") String personName,
                                        @Field("personEmail") String personEmail,
                                        @Field("photoURL") String photoURL);




    // Call<List<Contact>> getContact();
}
