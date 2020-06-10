package com.hunter.controlmantenimientocampo.Vista;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.hunter.controlmantenimientocampo.R;

public class OtSistemaMecanicoDialog extends DialogFragment {

    private EditText txtSintomaFallaMecanicoOT;
    private EditText txtCausaFallaMecanicoOT;
    private EditText txtSolucionSistemaMecanicoOT;
    private EditText txtSituacionGeneralMecanicoOT;
    private EditText txtRepuestosMecanicoOT;
    private Button btnGuardarSistemaMecanico;

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

        View view = inflater.inflate(R.layout.sistema_mecanico_ot, container, false);

        txtSintomaFallaMecanicoOT = view.findViewById(R.id.txtSintomaFallaMecanicoOT);
        txtCausaFallaMecanicoOT = view.findViewById(R.id.txtCausaFallaMecanicoOT);
        txtSolucionSistemaMecanicoOT = view.findViewById(R.id.txtSolucionSistemaMecanicoOT);
        txtSituacionGeneralMecanicoOT = view.findViewById(R.id.txtSituacionGeneralMecanicoOT);
        txtRepuestosMecanicoOT = view.findViewById(R.id.txtRepuestosMecanicoOT);
        btnGuardarSistemaMecanico = view.findViewById(R.id.btnGuardarSistemaMecanico);

        traerDatosOt();

        btnGuardarSistemaMecanico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llenarDatosMecanico();
            }
        });

        return view;
    }

    void llenarDatosMecanico(){
        ((RegistroOT) getActivity()).sintomaFallaMecanico = txtSintomaFallaMecanicoOT.getText().toString();
        ((RegistroOT) getActivity()).causaFallaMecanico = txtCausaFallaMecanicoOT.getText().toString();
        ((RegistroOT) getActivity()).solucionFallaMecanico = txtSolucionSistemaMecanicoOT.getText().toString();
        ((RegistroOT) getActivity()).situacionSistemaMecanico = txtSituacionGeneralMecanicoOT.getText().toString();
        ((RegistroOT) getActivity()).repuetosMecanicoOt = txtRepuestosMecanicoOT.getText().toString();
        getDialog().dismiss();
    }

    void traerDatosOt(){
        txtSintomaFallaMecanicoOT.setText(((RegistroOT) getActivity()).sintomaFallaMecanico);
        txtCausaFallaMecanicoOT.setText(((RegistroOT) getActivity()).causaFallaMecanico);
        txtSolucionSistemaMecanicoOT.setText(((RegistroOT) getActivity()).solucionFallaMecanico);
        txtSituacionGeneralMecanicoOT.setText(((RegistroOT) getActivity()).situacionSistemaMecanico);
        txtRepuestosMecanicoOT.setText(((RegistroOT) getActivity()).repuetosMecanicoOt);
    }
}
