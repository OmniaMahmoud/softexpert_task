package com.example.softexpert_task.ui.cars_list;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.softexpert_task.data.model.Car;
import com.example.softexpert_task.data.model.responses.CarsResponse;
import com.example.softexpert_task.data.repositories.CarRepository;
import com.example.softexpert_task.injection.Injection;
import com.example.softexpert_task.listeners.OnResponseListener;

import java.util.ArrayList;

import retrofit2.Response;

public class CarsListViewModel extends ViewModel {
    private CarRepository repository = Injection.provideCarRepository();

    private int page = 0;
    private ArrayList<Car> carsList = new ArrayList<>() ;
    private MutableLiveData<ArrayList<Car>> carsData = new MutableLiveData<>(carsList);

    public MutableLiveData<ArrayList<Car>> getCarsData() {
        return carsData;
    }

    public void getDataFromRepository(){
        repository.getCars(page, new OnResponseListener() {
            @Override
            public void onSuccess(Response response) {
                carsList.addAll(((CarsResponse)response.body()).getCars());
                carsData.setValue(carsList);
            }

            @Override
            public void onFailure() {

            }

            @Override
            public void onServerError() {

            }

            @Override
            public void onValidationError(String errorMessage) {

            }
        });
    }

}
