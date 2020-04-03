package com.example.softexpert_task.injection;

import com.example.softexpert_task.data.repositories.CarRepository;
import com.example.softexpert_task.data.repositories.NetworkCarRepository;

public class Injection {

    public static CarRepository provideCarRepository(){
        return new NetworkCarRepository();
    }

}
