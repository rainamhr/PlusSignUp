package com.study.plussignup;

import android.widget.TextView;

import com.google.gson.annotations.SerializedName;

/**
 * Created by $raina on $5/23/2017.
 */

public class Contact {

    @SerializedName("token_id")
    private String token_id;

    public String getToken_id() {
        return token_id;
    }

    public void setToken_id(String token_id) {
        this.token_id = token_id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    @SerializedName("personName")
    private String personName;


    @SerializedName("personEmail")
    private String personEmail;


    @SerializedName("photoURL")
    private String photoURL;



}

