package com.example.my_first_app.backend.database.entities;

public class Menus {
    public static class NAMES {
        public static String TABLE_NAME = "menus";

        public static String id_menu = "id_menu";
        public static String nom_menu = "nom_menu";
        public static String alias_menu = "alias_menu";
        public static String orden = "orden";
        public static String link = "link";
        public static String aplic_menu = "aplic_menu";
    }
    private int id_menu;
    private String nom_menu;
    private String alias_menu;
    private int orden;
    private String link;
    private int aplic_menu;
}

