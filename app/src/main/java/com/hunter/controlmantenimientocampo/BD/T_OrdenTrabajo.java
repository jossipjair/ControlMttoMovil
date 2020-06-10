package com.hunter.controlmantenimientocampo.BD;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class T_OrdenTrabajo {

    private static final String TABLA = "OrdenTrabajo";

    private static final String ORDTRA_ID = "OrdTra_Id";
    private static final String ORDTRA_NOMBREMAQ = "Nombre_Maquinaria";
    private static final String ORDTRA_MODELOMAQ = "Modelo_Maquinaria";
    private static final String ORDTRA_SERIEMAQ = "Serie_Maquinaria";
    private static final String ORDTRA_SERIEMOT = "Serie_Motor_Maquinaria";
    private static final String ORDTRA_HOROMETRO = "Horometro_Maquinaria";
    private static final String ORDTRA_OBSERVACION = "Observacion_Orden_Trabajo";
    private static final String ORDTRA_SINTOMAFALELE = "Sintoma_Falla_Electrico";
    private static final String ORDTRA_CAUSAFALELE = "Causa_Falla_Electrico";
    private static final String ORDTRA_SOLUCIONFALELE = "Solucion_Falla_Electrico";
    private static final String ORDTRA_SITUACIONSISELE = "Situacion_Sistema_Electrico";
    private static final String ORDTRA_REPUESTOSELE = "Repuestos_Sistema_Electrico";
    private static final String ORDTRA_SINTOMAFALMEC = "Sintoma_Falla_Mecanico";
    private static final String ORDTRA_CAUSAFALMEC = "Causa_Falla_Mecanico";
    private static final String ORDTRA_SOLUCIONFALMEC = "Solucion_Falla_Mecanico";
    private static final String ORDTRA_SITUACIONSISMEC = "Situacion_Sistema_Mecanico";
    private static final String ORDTRA_REPUESTOSMECOT = "Repuestos_Sistema_Mecanico";
    private static final String ORDTRA_FECHA = "Fecha_OrdenTrabajo";
    private static final String ORDTRA_FECHAHORA = "OrdTra_FechaHora";
    private static final String ORDTRA_FECHAHORALOG = "OrdTra_FechaHoraLog";
    private static final String ORDTRA_HORA = "OrdTra_Hora";

    /*

        private static final String ORDTRA_ID = "OrdTra_Id";
    private static final String ORDTRA_NOMBREMAQ = "OrdTra_NombreMaq";
    private static final String ORDTRA_MODELOMAQ = "OrdTra_ModeloMaq";
    private static final String ORDTRA_SERIEMAQ = "OrdTra_SerieMaq";
    private static final String ORDTRA_SERIEMOT = "OrdTra_SerieMot";
    private static final String ORDTRA_HOROMETRO = "OrdTra_Horometro";
    private static final String ORDTRA_OBSERVACION = "OrdTra_Observacion";
    private static final String ORDTRA_SINTOMAFALELE = "OrdTra_SintomaFalEle";
    private static final String ORDTRA_CAUSAFALELE = "OrdTra_CausaFalEle";
    private static final String ORDTRA_SOLUCIONFALELE = "OrdTra_SolucionFalEle";
    private static final String ORDTRA_SITUACIONSISELE = "OrdTra_SituacionSisEle";
    private static final String ORDTRA_REPUESTOSELE = "OrdTra_RepuestosEle";
    private static final String ORDTRA_SINTOMAFALMEC = "OrdTra_SintomaFalMec";
    private static final String ORDTRA_CAUSAFALMEC = "OrdTra_CausaFalMec";
    private static final String ORDTRA_SOLUCIONFALMEC = "OrdTra_SolucionFalMec";
    private static final String ORDTRA_SITUACIONSISMEC = "OrdTra_SituacionSisMec";
    private static final String ORDTRA_REPUESTOSMECOT = "OrdTra_RepuestosMecOt";
    private static final String ORDTRA_FECHA = "OrdTra_Fecha";
    private static final String ORDTRA_FECHAHORA = "OrdTra_FechaHora";
    private static final String ORDTRA_FECHAHORALOG = "OrdTra_FechaHoraLog";
    private static final String ORDTRA_HORA = "OrdTra_Hora";


     */


    public static final String CREATE_TABLE = "CREATE TABLE " + TABLA + "("
            + ORDTRA_ID + " TEXT PRIMARY KEY NOT NULL,"
            + ORDTRA_NOMBREMAQ + " TEXT NOT NULL,"
            + ORDTRA_MODELOMAQ + " TEXT, "
            + ORDTRA_SERIEMAQ + " TEXT,"
            + ORDTRA_SERIEMOT + " TEXT,"
            + ORDTRA_HOROMETRO + " TEXT,"
            + ORDTRA_OBSERVACION + " TEXT,"
            + ORDTRA_SINTOMAFALELE + " TEXT,"
            + ORDTRA_CAUSAFALELE + " TEXT,"
            + ORDTRA_SOLUCIONFALELE + " TEXT,"
            + ORDTRA_SITUACIONSISELE + " TEXT,"
            + ORDTRA_REPUESTOSELE + " TEXT,"
            + ORDTRA_SINTOMAFALMEC + " TEXT,"
            + ORDTRA_CAUSAFALMEC + " TEXT,"
            + ORDTRA_SOLUCIONFALMEC + " TEXT,"
            + ORDTRA_SITUACIONSISMEC + " TEXT,"
            + ORDTRA_REPUESTOSMECOT + " TEXT,"
            + ORDTRA_FECHA + " TEXT,"
            + ORDTRA_FECHAHORA + " TEXT,"
            + ORDTRA_FECHAHORALOG + " TEXT,"
            + ORDTRA_HORA + " TEXT);";


    public static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLA + ";";

    public static final String INSERT_OT(String ordTra_Id, String ordTra_NombreMaq, String ordTra_ModeloMaq,
                                         String ordTra_SerieMaq, String ordTra_SerieMot, String ordTra_Horometro,
                                         String ordTra_Observacion, String ordTra_SintomaFalEle, String ordTra_CausaFalEle, String ordTra_SolucionFalEle,
                                         String ordTra_SituacionSisEle, String ordTra_RepuestosEle, String ordTra_SintomaFalMec,
                                         String ordTra_CausaFalMec, String ordTra_SolucionFalMec, String ordTra_SituacionSisMec,
                                         String ordTra_RepuestosMecOt){
        return "INSERT INTO " + TABLA + "(" + ORDTRA_ID + "," + ORDTRA_NOMBREMAQ + "," + ORDTRA_MODELOMAQ + "," + ORDTRA_SERIEMAQ + "," + ORDTRA_SERIEMOT + "," + ORDTRA_HOROMETRO
                + "," + ORDTRA_OBSERVACION + "," + ORDTRA_SINTOMAFALELE + "," + ORDTRA_CAUSAFALELE  + "," + ORDTRA_SOLUCIONFALELE + "," + ORDTRA_SITUACIONSISELE
                + "," + ORDTRA_REPUESTOSELE + "," + ORDTRA_SINTOMAFALMEC + "," + ORDTRA_CAUSAFALMEC + "," + ORDTRA_SOLUCIONFALMEC
                + "," + ORDTRA_SITUACIONSISMEC + "," + ORDTRA_REPUESTOSMECOT + "," + ORDTRA_FECHA + "," + ORDTRA_FECHAHORA + "," + ORDTRA_FECHAHORALOG
                + "," + ORDTRA_HORA + ") VALUES('" + ordTra_Id + "','"  + ordTra_NombreMaq + "','" + ordTra_ModeloMaq + "','" + ordTra_SerieMaq + "','" + ordTra_SerieMot + "','"
                + ordTra_Horometro + "','" + ordTra_Observacion + "','" + ordTra_SintomaFalEle + "','" + ordTra_CausaFalEle + "','" +  ordTra_SolucionFalEle + "','" + ordTra_SituacionSisEle + "','"
                + ordTra_RepuestosEle + "','" + ordTra_SintomaFalMec + "','" + ordTra_CausaFalMec + "','" + ordTra_SolucionFalMec + "','" + ordTra_SituacionSisMec + "','"
                + ordTra_RepuestosMecOt + "','" + fechaHora("dd/MM/yyyy") + "','" + fechaHora("dd/MM/yyyy HH:mm:ss") + "','"
                + fechaHora("dd/MM/yyyy HH:mm:ss") + "','" + fechaHora("HH:mm:ss") + "');";
    }


    public static final String SELECT_OT(){
        return "SELECT " + ORDTRA_ID + "," + ORDTRA_NOMBREMAQ + "," + ORDTRA_FECHAHORA  + " FROM " + TABLA + " WHERE " + ORDTRA_FECHA + "='" + fechaHora("dd/MM/yyyy") + "' ORDER BY OrdTra_FechaHora;";
    }

    //"dd/MM/yyyy HH:mm:ss"
    private static String fechaHora(String formato){
        Calendar Cal = new GregorianCalendar();
        SimpleDateFormat df = new SimpleDateFormat(formato);
        return (df.format(Cal.getInstance().getTime()).toString());
    }

}
