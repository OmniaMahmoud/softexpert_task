package com.example.softexpert_task.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.softexpert_task.data.model.Car;
import com.example.softexpert_task.databinding.ItemCarBinding;
import com.example.softexpert_task.view_holders.CarViewHolder;

import java.util.ArrayList;

public class CarsListAdapter extends RecyclerView.Adapter<CarViewHolder> {
    private Context context;
    private ArrayList<Car> cars;

    public CarsListAdapter(Context context, ArrayList<Car> cars) {
        this.context = context;
        this.cars = cars;
    }

    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemCarBinding binding = ItemCarBinding.inflate((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE));
        return new CarViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {
        holder.setData(cars.get(position));
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }
}
