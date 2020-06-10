package com.hunter.controlmantenimientocampo.Entidad;

public class E_OrdenTrabajo {

    private String ordTra_Id;
    private String ordTra_NombreMaq;
    private String ordTra_ModeloMaq;
    private String ordTra_SerieMaq;
    private String ordTra_SerieMot;
    private String ordTra_Horometro;
    private String ordTra_Observacion;

    //Sistema Eléctrico
    private String ordTra_SintomaFalEle;// sintomaFallaElectrico;
    private String ordTra_CausaFalEle;// causaFallaElectrico;
    private String ordTra_SolucionFalEle; //solucionFallaElectrico;
    private String ordTra_SituacionSisEle; //situacionSistemaElectrico;
    private String ordTra_RepuestosEle; //repuetosElectricoOt;

    //Sistema Mecánico
    private String ordTra_SintomaFalMec; //sintomaFallaMecanico;
    private String ordTra_CausaFalMec;// causaFallaMecanico;
    private String ordTra_SolucionFalMec; //solucionFallaMecanico;
    private String ordTra_SituacionSisMec; //situacionSistemaMecanico;
    private String ordTra_RepuestosMecOt; //repuetosMecanicoOt;

    //Campos de Auditoria
    private String ordTra_Fecha;
    private String ordTra_FechaHora;
    private String ordTra_FechaHoraLog;
    private String ordTra_Hora;

    public E_OrdenTrabajo() {
    }

    public E_OrdenTrabajo(String ordTra_Id, String ordTra_NombreMaq, String ordTra_ModeloMaq, String ordTra_SerieMaq, String ordTra_SerieMot, String ordTra_Horometro, String ordTra_Observacion, String ordTra_SintomaFalEle, String ordTra_CausaFalEle, String ordTra_SolucionFalEle, String ordTra_SituacionSisEle, String ordTra_RepuestosEle, String ordTra_SintomaFalMec, String ordTra_CausaFalMec, String ordTra_SolucionFalMec, String ordTra_SituacionSisMec, String ordTra_RepuestosMecOt, String ordTra_Fecha, String ordTra_FechaHora, String ordTra_FechaHoraLog, String ordTra_Hora) {
        this.ordTra_Id = ordTra_Id;
        this.ordTra_NombreMaq = ordTra_NombreMaq;
        this.ordTra_ModeloMaq = ordTra_ModeloMaq;
        this.ordTra_SerieMaq = ordTra_SerieMaq;
        this.ordTra_SerieMot = ordTra_SerieMot;
        this.ordTra_Horometro = ordTra_Horometro;
        this.ordTra_Observacion = ordTra_Observacion;
        this.ordTra_SintomaFalEle = ordTra_SintomaFalEle;
        this.ordTra_CausaFalEle = ordTra_CausaFalEle;
        this.ordTra_SolucionFalEle = ordTra_SolucionFalEle;
        this.ordTra_SituacionSisEle = ordTra_SituacionSisEle;
        this.ordTra_RepuestosEle = ordTra_RepuestosEle;
        this.ordTra_SintomaFalMec = ordTra_SintomaFalMec;
        this.ordTra_CausaFalMec = ordTra_CausaFalMec;
        this.ordTra_SolucionFalMec = ordTra_SolucionFalMec;
        this.ordTra_SituacionSisMec = ordTra_SituacionSisMec;
        this.ordTra_RepuestosMecOt = ordTra_RepuestosMecOt;
        this.ordTra_Fecha = ordTra_Fecha;
        this.ordTra_FechaHora = ordTra_FechaHora;
        this.ordTra_FechaHoraLog = ordTra_FechaHoraLog;
        this.ordTra_Hora = ordTra_Hora;
    }

    public String getOrdTra_Id() {
        return ordTra_Id;
    }

    public void setOrdTra_Id(String ordTra_Id) {
        this.ordTra_Id = ordTra_Id;
    }

    public String getOrdTra_NombreMaq() {
        return ordTra_NombreMaq;
    }

    public void setOrdTra_NombreMaq(String ordTra_NombreMaq) {
        this.ordTra_NombreMaq = ordTra_NombreMaq;
    }

    public String getOrdTra_ModeloMaq() {
        return ordTra_ModeloMaq;
    }

    public void setOrdTra_ModeloMaq(String ordTra_ModeloMaq) {
        this.ordTra_ModeloMaq = ordTra_ModeloMaq;
    }

    public String getOrdTra_SerieMaq() {
        return ordTra_SerieMaq;
    }

