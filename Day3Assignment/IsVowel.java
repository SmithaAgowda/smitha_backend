package com.demo;

public class IsVowel
{
    
    static boolean areAllVowelsPresent(String str)
    {
        str = str.toLowerCase();
        boolean[] vowels = new boolean[5]; 
        
        for (char ch : str.toCharArray())
        {
            switch (ch)
            {
                case 'a':
                    vowels[0] = true;
                    break;
                case 'e':
                    vowels[1] = true;
                    break;
                case 'i':
                    vowels[2] = true;
                    break;
                case 'o':
                    vowels[3] = true;
                    break;
                case 'u':
                    vowels[4] = true;
                    break;
            }
        }
        
      
        for (boolean vowel : vowels) {
            if (!vowel) {
                return false; 
            }
        }
        
        return true; 
    }
    
    public static void main(String[] args) {
        String str = "aou";
        
        if (areAllVowelsPresent(str)) {
            System.out.println("vowels are present in the string.");
        } else {
            System.out.println("vowels are not present in the string.");
        }
    }
}
