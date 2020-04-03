package com.example.softexpert_task.data.repositories;

import android.util.Log;

import com.example.softexpert_task.MApplication;
import com.example.softexpert_task.api.ApiEndPointInterface;
import com.example.softexpert_task.data.model.responses.CarsResponse;
import com.example.softexpert_task.listeners.OnResponseListener;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NetworkCarRepository implements CarRepository {

    private final int SERVER_ERROR = 500;

    private ApiEndPointInterface apiEndPointInterface = MApplication.getInstance().getApi();

    @Override
    public void getCars(int page, final OnResponseListener onGetCarsResponse) {
        Call<CarsResponse> call = apiEndPointInterface.getCars(page);
        call.clone().enqueue(new Callback<CarsResponse>() {
            @Override
            public void onResponse(Call<CarsResponse> call, Response<CarsResponse> response) {
                if(response.body() != null){
                    onGetCarsResponse.onSuccess(response);
                }
                else if(response.code() == SERVER_ERROR){
                    onGetCarsResponse.onServerError();
                }
                else {
                    onGetCarsResponse.onFailure();
                }
            }

            @Override
            public void onFailure(Call<CarsResponse> call, Throwable t) {
                onGetCarsResponse.onFailure();
            }
        });
    }
}
