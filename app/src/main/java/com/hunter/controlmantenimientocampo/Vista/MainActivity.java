package com.hunter.controlmantenimientocampo.Vista;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.ajts.androidmads.library.SQLiteToExcel;
import com.hunter.controlmantenimientocampo.R;

public class MainActivity extends AppCompatActivity {


    private ImageButton imbMaquinaria;
    private ImageButton imbRegistroOT;
    private ImageButton imbExportarExcel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imbMaquinaria = findViewById(R.id.imbMaquinaria);
        imbRegistroOT = findViewById(R.id.imbOrdenesTrabajo);
        imbExportarExcel = findViewById(R.id.imbExportarExcel);


        imbMaquinaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ResumenMaquinas.class);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });

        imbRegistroOT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ResumenOrdenTrabajo.class);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });

        imbExportarExcel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exportaExcel();
            }
        });

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Mensaje de Confirmación");
        builder.setMessage("¿Desea salir del aplicativo?");
        builder.setPositiveButton("SI", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                MainActivity.this.finish();
            }
        });
        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }


    private void exportaExcel() {


        try {
            SQLiteToExcel sqLiteToExcel = new SQLiteToExcel(MainActivity.this, "BdMttoAgricolaFdoParral_LOCAL");
       //     SQLiteToExcel sqLiteToExcel = new SQLiteToExcel(MainActivity.this, "BdMttoAgricolaFdoParral_LOCAL", "/sdcard/Music/");
            sqLiteToExcel.exportAllTables("Registro_Ordenes_Trabajo.xls", new SQLiteToExcel.ExportListener() {

                @Override
                public void onStart() {

                }

                @Override
                public void onCompleted(String filePath) {
                    Toast.makeText(MainActivity.this, "Exportado a Excel", Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this, "Ubicación de Excel en " + Environment.getExternalStorageDirectory().toString(), Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onError(Exception e) {
                    Toast.makeText(MainActivity.this, "Error al exportar", Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        } catch (Exception e) {
            Toast.makeText(this, "Sin datos que exportar", Toast.LENGTH_SHORT).show();
        }

    }

}
