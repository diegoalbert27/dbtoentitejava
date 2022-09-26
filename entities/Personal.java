package com.example.my_first_app.backend.database.entities;

public class Personal {
    public static class NAMES {
        public static String TABLE_NAME = "tab_personal";

        public static String ced_per = "ced_per";
        public static String nom_per = "nom_per";
        public static String ape_per = "ape_per";
        public static String fot_per = "fot_per";
        public static String car_per = "car_per";
        public static String dir_per = "dir_per";
        public static String cel_per = "cel_per";
        public static String cor_per = "cor_per";
        public static String fec_ing = "fec_ing";
    }
    private int ced_per;
    private String nom_per;
    private String ape_per;
    private String fot_per;
    private int car_per;
    private String dir_per;
    private String cel_per;
    private String cor_per;
    private Date fec_ing;
}

