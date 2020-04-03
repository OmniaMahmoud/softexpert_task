package com.example.softexpert_task.data.repositories;

import com.example.softexpert_task.listeners.OnResponseListener;

public interface CarRepository {
    public void getCars(int page, final OnResponseListener onGetCarsResponse);
}
