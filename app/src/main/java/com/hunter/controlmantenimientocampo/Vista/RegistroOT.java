package com.hunter.controlmantenimientocampo.Vista;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.hunter.controlmantenimientocampo.Entidad.E_DetalleOrdenTrabajo;
import com.hunter.controlmantenimientocampo.Modelo.M_DetalleOrdenTrabajo;
import com.hunter.controlmantenimientocampo.Modelo.M_OrdenTrabajo;
import com.hunter.controlmantenimientocampo.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class RegistroOT extends AppCompatActivity {

    public EditText txtNombreMaquinariaOT;
    public EditText txtModeloMaquinariaOT;
    public EditText txtSerieMaquinariaOT;
    public EditText txtSerieMotorOT;
    private EditText txtHorometroOT;
    private EditText txtObservacionOT;
    private Button btnSeleccionaMaquina;
    private Button btnAgregaElectrico;
    private Button btnAgregaMecanico;
    private Button btnAgregaSuministros;
    private Button btnGuardarOrdenTrabajo;
    private Button btnVolverMenuOT;

    //Datos de la orden de Trabajo
    public String ordTra_Id = "";
    public String nombreMaquina = "";
    public String modeloMaquina = "";
    public String serieMaquina = "";
    public String serieMotor= "";
    public String horometro = "";
    public String observacion = "";

    //Sistema Eléctrico
    public String sintomaFallaElectrico = "";
    public String causaFallaElectrico = "";
    public String solucionFallaElectrico = "";
    public String situacionSistemaElectrico = "";
    public String repuetosElectricoOt = "";

    //Sistema Mecánico
    public String sintomaFallaMecanico = "";
    public String causaFallaMecanico = "";
    public String solucionFallaMecanico = "";
    public String situacionSistemaMecanico= "";
    public String repuetosMecanicoOt = "";



    @Override
    public void onBackPressed() {
        vuelveMenu();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_ot);

        txtNombreMaquinariaOT = findViewById(R.id.txtNombreMaquinariaOT);
        txtModeloMaquinariaOT = findViewById(R.id.txtModeloMaquinariaOT);
        txtSerieMaquinariaOT = findViewById(R.id.txtSerieMaquinariaOT);
        txtSerieMotorOT = findViewById(R.id.txtSerieMotorOT);
        txtHorometroOT = findViewById(R.id.txtHorometroOT);
        txtObservacionOT = findViewById(R.id.txtObservacionOT);
        btnSeleccionaMaquina = findViewById(R.id.btnSeleccionaMaquina);
        btnAgregaElectrico = findViewById(R.id.btnAgregaElectrico);
        btnAgregaMecanico = findViewById(R.id.btnAgregaMecanico);
        btnAgregaSuministros = findViewById(R.id.btnAgregaSuministros);
        btnGuardarOrdenTrabajo = findViewById(R.id.btnGuardarOrdenTrabajo);
        btnVolverMenuOT = findViewById(R.id.btnVolverMenuOT);

        //Crea una ID unica
        ordTra_Id = fechaHora("yyyyMMddHHss");

        btnSeleccionaMaquina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BusquedaMaquinariaDialog dialog = new BusquedaMaquinariaDialog();
                //Se debe manejar con import android.app.DialogFragment;
                dialog.show(getFragmentManager(), "MAQUINARIA");
            }
        });


        btnAgregaElectrico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OtSistemaElectricoDialog dialog = new OtSistemaElectricoDialog();
                //Se debe manejar con import android.app.DialogFragment;
                dialog.show(getFragmentManager(), "ELECTRICO");
            }
        });

        btnAgregaMecanico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OtSistemaMecanicoDialog dialog = new OtSistemaMecanicoDialog();
                //Se debe manejar con import android.app.DialogFragment;
                dialog.show(getFragmentManager(), "MECANICO");
            }
        });

        btnAgregaSuministros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OtSuministrosDialog dialog = new OtSuministrosDialog();
                //Se debe manejar con import android.app.DialogFragment;
                dialog.show(getFragmentManager(), "SUMINISTROS");
            }
        });


        btnGuardarOrdenTrabajo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(RegistroOT.this);
                builder.setTitle("Mensaje de Confirmación");
                builder.setMessage("¿Desea guardar Órden de Trabajo?");
                builder.setPositiveButton("SI", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        guardarOrdenTrabajo();
                        guardarDetalleSuministrosOT();
                        vuelveMenu();
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


        btnVolverMenuOT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vuelveMenu();
            }
        });

    }


    void vuelveMenu(){
        Intent intent = new Intent(RegistroOT.this, ResumenOrdenTrabajo.class);
        startActivity(intent);
        RegistroOT.this.finish();
    }

    void guardarOrdenTrabajo(){
        M_OrdenTrabajo m_ordenTrabajo = new M_OrdenTrabajo();

        //TOMA DE VALORES
        //Datos de la orden de Trabajo
        nombreMaquina = txtNombreMaquinariaOT.getText().toString();
        modeloMaquina = txtModeloMaquinariaOT.getText().toString();
        serieMaquina = txtSerieMaquinariaOT.getText().toString();
        serieMotor= txtSerieMotorOT.getText().toString();
        horometro = txtHorometroOT.getText().toString();
        observacion = txtObservacionOT.getText().toString();

            m_ordenTrabajo.insertarOrdenTrabajo(RegistroOT.this, ordTra_Id, nombreMaquina, modeloMaquina, serieMaquina, serieMotor, horometro,
                    observacion, sintomaFallaElectrico, causaFallaElectrico, solucionFallaElectrico, situacionSistemaElectrico, repuetosElectricoOt,
                    sintomaFallaMecanico, causaFallaMecanico, solucionFallaMecanico, situacionSistemaMecanico, repuetosMecanicoOt);
    }

    void guardarDetalleSuministrosOT() {
        String nombreSuministro;
        String cantidadSuministro;
        String unidadMedidaSuministro;
        String cantidadUtilizadaSuministro;
        String observacionSuministro;

        for (int i = 0; i < VariableGlobal.listaSuministros.size(); i++){
            E_DetalleOrdenTrabajo e_detalleOrdenTrabajos = new E_DetalleOrdenTrabajo();
            e_detalleOrdenTrabajos = VariableGlobal.listaSuministros.get(i);
            nombreSuministro = e_detalleOrdenTrabajos.getDetOrdTra_NombreSuministro();
            cantidadSuministro = e_detalleOrdenTrabajos.getDetOrdTra_Cantidad();
            unidadMedidaSuministro = e_detalleOrdenTrabajos.getDetOrdTra_UnidadMedida();
            cantidadUtilizadaSuministro = e_detalleOrdenTrabajos.getDetOrdTra_CantidadUtilizada();
            observacionSuministro = e_detalleOrdenTrabajos.getDetOrdTra_ObservacionSuministro();
            M_DetalleOrdenTrabajo m_detalleOrdenTrabajo = new M_DetalleOrdenTrabajo();
            m_detalleOrdenTrabajo.insertarMaquinaria(RegistroOT.this, ordTra_Id, nombreSuministro, cantidadSuministro, unidadMedidaSuministro, cantidadUtilizadaSuministro, observacionSuministro);
        }

        VariableGlobal.listaSuministros.clear();

    }


    //"dd/MM/yyyy HH:mm:ss"
    private static String fechaHora(String formato){
        Calendar Cal = new GregorianCalendar();
        SimpleDateFormat df = new SimpleDateFormat(formato);
        return (df.format(Cal.getInstance().getTime()).toString());
    }

}
