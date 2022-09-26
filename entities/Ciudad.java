package com.example.my_first_app.backend.database.entities;

public class Ciudad {
    public static class NAMES {
        public static String TABLE_NAME = "tab_ciudad";

        public static String cod_ciu = "cod_ciu";
        public static String est_ciu = "est_ciu";
        public static String nom_ciu = "nom_ciu";
    }
    private int cod_ciu;
    private int est_ciu;
    private String nom_ciu;
}

