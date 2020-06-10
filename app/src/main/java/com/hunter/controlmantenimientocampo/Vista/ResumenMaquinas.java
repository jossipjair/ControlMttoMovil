package com.hunter.controlmantenimientocampo.Vista;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import com.hunter.controlmantenimientocampo.Modelo.M_Maquinaria;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ResumenMaquinas extends AppCompatActivity {


    private Button btnRegistraNuevaMaquinaria;
    private GridView gvResumenOt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.hunter.controlmantenimientocampo.R.layout.activity_resumen_maquinas);

        btnRegistraNuevaMaquinaria =  findViewById(com.hunter.controlmantenimientocampo.R.id.btnRegistraNuevaMaquinaria);
        gvResumenOt =  findViewById(com.hunter.controlmantenimientocampo.R.id.gvResumenOt);


        try {
            M_Maquinaria m_maquinaria = new M_Maquinaria();
            m_maquinaria.mostrarMaquinarias(ResumenMaquinas.this, gvResumenOt);
        }catch (Exception e){
            Toast.makeText(this, "Sin registros para mostrar", Toast.LENGTH_SHORT).show();
        }

        btnRegistraNuevaMaquinaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResumenMaquinas.this, Maquinaria.class);
                startActivity(intent);
                ResumenMaquinas.this.finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(ResumenMaquinas.this, MainActivity.class);
        startActivity(intent);
        ResumenMaquinas.this.finish();
    }




}
