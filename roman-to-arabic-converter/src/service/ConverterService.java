package service;

import domain.RomanNumbers;
import java.util.List;
import java.util.regex.Pattern;

public class ConverterService {

  public int romanToArabic(String inputRomanNumber) {
    if (isValidRomanNumber(inputRomanNumber)) {
      throw new IllegalArgumentException(inputRomanNumber + "is invalid Roman number!");
    }
    String input = inputRomanNumber.toUpperCase();
    int result = 0;

    List<RomanNumbers> romanNumbers = RomanNumbers.getReverseSortedValues();

    int i = 0;

    while ((input.length() > 0) && (i < romanNumbers.size())) {
      RomanNumbers currentChar = romanNumbers.get(i);
      if (input.startsWith(currentChar.name())) {
        result += currentChar.getValue();
        input = input.substring(currentChar.name().length());
      } else {
        i++;
      }
    }
    return result;
  }

  public String arabicToRoman(int inputNumber) {
    if ((inputNumber <= 0) || (inputNumber > 4000)) {
      throw new IllegalArgumentException("The input number must be between 1 and 3999.");
    }

    List<RomanNumbers> romanNumerals = RomanNumbers.getReverseSortedValues();

    StringBuilder romanNumber = new StringBuilder();
    int i = 0;

    while ((inputNumber > 0) && (i < romanNumerals.size())) {
      RomanNumbers currentChar = romanNumerals.get(i);
      if (currentChar.getValue() <= inputNumber) {
        romanNumber.append(currentChar.name());
        inputNumber -= currentChar.getValue();
      } else {
        i++;
      }
    }
    return romanNumber.toString();
  }

  public boolean isValidRomanNumber(String input) {
    return Pattern.matches("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$\\n", input);
  }
}
