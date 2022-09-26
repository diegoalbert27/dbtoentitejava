package com.example.my_first_app.backend.database.entities;

public class Reglas {
    public static class NAMES {
        public static String TABLE_NAME = "tab_reglas";

        public static String cod_reg = "cod_reg";
        public static String mod_reg = "mod_reg";
        public static String por_reg = "por_reg";
        public static String sig_reg = "sig_reg";
        public static String val_reg = "val_reg";
        public static String asi_reg = "asi_reg";
    }
    private int cod_reg;
    private int mod_reg;
    private double por_reg;
    private String sig_reg;
    private double val_reg;
    private int asi_reg;
}

