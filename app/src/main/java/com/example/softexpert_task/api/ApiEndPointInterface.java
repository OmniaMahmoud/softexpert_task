package com.example.softexpert_task.api;

import com.example.softexpert_task.data.model.responses.CarsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiEndPointInterface {

    @GET(ApiUrls.GET_CARS+ "/{page}")
    Call<CarsResponse> getCars(@Query("page") int page);
}
