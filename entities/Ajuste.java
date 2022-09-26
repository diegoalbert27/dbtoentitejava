package com.example.my_first_app.backend.database.entities;

public class Ajuste {
    public static class NAMES {
        public static String TABLE_NAME = "tab_ajuste";

        public static String cod_aju = "cod_aju";
        public static String fec_aju = "fec_aju";
        public static String obs_aju = "obs_aju";
        public static String usu_aju = "usu_aju";
        public static String alm_aju = "alm_aju";
    }
    private int cod_aju;
    private Date fec_aju;
    private String obs_aju;
    private String usu_aju;
    private int alm_aju;
}

