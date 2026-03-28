package org.example;

import java.util.*;

public class Reverse2Char {

    static String city="Mumbaiaub";
    static String last="";
    static List<String> lst= new ArrayList<>();
    static List<String> getlist() {
        System.out.println("Length of string::"+city.length());
        if(city.length()%2!=0){
            last=String.valueOf(city.charAt(city.length()-1));
            city=city.substring(0,city.length()-1);
        }
        for(int i=0;i<city.length();i++){
            if(i%2==0){
                lst.add(city.substring(i,i+2));
            }
        }
        System.out.println(lst);

        return lst;
    }

    static String getReverseString(String input){
        String rev="";
        for(int i=input.length()-1;i>=0;i--){
            rev=rev+input.charAt(i);
        }
        System.out.println("Current reversedString: "+rev);
        return rev;
    }
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder();
        getlist();
        System.out.println("size is : " + lst.size());
        for (int i = 0; i < lst.size(); i++) {
            sb.append(getReverseString(lst.get(i)));
            System.out.println(sb);
        }
        System.out.println("Reversed String:: " + sb + last);

    }
}
