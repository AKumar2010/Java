package org.example;

public class PhoneNumberCheck {
    static boolean valid_phnNum(String S) {
        boolean correct = true;
        /*String another="abcdefghijklmnopqrstuvwxyz ";
        if(S.contains(another)){
            correct=false;
            return correct;
        }*/
        String[] words = S.split("-");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            System.out.println("Current word is: " + word);
            for (int j = 0; j < 3; j++) {
                if (word.length() == 3 && Character.isDigit(word.charAt(j))) {
                    System.out.println("Char is: "+word.charAt(j)+" and "+"condition is "+Character.isDigit(word.charAt(j)));
                    correct = true;
                } else {
                    correct=false;
                    System.out.println("Not a valid number");
                    return correct;
                }
            }
        }
        System.out.println("A valid number");
        return correct;
    }

    public static void main(String[] args){
        valid_phnNum("123-123-123-abc");
    }
}
