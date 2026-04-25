package org.example;

import java.util.Arrays;
import java.util.List;

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

            int [] nums = {0,3,7,2,5,8,4,6,0,1};

            Arrays.sort(nums);
            for(int i:nums){
                System.out.println(i);
            }
            int count=0;
            for(int i=0;i<nums.length;i++){
               // if(nums[i+1]!=nums[i] && nums[i+1]-nums[i]){}
            }

            System.out.println("Longest gap is: " + chkGap(32));
        }
    }
