import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestFizbuzz {

  private String[] tableFizBuzz = new String[] { "1", "2", "fiz", "4", "buzz",
      "fiz", "7", "8", "fiz", "buzz", "11", "fiz", "fiz", "14", "fizbuzz",
      "16", "17", "fiz", "19", "buzz", "fiz", "22", "fiz", "fiz", "buzz",
      "26", "fiz", "28", "29", "fizbuzz", "fiz", "fiz", "fiz", "fiz", "fizbuzz",
      "fiz", "fiz", "fiz", "fiz", "buzz", "41", "fiz", "fiz", "44", "fizbuzz",
      "46", "47", "fiz", "49", "buzz", "fiz", "52", "fiz", "fiz", "buzz",
      "56", "fiz", "58", "59", "fizbuzz", "61", "62", "fiz", "64", "buzz",
      "fiz", "67", "68", "fiz", "buzz", "71", "fiz", "fiz", "74", "fizbuzz",
      "76", "77", "fiz", "79", "buzz", "fiz", "82", "fiz", "fiz", "buzz",
      "86", "fiz", "88", "89", "fizbuzz", "91", "92", "fiz", "94", "buzz",
      "fiz", "97", "98", "fiz", "buzz" };

  @Test
  public void testFiz1() {
    final String chaineAttendu = "1";
    assertEquals(chaineAttendu, FizBuzz.valueOf(1));
  }

  @Test
  public void testFiz2() {
    final String chaineAttendu = "2";
    assertEquals(chaineAttendu, FizBuzz.valueOf(2));
  }

  @Test
  public void testFiz3() {
    final String chaineAttendu = "fiz";
    assertEquals(chaineAttendu, FizBuzz.valueOf(3));
  }

  @Test
  public void testFiz5() {
    final String chaineAttendu = "buzz";
    assertEquals(chaineAttendu, FizBuzz.valueOf(5));
  }

  @Test
  public void testFiz6() {
    final String chaineAttendu = "fiz";
    assertEquals(chaineAttendu, FizBuzz.valueOf(6));
  }
  
  @Test
  public void testFiz13() {
    final String chaineAttendu = "fiz";
    assertEquals(chaineAttendu, FizBuzz.valueOf(13));
  }
  
  @Test
  public void testFiz23() {
    final String chaineAttendu = "fiz";
    assertEquals(chaineAttendu, FizBuzz.valueOf(23));
  }
  
  @Test
  public void testFizModulo5() {
    final String chaineAttendu = "buzz";
    assertEquals(chaineAttendu, FizBuzz.valueOf(10));
  }
  
  @Test
  public void testFizModulo35() {
    final String chaineAttendu = "fizbuzz";
    assertEquals(chaineAttendu, FizBuzz.valueOf(15));
  }
  
  @Test
  public void testFiz100() {
    final String chaineAttendu = writeFizbuzz(100);
    FizBuzz fizbuzz = new FizBuzz(100);
    assertEquals(chaineAttendu, fizbuzz.toString());
  }
   
  private String writeFizbuzz(final int max) {
    String result = "";
    
    for (int i = 0; i < max - 1; i++) {
      result += tableFizBuzz[i] + "\n";
    }
    
    result += tableFizBuzz[max - 1];
    
    return result;
  }
}
