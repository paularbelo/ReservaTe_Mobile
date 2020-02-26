package com.example.reservate.Models;

public class Servicio {

    private int id_servicio;
    private String nombre;
    private String descripcion;
    private double precio;
    private int image;

    public Servicio(int id,String name, String description,double price,int img) {
        id_servicio = id;
        nombre= name;
        descripcion = description;
        precio = price;
        image = img;
    }

    public Servicio(String name, int img) {
        nombre= name;
        image = img;
    }

    public String getnombre() {
        return nombre;
    }

    public String getdescripcion() {
        return descripcion;
    }

    public double getprecio() {
        return precio;
    }

    public int getimagen() {
        return image;
    }


}

