package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class CommonElementArray {
    static String[] john={"macau","nepal","delhi","kolkata"};
    static String[] bob={"macau","bhutan","bhopal","kolkata","utr"};
    static int match =0;
    static List<String> common= new ArrayList<>();

    public static void main(String[] args){
        //Set<String>js= Arrays.stream(john).collect(Collectors.toSet());
        Set<String>js= new HashSet<>(List.of(john));
        Set<String>bs= new HashSet<>(List.of(bob));
        //Set<String>bs= Arrays.stream(bob).collect(Collectors.toSet());
        js.retainAll(bs);
        System.out.println(js);

    }
}
