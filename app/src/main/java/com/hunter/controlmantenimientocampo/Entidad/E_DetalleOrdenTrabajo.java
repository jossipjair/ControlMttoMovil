package com.hunter.controlmantenimientocampo.Entidad;

public class E_DetalleOrdenTrabajo {

    private String detOrdTra_Id;
    private String ordTra_Id;
    private String detOrdTra_NombreSuministro;
    private String detOrdTra_Cantidad;
    private String detOrdTra_UnidadMedida;
    private String detOrdTra_CantidadUtilizada;
    private String detOrdTra_ObservacionSuministro;

    public E_DetalleOrdenTrabajo() {
    }

    public E_DetalleOrdenTrabajo(String detOrdTra_Id, String ordTra_Id, String detOrdTra_NombreSuministro, String detOrdTra_Cantidad, String detOrdTra_UnidadMedida, String detOrdTra_CantidadUtilizada, String detOrdTra_ObservacionSuministro) {
        this.detOrdTra_Id = detOrdTra_Id;
        this.ordTra_Id = ordTra_Id;
        this.detOrdTra_NombreSuministro = detOrdTra_NombreSuministro;
        this.detOrdTra_Cantidad = detOrdTra_Cantidad;
        this.detOrdTra_UnidadMedida = detOrdTra_UnidadMedida;
        this.detOrdTra_CantidadUtilizada = detOrdTra_CantidadUtilizada;
        this.detOrdTra_ObservacionSuministro = detOrdTra_ObservacionSuministro;
    }

    public String getDetOrdTra_Id() {
        return detOrdTra_Id;
    }

    public void setDetOrdTra_Id(String detOrdTra_Id) {
        this.detOrdTra_Id = detOrdTra_Id;
    }

    public String getOrdTra_Id() {
        return ordTra_Id;
    }

    public void setOrdTra_Id(String ordTra_Id) {
        this.ordTra_Id = ordTra_Id;
    }

    public String getDetOrdTra_NombreSuministro() {
        return detOrdTra_NombreSuministro;
    }

    public void setDetOrdTra_NombreSuministro(String detOrdTra_NombreSuministro) {
        this.detOrdTra_NombreSuministro = detOrdTra_NombreSuministro;
    }

    public String getDetOrdTra_Cantidad() {
        return detOrdTra_Cantidad;
    }

    public void setDetOrdTra_Cantidad(String detOrdTra_Cantidad) {
        this.detOrdTra_Cantidad = detOrdTra_Cantidad;
    }

    public String getDetOrdTra_UnidadMedida() {
        return detOrdTra_UnidadMedida;
    }

    public void setDetOrdTra_UnidadMedida(String detOrdTra_UnidadMedida) {
        this.detOrdTra_UnidadMedida = detOrdTra_UnidadMedida;
    }

    public String getDetOrdTra_CantidadUtilizada() {
        return detOrdTra_CantidadUtilizada;
    }

    public void setDetOrdTra_CantidadUtilizada(String detOrdTra_CantidadUtilizada) {
        this.detOrdTra_CantidadUtilizada = detOrdTra_CantidadUtilizada;
    }

    public String getDetOrdTra_ObservacionSuministro() {
        return detOrdTra_ObservacionSuministro;
    }

    public void setDetOrdTra_ObservacionSuministro(String detOrdTra_ObservacionSuministro) {
        this.detOrdTra_ObservacionSuministro = detOrdTra_ObservacionSuministro;
    }
}
