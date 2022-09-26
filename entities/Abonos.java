package com.example.my_first_app.backend.database.entities;

public class Abonos {
    public static class NAMES {
        public static String TABLE_NAME = "tab_abonos";

        public static String cod_abo = "cod_abo";
        public static String fac_abo = "fac_abo";
        public static String ord_abo = "ord_abo";
        public static String mon_abo = "mon_abo";
        public static String fec_abo = "fec_abo";
        public static String cli_abo = "cli_abo";
        public static String anu_abo = "anu_abo";
        public static String obs_abo = "obs_abo";
        public static String usu_abo = "usu_abo";
    }
    private int cod_abo;
    private int fac_abo;
    private int ord_abo;
    private double mon_abo;
    private Date fec_abo;
    private int cli_abo;
    private int anu_abo;
    private String obs_abo;
    private String usu_abo;
}

