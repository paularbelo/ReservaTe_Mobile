package com.example.reservate.Interfaces;

import com.example.reservate.Models.Sucursal;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataServiceSucursales {

    @GET("/Sucursales")
    Call<List<Sucursal>> GetAllSucursales();

}