    public void setOrdTra_SerieMaq(String ordTra_SerieMaq) {
        this.ordTra_SerieMaq = ordTra_SerieMaq;
    }

    public String getOrdTra_SerieMot() {
        return ordTra_SerieMot;
    }

    public void setOrdTra_SerieMot(String ordTra_SerieMot) {
        this.ordTra_SerieMot = ordTra_SerieMot;
    }

    public String getOrdTra_Horometro() {
        return ordTra_Horometro;
    }

    public void setOrdTra_Horometro(String ordTra_Horometro) {
        this.ordTra_Horometro = ordTra_Horometro;
    }

    public String getOrdTra_Observacion() {
        return ordTra_Observacion;
    }

    public void setOrdTra_Observacion(String ordTra_Observacion) {
        this.ordTra_Observacion = ordTra_Observacion;
    }

    public String getOrdTra_SintomaFalEle() {
        return ordTra_SintomaFalEle;
    }

    public void setOrdTra_SintomaFalEle(String ordTra_SintomaFalEle) {
        this.ordTra_SintomaFalEle = ordTra_SintomaFalEle;
    }

    public String getOrdTra_CausaFalEle() {
        return ordTra_CausaFalEle;
    }

    public void setOrdTra_CausaFalEle(String ordTra_CausaFalEle) {
        this.ordTra_CausaFalEle = ordTra_CausaFalEle;
    }

    public String getOrdTra_SolucionFalEle() {
        return ordTra_SolucionFalEle;
    }

    public void setOrdTra_SolucionFalEle(String ordTra_SolucionFalEle) {
        this.ordTra_SolucionFalEle = ordTra_SolucionFalEle;
    }

    public String getOrdTra_SituacionSisEle() {
        return ordTra_SituacionSisEle;
    }

    public void setOrdTra_SituacionSisEle(String ordTra_SituacionSisEle) {
        this.ordTra_SituacionSisEle = ordTra_SituacionSisEle;
    }

    public String getOrdTra_RepuestosEle() {
        return ordTra_RepuestosEle;
    }

    public void setOrdTra_RepuestosEle(String ordTra_RepuestosEle) {
        this.ordTra_RepuestosEle = ordTra_RepuestosEle;
    }

    public String getOrdTra_SintomaFalMec() {
        return ordTra_SintomaFalMec;
    }

    public void setOrdTra_SintomaFalMec(String ordTra_SintomaFalMec) {
        this.ordTra_SintomaFalMec = ordTra_SintomaFalMec;
    }

    public String getOrdTra_CausaFalMec() {
        return ordTra_CausaFalMec;
    }

    public void setOrdTra_CausaFalMec(String ordTra_CausaFalMec) {
        this.ordTra_CausaFalMec = ordTra_CausaFalMec;
    }

    public String getOrdTra_SolucionFalMec() {
        return ordTra_SolucionFalMec;
    }

    public void setOrdTra_SolucionFalMec(String ordTra_SolucionFalMec) {
        this.ordTra_SolucionFalMec = ordTra_SolucionFalMec;
    }

    public String getOrdTra_SituacionSisMec() {
        return ordTra_SituacionSisMec;
    }

    public void setOrdTra_SituacionSisMec(String ordTra_SituacionSisMec) {
        this.ordTra_SituacionSisMec = ordTra_SituacionSisMec;
    }

    public String getOrdTra_RepuestosMecOt() {
        return ordTra_RepuestosMecOt;
    }

    public void setOrdTra_RepuestosMecOt(String ordTra_RepuestosMecOt) {
        this.ordTra_RepuestosMecOt = ordTra_RepuestosMecOt;
    }

    public String getOrdTra_Fecha() {
        return ordTra_Fecha;
    }

    public void setOrdTra_Fecha(String ordTra_Fecha) {
        this.ordTra_Fecha = ordTra_Fecha;
    }

    public String getOrdTra_FechaHora() {
        return ordTra_FechaHora;
    }

    public void setOrdTra_FechaHora(String ordTra_FechaHora) {
        this.ordTra_FechaHora = ordTra_FechaHora;
    }

    public String getOrdTra_FechaHoraLog() {
        return ordTra_FechaHoraLog;
    }

    public void setOrdTra_FechaHoraLog(String ordTra_FechaHoraLog) {
        this.ordTra_FechaHoraLog = ordTra_FechaHoraLog;
    }

    public String getOrdTra_Hora() {
        return ordTra_Hora;
    }

    public void setOrdTra_Hora(String ordTra_Hora) {
        this.ordTra_Hora = ordTra_Hora;
    }
}
