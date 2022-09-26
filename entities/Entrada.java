package com.example.my_first_app.backend.database.entities;

public class Entrada {
    public static class NAMES {
        public static String TABLE_NAME = "tab_entrada";

        public static String cod_ent = "cod_ent";
        public static String fec_ent = "fec_ent";
        public static String fec_com = "fec_com";
        public static String tot_com = "tot_com";
        public static String prv_com = "prv_com";
        public static String num_com = "num_com";
        public static String cod_alm = "cod_alm";
        public static String usu_ent = "usu_ent";
    }
    private int cod_ent;
    private Date fec_ent;
    private Date fec_com;
    private double tot_com;
    private String prv_com;
    private String num_com;
    private int cod_alm;
    private int usu_ent;
}

