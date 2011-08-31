package net.codedemerde.dojo.fibonacci;

import static org.junit.Assert.*;

import org.junit.Test;


public class FibonacciTest {

  @Test
  public void testZero() {
    assertEquals(0, Fibonacci.valueOf(0));
  }
  
  @Test
  public void testUn() {
    assertEquals(1, Fibonacci.valueOf(1));
  }
  
  @Test
  public void testDeux() {
    assertEquals(1, Fibonacci.valueOf(2));
  }
  
  @Test
  public void testTrois() {
    assertEquals(2, Fibonacci.valueOf(3));
  }
  
  @Test
  public void testQuatre() {
    assertEquals(3, Fibonacci.valueOf(4));
  }
  
  @Test
  public void testCinq() {
    assertEquals(5, Fibonacci.valueOf(5));
  }
  
  @Test
  public void test25() {
    assertEquals(75025, Fibonacci.valueOf(25));
  }
}
