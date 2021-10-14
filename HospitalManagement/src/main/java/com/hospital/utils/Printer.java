package com.hospital.utils;

public class Printer {
    public static String tabbedPrint(int tab,String text){
        String temp = "";
        for(int i=0;i<tab;i++){
            temp+="\t";
        }
        return temp+text;
    }
}
