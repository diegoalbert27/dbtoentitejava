package com.example.my_first_app.backend.database.entities;

public class Detentrada {
    public static class NAMES {
        public static String TABLE_NAME = "tab_detentrada";

        public static String cod_detent = "cod_detent";
        public static String art_detent = "art_detent";
        public static String can_detent = "can_detent";
        public static String cos_detent = "cos_detent";
        public static String pre_detent = "pre_detent";
        public static String cod_entrada = "cod_entrada";
    }
    private int cod_detent;
    private String art_detent;
    private int can_detent;
    private double cos_detent;
    private double pre_detent;
    private int cod_entrada;
}

