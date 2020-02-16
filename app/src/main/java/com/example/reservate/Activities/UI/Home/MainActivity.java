package com.example.reservate.Activities.UI.Home;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.reservate.R;
import com.example.reservate.Adapters.Salones.SalonesAdapter;
import com.example.reservate.Models.Salonesitem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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


        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new SalonesAdapter(exampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}
