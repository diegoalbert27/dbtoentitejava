package com.example.my_first_app.backend.database.entities;

public class Laboratorios {
    public static class NAMES {
        public static String TABLE_NAME = "tab_laboratorios";

        public static String cod_lab = "cod_lab";
        public static String nom_lab = "nom_lab";
        public static String abr_lab = "abr_lab";
    }
    private int cod_lab;
    private String nom_lab;
    private String abr_lab;
}

