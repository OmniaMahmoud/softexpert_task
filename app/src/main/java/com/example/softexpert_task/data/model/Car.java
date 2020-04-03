package com.example.softexpert_task.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Car {

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("brand")
    @Expose
    private String brand;

    @SerializedName("constractionYear")
    @Expose
    private String constructionYear;

    @SerializedName("isUsed")
    @Expose
    private boolean isUsed;

    @SerializedName("imageUrl")
    @Expose
    private String image;

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getConstructionYear() {
        return constructionYear;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public String getImage() {
        return image;
    }
}
