package com.example.my_first_app.backend.database.entities;

public class Submenu {
    public static class NAMES {
        public static String TABLE_NAME = "submenu";

        public static String id_sub = "id_sub";
        public static String nom_sub = "nom_sub";
        public static String alias_sub = "alias_sub";
        public static String link = "link";
        public static String id_menu = "id_menu";
        public static String niv = "niv";
        public static String pos_sub = "pos_sub";
    }
    private int id_sub;
    private String nom_sub;
    private String alias_sub;
    private String link;
    private int id_menu;
    private String niv;
    private int pos_sub;
}

