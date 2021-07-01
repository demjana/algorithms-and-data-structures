import static org.junit.Assert.assertEquals;

import com.demjana.arabictoroman.ArabicToRoman;
import org.junit.Test;

public class ArabicToRomanTest {

  @Test
  public void testReturn1() {
    String expected = "I";
    String actual = ArabicToRoman.getRomanFromArabic(1);
    assertEquals(expected, actual);
  }

  @Test
  public void testReturn3() {
    String expected = "III";
    String actual = ArabicToRoman.getRomanFromArabic(3);
    assertEquals(expected, actual);
  }

  @Test
  public void testReturn4() {
    String expected = "IV";
    String actual = ArabicToRoman.getRomanFromArabic(4);
    assertEquals(expected, actual);
  }

  @Test
  public void testReturn9() {
    String expected = "IX";
    String actual = ArabicToRoman.getRomanFromArabic(9);
    assertEquals(expected, actual);
  }

  @Test
  public void testReturn293() {
    String expected = "CCXCIII";
    String actual = ArabicToRoman.getRomanFromArabic(293);
    assertEquals(expected, actual);
  }

  @Test
  public void testReturn3999() {
    String expected = "MMMCMXCIX";
    String actual = ArabicToRoman.getRomanFromArabic(3999);
    assertEquals(expected, actual);
  }
}