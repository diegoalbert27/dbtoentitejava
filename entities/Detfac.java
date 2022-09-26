package com.example.my_first_app.backend.database.entities;

public class Detfac {
    public static class NAMES {
        public static String TABLE_NAME = "tab_detfac";

        public static String cod_dfac = "cod_dfac";
        public static String fac_dfac = "fac_dfac";
        public static String art_dfac = "art_dfac";
        public static String can_dart = "can_dart";
        public static String pre_dfac = "pre_dfac";
        public static String ord_dfac = "ord_dfac";
        public static String ped_dfac = "ped_dfac";
    }
    private int cod_dfac;
    private int fac_dfac;
    private String art_dfac;
    private int can_dart;
    private double pre_dfac;
    private int ord_dfac;
    private String ped_dfac;
}

