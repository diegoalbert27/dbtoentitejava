package com.example.my_first_app.backend.database.entities;

public class Proveedor {
    public static class NAMES {
        public static String TABLE_NAME = "tab_proveedor";

        public static String cod_pro = "cod_pro";
        public static String ref_pro = "ref_pro";
        public static String nom_pro = "nom_pro";
        public static String con_pro = "con_pro";
        public static String dir_pro = "dir_pro";
        public static String fax_pro = "fax_pro";
        public static String tel_pro = "tel_pro";
        public static String rif_pro = "rif_pro";
        public static String cor_pro = "cor_pro";
        public static String dia_cre = "dia_cre";
        public static String ori_pro = "ori_pro";
        public static String act_pro = "act_pro";
    }
    private int cod_pro;
    private String ref_pro;
    private String nom_pro;
    private String con_pro;
    private String dir_pro;
    private String fax_pro;
    private String tel_pro;
    private String rif_pro;
    private String cor_pro;
    private int dia_cre;
    private String ori_pro;
    private int act_pro;
}

