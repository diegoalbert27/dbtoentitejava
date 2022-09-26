package com.example.my_first_app.backend.database.entities;

public class Medicas {
    public static class NAMES {
        public static String TABLE_NAME = "tab_medicas";

        public static String cod_medi = "cod_medi";
        public static String pac_medi = "pac_medi";
        public static String enf_medi = "enf_medi";
        public static String otr_enfe = "otr_enfe";
        public static String pat_medi = "pat_medi";
        public static String otr_pato = "otr_pato";
        public static String fec_medi = "fec_medi";
    }
    private int cod_medi;
    private int pac_medi;
    private String enf_medi;
    private String otr_enfe;
    private String pat_medi;
    private String otr_pato;
    private Date fec_medi;
}

