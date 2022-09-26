package com.example.my_first_app.backend.database.entities;

public class Auditoria {
    public static class NAMES {
        public static String TABLE_NAME = "tab_auditoria";

        public static String cod_aud = "cod_aud";
        public static String usuario = "usuario";
        public static String accion = "accion";
        public static String modulo = "modulo";
        public static String detalles = "detalles";
        public static String fecha = "fecha";
        public static String hora = "hora";
    }
    private int cod_aud;
    private String usuario;
    private String accion;
    private String modulo;
    private String detalles;
    private Date fecha;
    private String hora;
}

