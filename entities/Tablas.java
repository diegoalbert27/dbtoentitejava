package com.example.my_first_app.backend.database.entities;

public class Tablas {
    public static class NAMES {
        public static String TABLE_NAME = "tablas";

        public static String id_tablas = "id_tablas";
        public static String tabla_datos = "tabla_datos";
        public static String tabla_titu = "tabla_titu";
        public static String ordenar_por = "ordenar_por";
        public static String campo_clave = "campo_clave";
        public static String condicion = "condicion";
        public static String permisos = "permisos";
        public static String formu_titu = "formu_titu";
        public static String tablas_asociadas = "tablas_asociadas";
        public static String orden = "orden";
    }
    private int id_tablas;
    private String tabla_datos;
    private String tabla_titu;
    private String ordenar_por;
    private String campo_clave;
    private String condicion;
    private String permisos;
    private String formu_titu;
    private String tablas_asociadas;
    private int orden;
}

