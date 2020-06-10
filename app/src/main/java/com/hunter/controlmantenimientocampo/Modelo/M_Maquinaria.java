package com.hunter.controlmantenimientocampo.Modelo;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import com.hunter.controlmantenimientocampo.BD.LocalBD;
import com.hunter.controlmantenimientocampo.BD.T_Maquinaria;
import com.hunter.controlmantenimientocampo.Entidad.E_Maquinaria;

import java.util.ArrayList;

public class M_Maquinaria {

    private LocalBD localBD;
    private SQLiteDatabase sqLiteDatabase;

    public void insertarMaquinaria(Context context, String Maq_Descripcion, String Maq_Modelo, String Maq_Serie, String Maq_SerieMot, String Maq_AnioFab ){

        localBD = new LocalBD(context);
        sqLiteDatabase = localBD.getWritableDatabase();
        String mensaje = "";

        try {
            sqLiteDatabase.execSQL(T_Maquinaria.INSERT_MAQUINARIA(Maq_Descripcion, Maq_Modelo, Maq_Serie, Maq_SerieMot, Maq_AnioFab));
        } catch (SQLiteException ex) {
            mensaje = "Error, no se puede guardar maquinaria";
        }finally {
            sqLiteDatabase.close();
            mensaje = "¡Registro guardado!";
        }

        Toast.makeText(context, mensaje, Toast.LENGTH_SHORT).show();
    }

    public void mostrarMaquinarias(Context context, GridView gridView){
        Cursor registros = null;

        try {
            ArrayList<String> lista = new ArrayList<>();
            localBD = new LocalBD(context);
            sqLiteDatabase = localBD.getWritableDatabase();
            registros = sqLiteDatabase.rawQuery(T_Maquinaria.SELECT_MAQUINARIA_RESUMEN(), null);

            if(registros.moveToFirst()){
                do{
                    lista.add(registros.getString(0));
                    lista.add(registros.getString(1));
                }while (registros.moveToNext());
            }
            ArrayAdapter adapter;
            adapter = new ArrayAdapter(context, android.R.layout.simple_list_item_1, lista);
            gridView.setAdapter(adapter);

        }finally {
            if(registros != null){
                registros.close();
                sqLiteDatabase.close();
            }
        }
    }

    public ArrayAdapter<String> llenarListaMaquinariaDialog(Context context, ListView listView, String descripcionMaquina) {
        ArrayAdapter<String> arrayAdapter;
        Cursor registros = null;
        try{
            ArrayList<String> lista = new ArrayList<>();
            localBD = new LocalBD(context);
            sqLiteDatabase = localBD.getWritableDatabase();
            registros = sqLiteDatabase.rawQuery(T_Maquinaria.SELECT_LISTVIEW(descripcionMaquina), null);

            if (registros.moveToFirst()) {
                do {
                    lista.add(registros.getString(0));
                } while (registros.moveToNext());
            }
            arrayAdapter = new ArrayAdapter<>(context, android.R.layout.simple_list_item_1, lista);
            listView.setAdapter(arrayAdapter);
        }finally {
            if(registros != null){
                registros.close();
                sqLiteDatabase.close();
            }
        }

        return  arrayAdapter;
    }

    public E_Maquinaria busquedaMaquinaria(Context context, String descripcionMaquinaria){
        E_Maquinaria e_maquinaria = null;
        Cursor registros = null;

        try{
            localBD = new LocalBD(context);
            sqLiteDatabase = localBD.getWritableDatabase();
            registros = sqLiteDatabase.rawQuery(T_Maquinaria.SELECT_BUSQUEDA_MAQUINARIA(descripcionMaquinaria), null);
            if(registros.moveToFirst()){
                do {
                    e_maquinaria = new E_Maquinaria();
                    e_maquinaria.setMaq_descripcion(registros.getString(0));
                    e_maquinaria.setMaq_modelo(registros.getString(1));
                    e_maquinaria.setMaq_serie(registros.getString(2));
                    e_maquinaria.setMaq_serieMot(registros.getString(3));

                }while (registros.moveToNext());
            }
        }finally {
            if(registros != null){
                registros.close();
                sqLiteDatabase.close();
            }
        }
    return e_maquinaria;
    }

}
