package com.example.my_first_app.backend.database.entities;

public class Tasa {
    public static class NAMES {
        public static String TABLE_NAME = "tab_tasa";

        public static String cod_tas = "cod_tas";
        public static String val_tas = "val_tas";
        public static String act_tas = "act_tas";
        public static String fec_tas = "fec_tas";
    }
    private int cod_tas;
    private double val_tas;
    private int act_tas;
    private Date fec_tas;
}

