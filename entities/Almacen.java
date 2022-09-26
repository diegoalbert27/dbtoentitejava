package com.example.my_first_app.backend.database.entities;

public class Almacen {
    public static class NAMES {
        public static String TABLE_NAME = "tab_almacen";

        public static String cod_alm = "cod_alm";
        public static String nom_alm = "nom_alm";
        public static String ubi_alm = "ubi_alm";
        public static String ven_alm = "ven_alm";
    }
    private int cod_alm;
    private String nom_alm;
    private String ubi_alm;
    private int ven_alm;
}

