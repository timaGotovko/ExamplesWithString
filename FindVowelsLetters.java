import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindVowelsLetters {
    public static void Finder(String NewString){
        char[] ArrVowels = {'a', 'u', 'y', 'e', 'i', 'o'};
        int[] count = new int[6];
        int sum = 0;
            for (int i = 0; i <NewString.length() ; i++) {
                char CharTemp = NewString.charAt(i);
                for (int j = 0; j < ArrVowels.length ; j++) {
                    if(CharTemp==ArrVowels[j]){
                        sum++;
                        count[j]++;
                    }

                }
            }
        System.out.println("Total amount of vowels: " + sum);
        System.out.println("Amount of As: " + count[0]);
        System.out.println("Amount of Us: " + count[1]);
        System.out.println("Amount of Ys: " + count[2]);
        System.out.println("Amount of Es: " + count[3]);
        System.out.println("Amount of Is: " + count[4]);
        System.out.println("Amount of Os: " + count[5]);
    }
}
