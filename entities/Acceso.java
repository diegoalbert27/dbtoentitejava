package com.example.my_first_app.backend.database.entities;

public class Acceso {
    public static class NAMES {
        public static String TABLE_NAME = "acceso";

        public static String cedula = "cedula";
        public static String nombre = "nombre";
        public static String apellido = "apellido";
        public static String clave = "clave";
        public static String usuario = "usuario";
        public static String nivel = "nivel";
        public static String avatar = "avatar";
        public static String servidor = "servidor";
    }
    private int cedula;
    private String nombre;
    private String apellido;
    private String clave;
    private String usuario;
    private int nivel;
    private String avatar;
    private String servidor;
}

