package com.hunter.controlmantenimientocampo.Vista;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.hunter.controlmantenimientocampo.Modelo.M_Maquinaria;
import com.hunter.controlmantenimientocampo.Modelo.M_OrdenTrabajo;
import com.hunter.controlmantenimientocampo.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ResumenOrdenTrabajo extends AppCompatActivity {

    private Button btnRegistrarNuevaOT;
    private GridView gvResumenOt;
    private TextView lblFechaOrdenTrabajo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen_orden_trabajo);

        btnRegistrarNuevaOT = findViewById(R.id.btnRegistrarNuevaOT);
        gvResumenOt = findViewById(R.id.gvResumenOt);
        lblFechaOrdenTrabajo = findViewById(R.id.lblFechaOrdenTrabajo);

        lblFechaOrdenTrabajo.setText("Fecha: " + fechaHora("dd/MM/yyyy"));

        try {
            M_OrdenTrabajo m_ordenTrabajo = new M_OrdenTrabajo();
            m_ordenTrabajo.mostrarOrdenTrabajo(ResumenOrdenTrabajo.this, gvResumenOt);
        }catch (Exception e){
            Toast.makeText(this, "Sin registros para mostrar", Toast.LENGTH_SHORT).show();
        }

        btnRegistrarNuevaOT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResumenOrdenTrabajo.this, RegistroOT.class);
                startActivity(intent);
                ResumenOrdenTrabajo.this.finish();
            }
        });


    }

    @Override
    public void onBackPressed() {
        vuelveMenu();
    }

    void vuelveMenu(){
        Intent intent = new Intent(ResumenOrdenTrabajo.this, MainActivity.class);
        startActivity(intent);
        ResumenOrdenTrabajo.this.finish();
    }


    //"dd/MM/yyyy HH:mm:ss"
    private static String fechaHora(String formato){
        Calendar Cal = new GregorianCalendar();
        SimpleDateFormat df = new SimpleDateFormat(formato);
        return (df.format(Cal.getInstance().getTime()).toString());
    }

}
