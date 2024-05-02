package com.demo;

public class CountVowels 
{
 public static void main(String[] args)
 {
        String str = "Smitha";
        str = str.toLowerCase();
        
        int count = 0;
        for (char ch : str.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                count++; 
            }
        }
        
        System.out.println("Total number of vowels in the string: " + count);
    }
}
