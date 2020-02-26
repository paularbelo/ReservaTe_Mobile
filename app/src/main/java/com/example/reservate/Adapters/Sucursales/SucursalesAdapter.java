package com.example.reservate.Adapters.Sucursales;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.reservate.Models.Salonesitem;
import com.example.reservate.Models.Sucursal;
import com.example.reservate.R;
import com.squareup.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SucursalesAdapter extends RecyclerView.Adapter<SucursalesAdapter.SucursalesViewHolder> {

    private List<Sucursal> ListSucursales;
    private Context context;

    public View mView;

    public SucursalesAdapter(List<Sucursal> listSucursales) {
        this.ListSucursales = listSucursales;
    }


    @NonNull
    @Override
    public SucursalesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        mView=LayoutInflater.from(parent.getContext()).inflate(R.layout.salones_item, parent, false);

        return new SucursalesViewHolder(mView);
    }



    @Override
    public void onBindViewHolder(@NonNull SucursalesViewHolder holder, int position) {

        Sucursal currentItem = ListSucursales.get(position);

        holder.direccion.setText(currentItem.getNombre());
        holder.direccion.setText(currentItem.getDireccion());

        Picasso.Builder builder= new Picasso.Builder(context);
        builder.downloader(new OkHttp3Downloader(context));
        builder.build().load(currentItem.getImage())
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
                .into(holder.Imagen);

    }

    @Override
    public int getItemCount() {
        return ListSucursales.size();
    }


    public class SucursalesViewHolder extends RecyclerView.ViewHolder{

        public ImageView Imagen;
        public TextView nombre;
        public TextView direccion;


        public SucursalesViewHolder( View itemView) {
            super(itemView);
            mView =itemView;

            Imagen = itemView.findViewById(R.id.image_sucursal);
            nombre = itemView.findViewById(R.id.txt_nombre);
            direccion = itemView.findViewById(R.id.txt_direccion);

        }
    }
}
