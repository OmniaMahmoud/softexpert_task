package com.example.softexpert_task.listeners;

import retrofit2.Response;

public interface OnResponseListener {

    void onSuccess(Response response);

    void onFailure();

    void onServerError();

    void onValidationError(String errorMessage);

}
