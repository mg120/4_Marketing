package com.a4_marketing.model;

import com.google.gson.annotations.SerializedName;

public class HomeHeaderModel {

    @SerializedName("id")
    private int id;
    @SerializedName("title")
    private String title;

    // getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
