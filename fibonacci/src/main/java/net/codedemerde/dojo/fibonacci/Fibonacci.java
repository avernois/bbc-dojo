package net.codedemerde.dojo.fibonacci;

public class Fibonacci {

  public static int valueOf(final int i) {
    if (i <= 1) return i;
    
    return valueOf(i - 1) + valueOf(i - 2);
  }

}
