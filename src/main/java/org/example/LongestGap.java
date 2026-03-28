package org.example;

public class LongestGap {

    static int chkGap(Integer n) {
        int tlen = 0;
        int flen = 0;
        String bin =Integer.toBinaryString(n).trim();
        char[] s = Integer.toBinaryString(n).trim().toCharArray();
        System.out.println("Provide binaray is: " + bin);

        for(int i=0;i<s.length;i++){
            if(s[i]=='0'){
                tlen++;
            } else if (s[i]=='1') {
                if(tlen>flen){
                    flen=tlen;
                    tlen=0;
                }

            }
        }
        return flen;

    }


        public static void main (String[]args){

            System.out.println("Longest gap is: " + chkGap(32));
        }
    }
