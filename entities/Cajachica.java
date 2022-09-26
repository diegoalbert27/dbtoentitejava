package com.example.my_first_app.backend.database.entities;

public class Cajachica {
    public static class NAMES {
        public static String TABLE_NAME = "tab_cajachica";

        public static String cod_chi = "cod_chi";
        public static String tip_chi = "tip_chi";
        public static String mot_chi = "mot_chi";
        public static String fec_chi = "fec_chi";
        public static String mon_chi = "mon_chi";
        public static String doc_chi = "doc_chi";
        public static String usu_chi = "usu_chi";
    }
    private int cod_chi;
    private String tip_chi;
    private String mot_chi;
    private Date fec_chi;
    private double mon_chi;
    private String doc_chi;
    private int usu_chi;
}

