package com.example.softexpert_task.data.model.responses;

import com.example.softexpert_task.data.model.Car;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class CarsResponse {

    @SerializedName("data")
    @Expose
    private ArrayList<Car> cars = new ArrayList<>();

    public ArrayList<Car> getCars() {
        return cars;
    }
}
