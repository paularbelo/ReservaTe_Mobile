package com.example.reservate.Activities.UI.Home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.reservate.Activities.UI.Fragments.FragmentProfile;
import com.example.reservate.Activities.UI.Fragments.FragmentReservas;
import com.example.reservate.Activities.UI.Fragments.FramentHelp;
import com.example.reservate.Activities.UI.Fragments.SalonesFragment;
import com.example.reservate.R;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v7.widget.Toolbar toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer=findViewById(R.id.drawer_layout);
        NavigationView navView=findViewById(R.id.nav_view);
        navView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toogle=new ActionBarDrawerToggle(this,drawer,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.addDrawerListener(toogle);
        toogle.syncState();

        if(savedInstanceState==null){

            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new SalonesFragment()).commit();
            navView.setCheckedItem(R.id.nav_home);
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()){
            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new SalonesFragment()).commit();
                break;
        }
        switch (menuItem.getItemId()){
            case R.id.nav_profile:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new FragmentProfile()).commit();
                break;
        }
        switch (menuItem.getItemId()){
            case R.id.nav_reservas:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new FragmentReservas()).commit();
                break;
        }
        switch (menuItem.getItemId()){
            case R.id.nav_help:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new FramentHelp()).commit();
                break;
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
