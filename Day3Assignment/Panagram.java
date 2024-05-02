package com.demo;

public class Panagram{
    
    static boolean isPangram(String str)
    {
        str = str.toLowerCase(); 
        boolean[] present = new boolean[26]; 
        
        for (char ch:str.toCharArray())
        {
            if (Character.isLetter(ch)) 
            {
                int index = ch-'a'; 
                present[index] = true; 
            }
        }
        
        for (boolean isPresent:present) {
            if (!isPresent) {
                return false; 
            }
        }
        
        return true; 
    }
    
    public static void main(String[] args) {
        String str = "Abcdefghijklmnopqrstuvwxyz";
        
        if (isPangram(str)) {
            System.out.println("The given string is a pangram string.");
        } else {
            System.out.println("The given string is not a pangram string.");
        }
    }
}
