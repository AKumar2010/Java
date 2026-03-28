package org.example;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import io.restassured.*;


@Slf4j
@Data
public class Code {
    public String value;

  void doSomething(){
      System.out.println("this is in another class.");
  }

  String reverse(String input){
      StringBuilder bld= new StringBuilder();
      for(int i=input.length()-1;i>=0;i--){
          bld.append(input.charAt(i));
      }
      return bld.toString();
  }

    String reverseWithSpace(String input){
      char[] result= new char[input.length()];

      for(int i=0;i<input.length();i++){
          if(input.charAt(i)==' '){
              result[i]=' ';
          }
      }
      StringBuilder bld= new StringBuilder();
      for(int i=0;i<input.length();i++){
          if(input.charAt(i)!=' ') {
              bld.append(input.charAt(i));
          }
      }
        System.out.println("String after space removal: "+bld);

        int j=bld.length();

        for(int i=0;i<result.length;i++){
            if(result[i]!=' '){
                result[i]=bld.charAt(j-1);
                //System.out.println(String.valueOf(result));
                j--;
            }
        }
        return String.valueOf(result);
    }
//==============================================
    int getsumFromString(String input){
      int sum=0;
      char[] str= input.toCharArray();
      for(int i=0;i<input.length();i++){

          if(Character.isDigit(input.charAt(i))){
              System.out.println("current value of character is: "+input.charAt(i));
              sum=sum+(input.charAt(i)-'0');
          }
      }
      return sum;
    }


    //=========================================

    String fibonaci(int length){
      String result=null;
      int first=0,secnd=1,next;
      for(int i=0;i<=length-1;i++){
          System.out.println(first+" ");
          next=first+secnd;
          first=secnd;
          secnd=next;

      }
      return result;
    }

    //==============================================
    boolean chkAnagram(String s1, String s2){
        Map<Character,Integer> charmap1= new HashMap<>();
        Map<Character,Integer> charmap2= new HashMap<>();
        for(char ch:s1.toCharArray()){
            charmap1.put(ch, charmap1.getOrDefault(ch,0)+1);
        }
        System.out.println("Map represent is: "+charmap1.entrySet());


      return true;
    }


}
