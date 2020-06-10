package com.hunter.controlmantenimientocampo.Modelo;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import com.hunter.controlmantenimientocampo.BD.LocalBD;
import com.hunter.controlmantenimientocampo.BD.T_OrdenTrabajo;

import java.util.ArrayList;

public class M_OrdenTrabajo {


    private LocalBD localBD;
    private SQLiteDatabase sqLiteDatabase;

    public void insertarOrdenTrabajo(Context context, String ordTra_Id, String ordTra_NombreMaq, String ordTra_ModeloMaq, String ordTra_SerieMaq,
                                   String ordTra_SerieMot, String ordTra_Horometro, String ordTra_Observacion, String ordTra_SintomaFalEle, String ordTra_CausaFalEle,
                                   String ordTra_SolucionFalEle, String ordTra_SituacionSisEle, String ordTra_RepuestosEle, String ordTra_SintomaFalMec,
                                   String ordTra_CausaFalMec, String ordTra_SolucionFalMec, String ordTra_SituacionSisMec, String ordTra_RepuestosMecOt){

        localBD = new LocalBD(context);
        sqLiteDatabase = localBD.getWritableDatabase();
        String mensaje = "";

        try {
            sqLiteDatabase.execSQL(T_OrdenTrabajo.INSERT_OT(ordTra_Id, ordTra_NombreMaq, ordTra_ModeloMaq,ordTra_SerieMaq,ordTra_SerieMot, ordTra_Horometro,
                    ordTra_Observacion, ordTra_SintomaFalEle, ordTra_CausaFalEle, ordTra_SolucionFalEle, ordTra_SituacionSisEle, ordTra_RepuestosEle, ordTra_SintomaFalMec,
                    ordTra_CausaFalMec, ordTra_SolucionFalMec, ordTra_SituacionSisMec, ordTra_RepuestosMecOt));
        } catch (SQLiteException ex) {
            mensaje = "Error, no se puede guardar Órden de Trabajo";
        }finally {
            sqLiteDatabase.close();
            mensaje = "¡Registro guardado!";
        }

        Toast.makeText(context, mensaje, Toast.LENGTH_SHORT).show();
    }


    public void mostrarOrdenTrabajo(Context context, GridView gridView){
        Cursor registros = null;

        try {
            ArrayList<String> lista = new ArrayList<>();
            localBD = new LocalBD(context);
            sqLiteDatabase = localBD.getWritableDatabase();
            registros = sqLiteDatabase.rawQuery(T_OrdenTrabajo.SELECT_OT(), null);

            if(registros.moveToFirst()){
                do{
                    lista.add(registros.getString(0));
                    lista.add(registros.getString(1));
                    lista.add(registros.getString(2));
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




}
