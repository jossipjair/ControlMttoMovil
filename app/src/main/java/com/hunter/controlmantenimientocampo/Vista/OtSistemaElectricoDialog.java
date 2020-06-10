package com.hunter.controlmantenimientocampo.Vista;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.hunter.controlmantenimientocampo.R;

public class OtSistemaElectricoDialog extends DialogFragment {


    private EditText txtSintomaFallaElectricoOT;
    private EditText txtCausaFallaElectricoOT;
    private EditText txtSolucionSistemaElectricoOT;
    private EditText txtSituacionGeneralElectricoOT;
    private EditText txtRepuestosElectricoOT;
    private Button btnGuardarSistemaElectrico;
    //private Button btnCancelaSistemaElectrico;

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

        View view = inflater.inflate(R.layout.sistema_electrico_ot, container, false);

        txtSintomaFallaElectricoOT = view.findViewById(R.id.txtSintomaFallaElectricoOT);
        txtCausaFallaElectricoOT = view.findViewById(R.id.txtCausaFallaElectricoOT);
        txtSolucionSistemaElectricoOT = view.findViewById(R.id.txtSolucionSistemaElectricoOT);
        txtSituacionGeneralElectricoOT = view.findViewById(R.id.txtSituacionGeneralElectricoOT);
        txtRepuestosElectricoOT = view.findViewById(R.id.txtRepuestosElectricoOT);
        btnGuardarSistemaElectrico = view.findViewById(R.id.btnGuardarSistemaElectrico);

        traerDatosOt();

        btnGuardarSistemaElectrico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llenarDatosElectricos();
            }
        });

        return view;
    }


    void llenarDatosElectricos(){
        ((RegistroOT) getActivity()).sintomaFallaElectrico = txtSintomaFallaElectricoOT.getText().toString();
        ((RegistroOT) getActivity()).causaFallaElectrico = txtCausaFallaElectricoOT.getText().toString();
        ((RegistroOT) getActivity()).solucionFallaElectrico = txtSolucionSistemaElectricoOT.getText().toString();
        ((RegistroOT) getActivity()).situacionSistemaElectrico = txtSituacionGeneralElectricoOT.getText().toString();
        ((RegistroOT) getActivity()).repuetosElectricoOt = txtRepuestosElectricoOT.getText().toString();
        getDialog().dismiss();
    }

    void traerDatosOt(){
        txtSintomaFallaElectricoOT.setText(((RegistroOT) getActivity()).sintomaFallaElectrico);
        txtCausaFallaElectricoOT.setText(((RegistroOT) getActivity()).causaFallaElectrico);
        txtSolucionSistemaElectricoOT.setText(((RegistroOT) getActivity()).solucionFallaElectrico);
        txtSituacionGeneralElectricoOT.setText(((RegistroOT) getActivity()).situacionSistemaElectrico);
        txtRepuestosElectricoOT.setText(((RegistroOT) getActivity()).repuetosElectricoOt);
    }

}
