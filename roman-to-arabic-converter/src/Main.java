import service.ConverterService;

public class Main {

  public static void main(String[] args) {
    ConverterService converter = new ConverterService();
    System.out.println(converter.romanToArabic("MCMLVII"));
    System.out.println(converter.arabicToRoman(1957));
  }
}
