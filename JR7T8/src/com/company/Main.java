package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

     static List<String> enter() throws IOException {
        System.out.println("Enter words. Space is end");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String a;
        List<String> list= new ArrayList<String>();
        do{
            a = bf.readLine();
            if(a.isEmpty() || a.equals(" ")){
            }else
            list.add(a);
        }
        while(!a.equals(" "));
        return list;
    }

    static List<String> transform(List<String> text){
         List<String> list = new ArrayList<String>();
        for (int i = 0; i < text.size(); i++) {
            list.add(text.get(i).toUpperCase());
        }
        return list;
    }

    static List<String> multiple(List<String> text){
         List<String> list = new ArrayList<String>();
        for (int i = 0; i < text.size(); i++) {
            if(text.get(i).length() % 2 == 0){
                list.add(text.get(i));
                list.add(text.get(i));
            }else{
                for (int j = 0; j < 3; j++) {
                    list.add(text.get(i));
                }
            }
        }
        return list;
    }

    public static void main(String[] args) throws IOException{
         List<String> ent = enter();
         List<String> up = transform(ent);
        System.out.println("You have entered: " + ent);
        System.out.println("UpperCased list: " + up);
        System.out.println("Multipled List: " + multiple(up));

    }
}
