package com.example.my_first_app.backend.database.entities;

public class Patologias {
    public static class NAMES {
        public static String TABLE_NAME = "tab_patologias";

        public static String cod_pat = "cod_pat";
        public static String nom_pat = "nom_pat";
        public static String cat_pat = "cat_pat";
    }
    private int cod_pat;
    private String nom_pat;
    private int cat_pat;
}

