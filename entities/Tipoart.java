package com.example.my_first_app.backend.database.entities;

public class Tipoart {
    public static class NAMES {
        public static String TABLE_NAME = "tab_tipoart";

        public static String cod_tip = "cod_tip";
        public static String nom_tip = "nom_tip";
        public static String inv_tip = "inv_tip";
        public static String ven_tip = "ven_tip";
        public static String iva_tip = "iva_tip";
    }
    private String cod_tip;
    private String nom_tip;
    private int inv_tip;
    private int ven_tip;
    private int iva_tip;
}

