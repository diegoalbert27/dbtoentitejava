package com.example.my_first_app.backend.database.entities;

public class Orden {
    public static class NAMES {
        public static String TABLE_NAME = "tab_orden";

        public static String cod_ord = "cod_ord";
        public static String ced_ord = "ced_ord";
        public static String fec_ord = "fec_ord";
        public static String hra_ord = "hra_ord";
        public static String ped_ord = "ped_ord";
        public static String tmo_ord = "tmo_ord";
        public static String hor_ord = "hor_ord";
        public static String ver_ord = "ver_ord";
        public static String max_ord = "max_ord";
        public static String pue_ord = "pue_ord";
        public static String obs_ord = "obs_ord";
        public static String usu_ord = "usu_ord";
        public static String est_ord = "est_ord";
        public static String est_ord2 = "est_ord2";
        public static String caj_ord = "caj_ord";
        public static String fde_ord = "fde_ord";
        public static String num_fact = "num_fact";
        public static String fec_fact = "fec_fact";
        public static String sub_fact = "sub_fact";
        public static String bas_ord = "bas_ord";
        public static String val_iva = "val_iva";
        public static String iva_fact = "iva_fact";
        public static String por_des = "por_des";
        public static String des_fact = "des_fact";
        public static String tot_fact = "tot_fact";
        public static String lab_ord = "lab_ord";
        public static String web_ord = "web_ord";
        public static String pat_ord = "pat_ord";
        public static String mon_pat = "mon_pat";
        public static String est_pat = "est_pat";
        public static String med_ord = "med_ord";
        public static String obs_sta = "obs_sta";
    }
    private int cod_ord;
    private int ced_ord;
    private Date fec_ord;
    private String hra_ord;
    private String ped_ord;
    private int tmo_ord;
    private double hor_ord;
    private double ver_ord;
    private double max_ord;
    private double pue_ord;
    private String obs_ord;
    private int usu_ord;
    private int est_ord;
    private int est_ord2;
    private String caj_ord;
    private Date fde_ord;
    private int num_fact;
    private Date fec_fact;
    private double sub_fact;
    private double bas_ord;
    private int val_iva;
    private double iva_fact;
    private int por_des;
    private double des_fact;
    private double tot_fact;
    private int lab_ord;
    private int web_ord;
    private String pat_ord;
    private double mon_pat;
    private int est_pat;
    private int med_ord;
    private String obs_sta;
}

