package com.hunter.controlmantenimientocampo.Vista;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hunter.controlmantenimientocampo.Modelo.M_Maquinaria;
import com.hunter.controlmantenimientocampo.R;

public class Maquinaria extends AppCompatActivity {

    private EditText txtNombreMaquinaria;
    private EditText txtModeloMaquinaria;
    private EditText txtSerieMaquinaria;
    private EditText txtSerieMotor;
    private EditText txtAnioFabricacion;
    private Button btnGuardar;
    private Button btnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maquinaria);

        btnMenu = findViewById(R.id.btnVolverMenu);
        txtNombreMaquinaria = findViewById(R.id.txtNombreMaquinaria);
        txtModeloMaquinaria = findViewById(R.id.txtModeloMaquinaria);
        txtSerieMaquinaria = findViewById(R.id.txtSerieMaquinaria);
        txtSerieMotor = findViewById(R.id.txtSerieMotor);
        txtAnioFabricacion = findViewById(R.id.txtAnio);
        btnGuardar = findViewById(R.id.btnGuardar);


        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder = new AlertDialog.Builder(Maquinaria.this);
                builder.setTitle("Mensaje de Confirmación");
                builder.setMessage("¿Desea guardar registro?");
                builder.setPositiveButton("SI", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        M_Maquinaria m_maquinaria = new M_Maquinaria();
                        m_maquinaria.insertarMaquinaria(Maquinaria.this, txtNombreMaquinaria.getText().toString(), txtModeloMaquinaria.getText().toString(), txtSerieMaquinaria.getText().toString(), txtSerieMotor.getText().toString(), txtAnioFabricacion.getText().toString());

                        txtNombreMaquinaria.setText("");
                        txtModeloMaquinaria.setText("");
                        txtSerieMaquinaria.setText("");
                        txtSerieMotor.setText("");
                        txtAnioFabricacion.setText("");

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
        });



        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        vuelveMenu();
            }
        });

    }


    @Override
    public void onBackPressed() {
        vuelveMenu();
    }

    void vuelveMenu(){
        Intent intent = new Intent(Maquinaria.this, ResumenMaquinas.class);
        startActivity(intent);
        Maquinaria.this.finish();
    }
}
