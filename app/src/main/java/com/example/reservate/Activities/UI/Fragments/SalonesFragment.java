package com.example.reservate.Activities.UI.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.reservate.Adapters.Salones.SalonesAdapter;
import com.example.reservate.Models.Salonesitem;
import com.example.reservate.R;

import java.util.ArrayList;

public class SalonesFragment extends Fragment
{
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){

        View rootView= inflater.inflate(R.layout.fragment_salones,container,false);

        mRecyclerView = rootView.findViewById(R.id.recyclerView);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        ArrayList<Salonesitem> exampleList = new ArrayList<>();
        exampleList.add(new Salonesitem(R.drawable.barberia1,R.drawable.imagebarber, "Barber Shop Inverrs", "Colonia 1089"));
        exampleList.add(new Salonesitem(R.drawable.barberia2,R.drawable.barber2, "Spa New Age", "Guatemala 3232"));
        exampleList.add(new Salonesitem(R.drawable.barberia3,R.drawable.imagebarber, "Barber Daniels", "Colombia 3232"));

        exampleList.add(new Salonesitem(R.drawable.barberia1,R.drawable.imagebarber, "Barber Shop Inverrs", "Colonia 1089"));
        exampleList.add(new Salonesitem(R.drawable.barberia2,R.drawable.barber2, "Spa New Age", "Guatemala 3232"));
        exampleList.add(new Salonesitem(R.drawable.barberia3,R.drawable.imagebarber, "Barber Daniels", "Colombia 3232"));
        exampleList.add(new Salonesitem(R.drawable.barberia1,R.drawable.imagebarber, "Barber Shop Inverrs", "Colonia 1089"));
        exampleList.add(new Salonesitem(R.drawable.barberia2,R.drawable.barber2, "Spa New Age", "Guatemala 3232"));
        exampleList.add(new Salonesitem(R.drawable.barberia3,R.drawable.imagebarber, "Barber Daniels", "Colombia 3232"));
        exampleList.add(new Salonesitem(R.drawable.barberia1,R.drawable.imagebarber, "Barber Shop Inverrs", "Colonia 1089"));
        exampleList.add(new Salonesitem(R.drawable.barberia2,R.drawable.barber2, "Spa New Age", "Guatemala 3232"));
        exampleList.add(new Salonesitem(R.drawable.barberia3,R.drawable.imagebarber, "Barber Daniels", "Colombia 3232"));


        mAdapter = new SalonesAdapter(exampleList);


        mRecyclerView.setAdapter(mAdapter);

        return  rootView;

    }
}
