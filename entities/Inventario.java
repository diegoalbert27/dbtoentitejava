package com.example.my_first_app.backend.database.entities;

public class Inventario {
    public static class NAMES {
        public static String TABLE_NAME = "tab_inventario";

        public static String cod_inv = "cod_inv";
        public static String alm_inv = "alm_inv";
        public static String art_inv = "art_inv";
        public static String can_inv = "can_inv";
    }
    private int cod_inv;
    private int alm_inv;
    private String art_inv;
    private int can_inv;
}

