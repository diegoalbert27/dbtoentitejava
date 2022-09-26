package com.example.my_first_app.backend.database.entities;

public class Nec {
    public static class NAMES {
        public static String TABLE_NAME = "tab_nec";

        public static String cod_fac = "cod_fac";
        public static String fec_fac = "fec_fac";
        public static String prv_fac = "prv_fac";
        public static String tip_fac = "tip_fac";
        public static String tie_cre = "tie_cre";
        public static String fec_ven = "fec_ven";
        public static String ord_fac = "ord_fac";
        public static String num_con = "num_con";
        public static String sta_fac = "sta_fac";
        public static String anu_fac = "anu_fac";
        public static String fec_anu = "fec_anu";
        public static String sub_tot = "sub_tot";
        public static String por_des = "por_des";
        public static String des_fac = "des_fac";
        public static String exc_fac = "exc_fac";
        public static String bas_imp = "bas_imp";
        public static String iva_fac = "iva_fac";
        public static String tot_fac = "tot_fac";
        public static String obs_fact = "obs_fact";
        public static String pre_fact = "pre_fact";
        public static String mod_fac = "mod_fac";
        public static String fec_emi = "fec_emi";
        public static String alm_com = "alm_com";
        public static String mon_can = "mon_can";
        public static String mon_ped = "mon_ped";
        public static String imp_ret = "imp_ret";
    }
    private int cod_fac;
    private Date fec_fac;
    private String prv_fac;
    private String tip_fac;
    private int tie_cre;
    private Date fec_ven;
    private String ord_fac;
    private String num_con;
    private String sta_fac;
    private int anu_fac;
    private Date fec_anu;
    private double sub_tot;
    private double por_des;
    private double des_fac;
    private double exc_fac;
    private double bas_imp;
    private double iva_fac;
    private double tot_fac;
    private String obs_fact;
    private int pre_fact;
    private String mod_fac;
    private Date fec_emi;
    private int alm_com;
    private double mon_can;
    private double mon_ped;
    private double imp_ret;
}

