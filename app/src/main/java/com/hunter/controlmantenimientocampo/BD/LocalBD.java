package com.hunter.controlmantenimientocampo.BD;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class LocalBD extends SQLiteOpenHelper {

    private static final String baseDatosLocal = "BdMttoAgricolaFdoParral_LOCAL";
    private static final int versionBD = 1;

    public LocalBD(Context context) {
        super(context, baseDatosLocal, null, versionBD);
        this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(T_Maquinaria.CREATE_TABLE);
        db.execSQL(T_OrdenTrabajo.CREATE_TABLE);
        db.execSQL(T_DetalleOrdenTrabajo.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(T_Maquinaria.DROP_TABLE);
        db.execSQL(T_OrdenTrabajo.DROP_TABLE);
        db.execSQL(T_DetalleOrdenTrabajo.DROP_TABLE);
        onCreate(db);
    }
}
