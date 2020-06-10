package com.hunter.controlmantenimientocampo.Modelo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.widget.Toast;

import com.hunter.controlmantenimientocampo.BD.LocalBD;
import com.hunter.controlmantenimientocampo.BD.T_DetalleOrdenTrabajo;

public class M_DetalleOrdenTrabajo {

    private LocalBD localBD;
    private SQLiteDatabase sqLiteDatabase;

    public void insertarMaquinaria(Context context,String ordTra_Id, String detOrdTra_NombreSuministro, String detOrdTra_Cantidad,
                                   String detOrdTra_UnidadMedida, String detOrdTra_CantidadUtilizada,
                                   String detOrdTra_ObservacionSuministro){

        localBD = new LocalBD(context);
        sqLiteDatabase = localBD.getWritableDatabase();
        String mensaje = "";

        try {
            sqLiteDatabase.execSQL(T_DetalleOrdenTrabajo.INSERT_DETALLE(ordTra_Id, detOrdTra_NombreSuministro, detOrdTra_Cantidad, detOrdTra_UnidadMedida, detOrdTra_CantidadUtilizada, detOrdTra_ObservacionSuministro));
        } catch (SQLiteException ex) {
            mensaje = "Error, no se puede guardar Suministros\n" + ex.getMessage();

        }finally {
            sqLiteDatabase.close();
            mensaje = "¡Registro guardado!";
        }

        Toast.makeText(context, mensaje, Toast.LENGTH_SHORT).show();
    }

}
