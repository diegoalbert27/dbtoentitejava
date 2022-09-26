package com.example.my_first_app.backend.database.entities;

public class Niveles {
    public static class NAMES {
        public static String TABLE_NAME = "niveles";

        public static String cod_niv = "cod_niv";
        public static String nom_niv = "nom_niv";
        public static String des_niv = "des_niv";
        public static String acc_niv = "acc_niv";
    }
    private int cod_niv;
    private String nom_niv;
    private String des_niv;
    private String acc_niv;
}

