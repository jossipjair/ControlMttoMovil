package com.hunter.controlmantenimientocampo.BD;

public class T_DetalleOrdenTrabajo {

    private static final String TABLA = "DetalleOrdenTrabajo";

    private static final String DETORDTRA_ID = "DetOrdTra_Id";
    private static final String ORDTRA_ID = "OrdTra_Id";
    private static final String DETORDTRA_NOMBRESUMINISTRO = "DetOrdTra_NombreSuministro";
    private static final String DETORDTRA_CANTIDAD = "DetOrdTra_Cantidad";
    private static final String DETORDTRA_UNIDADMEDIDA = "DetOrdTra_UnidadMedida";
    private static final String DETORDTRA_CANTIDADUTILIZADA = "DetOrdTra_CantidadUtilizada";
    private static final String DETORDTRA_OBSERVACIONSUMINISTRO = "DetOrdTra_ObservacionSuministro";

    public static final String CREATE_TABLE = "CREATE TABLE " + TABLA + "("
            + DETORDTRA_ID + " INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,"
            + ORDTRA_ID + " TEXT NOT NULL,"
            + DETORDTRA_NOMBRESUMINISTRO + " TEXT NOT NULL,"
            + DETORDTRA_CANTIDAD + " TEXT NOT NULL,"
            + DETORDTRA_UNIDADMEDIDA + " TEXT NOT NULL,"
            + DETORDTRA_CANTIDADUTILIZADA + " TEXT NOT NULL,"
            + DETORDTRA_OBSERVACIONSUMINISTRO + " TEXT NOT NULL);";

    public static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLA + ";";


    public static final String INSERT_DETALLE(String ordTra_Id, String detOrdTra_NombreSuministro, String detOrdTra_Cantidad,
                                              String detOrdTra_UnidadMedida, String detOrdTra_CantidadUtilizada,
                                              String detOrdTra_ObservacionSuministro){
        return "INSERT INTO " + TABLA + "(" + ORDTRA_ID + "," + DETORDTRA_NOMBRESUMINISTRO + "," + DETORDTRA_CANTIDAD + ","
                + DETORDTRA_UNIDADMEDIDA + "," + DETORDTRA_CANTIDADUTILIZADA + "," + DETORDTRA_OBSERVACIONSUMINISTRO +") VALUES('"
                + ordTra_Id + "','" + detOrdTra_NombreSuministro + "','" + detOrdTra_Cantidad + "','" + detOrdTra_UnidadMedida + "','"
                + detOrdTra_CantidadUtilizada + "','" + detOrdTra_ObservacionSuministro + "');";
    }

    public static final String SELECT_DETALLE(String ordTra_Id){
        return  "SELECT * FROM " + TABLA + " WHERE " + ORDTRA_ID + "='" + ordTra_Id + "';";
    }

}
