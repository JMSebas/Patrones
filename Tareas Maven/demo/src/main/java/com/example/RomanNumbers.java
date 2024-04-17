package com.example;

public class RomanNumbers {
    public String convertToRomanNumbers(int number) {
        int i, thousands, hundreds, tens, units;
        String roman = "";
        
    
        thousands = number / 1000;
        hundreds = number / 100 % 10;
        tens = number / 10 % 10;
        units = number % 10;
    
     //Thousands

        for (i = 1; i <= thousands; i++) {
            roman = roman + "M";
        }
    
         //Hundreds
        if (hundreds == 9) {
            roman = roman + "CM";
        } else if (hundreds >= 5) {
            roman = roman + "D";
            for (i = 6; i <= hundreds; i++) {
                roman = roman + "C";
            }
        } else if (hundreds == 4) {
            roman = roman + "CD";
        } else {
            for (i = 1; i <= hundreds; i++) {
                roman = roman + "C";
            }
        }
  
        //Tens
        if (tens == 9) {
            roman = roman + "XC";
        } else if (tens >= 5) {
            roman = roman + "L";
            for (i = 6; i <= tens; i++) {
                roman = roman + "X";
            }
        } else if (tens == 4) {
            roman = roman + "XL";
        } else {
            for (i = 1; i <= tens; i++) {
                roman = roman + "X";
            }
        }
    
        // Units
        if (units == 9) {
            roman = roman + "IX";
        } else if (units >= 5) {
            roman = roman + "V";
            for (i = 6; i <= units; i++) {
                roman = roman + "I";
            }
        } else if (units == 4) {
            roman = roman + "IV";
        } else {
            for (i = 1; i <= units; i++) {
                roman = roman + "I";
            }
        }
        return roman;
    }
    
}
