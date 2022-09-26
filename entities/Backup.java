package com.example.my_first_app.backend.database.entities;

public class Backup {
    public static class NAMES {
        public static String TABLE_NAME = "backup";

        public static String id_back = "id_back";
        public static String fec_hora = "fec_hora";
        public static String ruta_back = "ruta_back";
        public static String act_back = "act_back";
    }
    private int id_back;
    private Date fec_hora;
    private String ruta_back;
    private int act_back;
}

