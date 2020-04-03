package com.example.softexpert_task.ui.cars_list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.example.softexpert_task.R;
import com.example.softexpert_task.data.model.Car;
import com.example.softexpert_task.databinding.ActivityCarsListBinding;

import java.util.ArrayList;

public class CarsListActivity extends AppCompatActivity {
    private ActivityCarsListBinding binding;
    private CarsListViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCarsListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        viewModel = new ViewModelProvider(this).get(CarsListViewModel.class);
        viewModel.getDataFromRepository();
        viewModel.getCarsData().observe(this, new Observer<ArrayList<Car>>() {
            @Override
            public void onChanged(ArrayList<Car> cars) {

            }
        });

    }
}
