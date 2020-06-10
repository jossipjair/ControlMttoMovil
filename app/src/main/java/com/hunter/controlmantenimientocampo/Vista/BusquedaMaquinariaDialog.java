package com.hunter.controlmantenimientocampo.Vista;

import android.app.Dialog;
import android.os.Bundle;
import android.app.DialogFragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.hunter.controlmantenimientocampo.Entidad.E_Maquinaria;
import com.hunter.controlmantenimientocampo.Modelo.M_Maquinaria;
import com.hunter.controlmantenimientocampo.R;

public class BusquedaMaquinariaDialog extends DialogFragment {


    private ListView listaMaquinarias;
    private ArrayAdapter<String> adapter;
    private EditText txtBusquedaMaquinaria;

    @Override
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            int width = ViewGroup.LayoutParams.MATCH_PARENT;
            int height = ViewGroup.LayoutParams.MATCH_PARENT;
            dialog.getWindow().setLayout(width, height);
        }
    }

    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.buscar_maquinaria_dialog, container, false);
        listaMaquinarias = view.findViewById(R.id.listaMaquinarias);
        txtBusquedaMaquinaria = view.findViewById(R.id.txtBusquedaMaquinaria);

        llenarListView();

        listaMaquinarias.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                M_Maquinaria m_maquinaria = new M_Maquinaria();
                E_Maquinaria e_maquinaria = new E_Maquinaria();

                e_maquinaria = m_maquinaria.busquedaMaquinaria(BusquedaMaquinariaDialog.this.getActivity().getApplication(),String.valueOf(adapter.getItem(position)));
                ((RegistroOT) getActivity()).txtNombreMaquinariaOT.setText(e_maquinaria.getMaq_descripcion());
                ((RegistroOT) getActivity()).txtModeloMaquinariaOT.setText(e_maquinaria.getMaq_modelo());
                ((RegistroOT) getActivity()).txtSerieMaquinariaOT.setText(e_maquinaria.getMaq_serie());
                ((RegistroOT) getActivity()).txtSerieMotorOT.setText(e_maquinaria.getMaq_serieMot());

                getDialog().dismiss();
            }
        });


        txtBusquedaMaquinaria.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                llenarListView();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        return view;
    }

    private void llenarListView() {
        M_Maquinaria m_maquinaria = new M_Maquinaria();
        adapter = m_maquinaria.llenarListaMaquinariaDialog(BusquedaMaquinariaDialog.this.getActivity().getApplication(), listaMaquinarias, txtBusquedaMaquinaria.getText().toString());
    }

}
