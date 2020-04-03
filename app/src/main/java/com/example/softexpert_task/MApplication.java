package com.example.softexpert_task;

import android.app.Application;
import android.content.Context;

import androidx.multidex.MultiDex;

import com.example.softexpert_task.api.ApiUrls;
import com.example.softexpert_task.api.ApiEndPointInterface;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MApplication extends Application {

    private static MApplication instance;
    private ApiEndPointInterface apiEndPointInterface;

    public MApplication() {
        instance = this;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static MApplication getInstance(){
        return instance;
    }


    public ApiEndPointInterface getApi(){
        if (apiEndPointInterface == null){
            setupApiEndPoint();
        }
        return apiEndPointInterface;
    }


    private void setupApiEndPoint(){
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(ApiUrls.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create());
        apiEndPointInterface = builder.build().create(ApiEndPointInterface.class);
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
