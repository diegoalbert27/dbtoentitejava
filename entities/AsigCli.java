package com.example.my_first_app.backend.database.entities;

public class AsigCli {
    public static class NAMES {
        public static String TABLE_NAME = "tab_asig_cli";

        public static String cod_asi = "cod_asi";
        public static String per_asi = "per_asi";
        public static String cli_asi = "cli_asi";
        public static String fec_asi = "fec_asi";
    }
    private int cod_asi;
    private int per_asi;
    private String cli_asi;
    private Date fec_asi;
}

