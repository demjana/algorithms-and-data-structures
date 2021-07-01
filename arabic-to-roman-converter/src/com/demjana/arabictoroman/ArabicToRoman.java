package com.demjana.arabictoroman;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ArabicToRoman {

  public static void main(String[] args) {
    // Create a simple command line application
    // which uses a class to convert Arabic numbers to Roman numbers.
    // Requirements: Support positive numbers up to 3999

    System.out.print("Type a positive whole number between 1 and 3999: ");

    Scanner scanner = new Scanner(System.in);
    int arabicNumber = scanner.nextInt();

    System.out.print("Convert " + arabicNumber + " to roman number: " + getRomanFromArabic(arabicNumber));
  }

  public static String getRomanFromArabic(int arabicNumber) {
    if (arabicNumber < 1 || arabicNumber > 3999) {
      throw new UnsupportedOperationException("The input number must be between 1 and 3999.");
    } else {
      final LinkedHashMap<Integer, String> myMap = new LinkedHashMap<>();
      myMap.put(1, "I");
      myMap.put(4, "IV");
      myMap.put(5, "V");
      myMap.put(9, "IX");
      myMap.put(10, "X");
      myMap.put(40, "XL");
      myMap.put(50, "L");
      myMap.put(90, "XC");
      myMap.put(100, "C");
      myMap.put(400, "CD");
      myMap.put(500, "D");
      myMap.put(900, "CM");
      myMap.put(1000, "M");

      StringBuilder romanNumber = new StringBuilder();

      while (arabicNumber > 0) {
        int largestHit = 0;
        for (Map.Entry<Integer, String> current : myMap.entrySet()) {
          if (current.getKey() <= arabicNumber) {
            largestHit = current.getKey();
          }
        }
        romanNumber.append(myMap.get(largestHit));
        arabicNumber -= largestHit;
      }

      return romanNumber.toString();
    }
  }
}
