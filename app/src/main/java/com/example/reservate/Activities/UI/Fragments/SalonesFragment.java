package com.example.reservate.Activities.UI.Fragments;


import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.reservate.Adapters.Sucursales.SucursalesAdapter;
import com.example.reservate.Interfaces.GetDataServiceSucursales;
import com.example.reservate.Models.Sucursal;
import com.example.reservate.Network.RetrofitClientInstance;
import com.example.reservate.R;

import java.util.ArrayList;
import java.util.List;

public class SalonesFragment extends Fragment
{
    private RecyclerView mRecyclerView;
    private SucursalesAdapter mAdapter;
    View rootView;



    public SalonesFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){

        rootView= inflater.inflate(R.layout.fragment_salones,container,false);

        mRecyclerView = rootView.findViewById(R.id.recyclerView);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        GetDataServiceSucursales service= RetrofitClientInstance.getRetofitInstance().create(GetDataServiceSucursales.class);

        Call<List<Sucursal>> call = service.GetAllSucursales();


        call.enqueue(new Callback<List<Sucursal>>() {
            @Override
            public void onResponse(Call<List<Sucursal>> call, Response<List<Sucursal>> response) {

                List<Sucursal> List=response.body();

                mRecyclerView.setAdapter(new SucursalesAdapter(List));

            }

            @Override
            public void onFailure(Call<List<Sucursal>> call, Throwable t) {

            }
        });

        return  rootView;
    }


}
