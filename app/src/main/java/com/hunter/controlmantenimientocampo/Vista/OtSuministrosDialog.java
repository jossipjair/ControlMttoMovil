package com.hunter.controlmantenimientocampo.Vista;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.Toast;

import com.hunter.controlmantenimientocampo.Entidad.E_DetalleOrdenTrabajo;
import com.hunter.controlmantenimientocampo.R;

import java.util.ArrayList;

public class OtSuministrosDialog extends DialogFragment {

    private EditText txtTipoSuministro;
    private EditText txtCantidadSuministro;
    private EditText txtUnidadMedida;
    private EditText txtCantidadUtilizada;
    private EditText txtObservacion;
    private Button btnAgregarDetalleSuministro;
    private GridView gvSuministros;


    @Override
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if(dialog != null){
            int width = ViewGroup.LayoutParams.MATCH_PARENT;
            int heigth = ViewGroup.LayoutParams.MATCH_PARENT;
            dialog.getWindow().setLayout(width,heigth);
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.suministros_utilizados_ot, container,false);

        txtTipoSuministro = view.findViewById(R.id.txtTipoSuministro);
        txtCantidadSuministro = view.findViewById(R.id.txtCantidadSuministro);
        txtUnidadMedida = view.findViewById(R.id.txtUnidadMedida);
        txtCantidadUtilizada = view.findViewById(R.id.txtCantidadUtilizada);
        txtObservacion = view.findViewById(R.id.txtObservacion);
        btnAgregarDetalleSuministro = view.findViewById(R.id.btnAgregarDetalleSuministro);
        gvSuministros = view.findViewById(R.id.gvSuministros);

        llenarGridView();

        btnAgregarDetalleSuministro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!txtTipoSuministro.getText().toString().equals("") &&
                        !txtCantidadSuministro.getText().toString().equals("") &&
                        !txtUnidadMedida.getText().toString().equals("") &&
                        !txtCantidadUtilizada.getText().toString().equals("")){
                    llenarListaSuministros();
                    limpiar();
                    llenarGridView();
                }else{
                    Toast.makeText(((RegistroOT) getActivity()), "Se deben llenar todos los campos", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }

    void llenarListaSuministros(){

        E_DetalleOrdenTrabajo e_detalleOrdenTrabajo = new E_DetalleOrdenTrabajo();
        e_detalleOrdenTrabajo.setOrdTra_Id(((RegistroOT) getActivity()).ordTra_Id);
        e_detalleOrdenTrabajo.setDetOrdTra_NombreSuministro(txtTipoSuministro.getText().toString());
        e_detalleOrdenTrabajo.setDetOrdTra_Cantidad(txtCantidadSuministro.getText().toString());
        e_detalleOrdenTrabajo.setDetOrdTra_UnidadMedida(txtUnidadMedida.getText().toString());
        e_detalleOrdenTrabajo.setDetOrdTra_CantidadUtilizada(txtCantidadUtilizada.getText().toString());
        e_detalleOrdenTrabajo.setDetOrdTra_ObservacionSuministro(txtObservacion.getText().toString());
        VariableGlobal.listaSuministros.add(e_detalleOrdenTrabajo);
    }

    void llenarGridView(){
        ArrayAdapter adapter;
        ArrayList<String> lista = new ArrayList<>();

        for(int i = 0; i < VariableGlobal.listaSuministros.size(); i++){
            E_DetalleOrdenTrabajo e_detalleOrdenTrabajos = new E_DetalleOrdenTrabajo();
            e_detalleOrdenTrabajos = VariableGlobal.listaSuministros.get(i);
            lista.add(e_detalleOrdenTrabajos.getDetOrdTra_NombreSuministro());
            lista.add(e_detalleOrdenTrabajos.getDetOrdTra_Cantidad());
            lista.add(e_detalleOrdenTrabajos.getDetOrdTra_UnidadMedida());
        }

        adapter = new ArrayAdapter(((RegistroOT) getActivity()), android.R.layout.simple_list_item_1, lista);
        gvSuministros.setAdapter(adapter);
    }

    void limpiar(){
        txtTipoSuministro.setText("");
        txtCantidadSuministro.setText("");
        txtUnidadMedida.setText("");
        txtCantidadUtilizada.setText("");
        txtObservacion.setText("");
    }

}
