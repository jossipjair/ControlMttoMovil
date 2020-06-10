package com.hunter.controlmantenimientocampo.BD;

public class T_Maquinaria {

    //TABLA
    private static final String TABLA = "Maquinaria";

    private static final String MAQ_ID = "Maq_Id";
    private static final String MAQ_DESCRIPCION = "Maq_Descripcion";
    private static final String MAQ_MODELO = "Maq_Modelo";
    private static final String MAQ_SERIE = "Maq_Serie";
    private static final String MAQ_SERIEMOT = "Maq_SerieMot";
    private static final String MAQ_ANIOFAB = "Maq_AnioFab";

    public static final String CREATE_TABLE = "CREATE TABLE " + TABLA + "("
            + MAQ_ID + " INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,"
            + MAQ_DESCRIPCION + " TEXT NOT NULL,"
            + MAQ_MODELO + " TEXT, "
            + MAQ_SERIE + " TEXT,"
            + MAQ_SERIEMOT + " TEXT,"
            + MAQ_ANIOFAB + " TEXT, CONSTRAINT unk_DescripcionMaquina UNIQUE(Maq_Descripcion));";

    public static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLA + ";";

    public static final String INSERT_MAQUINARIA(String maq_Descripcion, String maq_Modelo, String maq_Serie, String maq_SerieMot, String maq_AnioFab){
        return "INSERT INTO " + TABLA + "(" +  MAQ_DESCRIPCION + "," + MAQ_MODELO + "," + MAQ_SERIE + "," + MAQ_SERIEMOT + "," + MAQ_ANIOFAB + ") VALUES('"
                + maq_Descripcion + "','" + maq_Modelo + "','" + maq_Serie + "','" + maq_SerieMot + "','" + maq_AnioFab + "');";
    }

    public static final String SELECT_MAQUINARIA(){
        return "SELECT Maq_Id, Maq_Descripcion, Maq_Modelo, Maq_Serie, Maq_SerieMot, Maq_AnioFab FROM " + TABLA + ";";
    }

    public static final String SELECT_MAQUINARIA_RESUMEN(){
        return "SELECT Maq_Id, Maq_Descripcion FROM " + TABLA + " ORDER BY Maq_Id;";
    }

    public static final String SELECT_LISTVIEW(String descripcionMaquina){
        return "SELECT Maq_Descripcion FROM " + TABLA + " WHERE " + MAQ_DESCRIPCION + " LIKE '%" + descripcionMaquina + "%' ORDER BY Maq_Id;";
    }

    public static final String SELECT_BUSQUEDA_MAQUINARIA(String descripcionMaquina){
        return "SELECT Maq_Descripcion, Maq_Modelo, Maq_Serie, Maq_SerieMot FROM " + TABLA + " WHERE Maq_Descripcion ='" + descripcionMaquina + "';";
    }


}
