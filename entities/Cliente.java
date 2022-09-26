package com.example.my_first_app.backend.database.entities;

public class Cliente {
    public static class NAMES {
        public static String TABLE_NAME = "tab_cliente";

        public static String cod_cli = "cod_cli";
        public static String nac_cli = "nac_cli";
        public static String ced_cli = "ced_cli";
        public static String nom_cli = "nom_cli";
        public static String ape_cli = "ape_cli";
        public static String fec_nac = "fec_nac";
        public static String dir_cli = "dir_cli";
        public static String ciu_cli = "ciu_cli";
        public static String est_cli = "est_cli";
        public static String tel_cli = "tel_cli";
        public static String cel_cli = "cel_cli";
        public static String cor_cli = "cor_cli";
        public static String por_cli = "por_cli";
        public static String ret_iva = "ret_iva";
        public static String ret_islr = "ret_islr";
        public static String tip_cli = "tip_cli";
        public static String lis_cli = "lis_cli";
        public static String web_cli = "web_cli";
        public static String pat_cli = "pat_cli";
    }
    private int cod_cli;
    private String nac_cli;
    private int ced_cli;
    private String nom_cli;
    private String ape_cli;
    private Date fec_nac;
    private String dir_cli;
    private String ciu_cli;
    private int est_cli;
    private String tel_cli;
    private String cel_cli;
    private String cor_cli;
    private double por_cli;
    private int ret_iva;
    private int ret_islr;
    private int tip_cli;
    private int lis_cli;
    private int web_cli;
    private int pat_cli;
}

