
public class FizBuzz {
  
  final int max;
  
  public FizBuzz(final int max) {
    this.max=max;
  }
  
  @Override
  public String toString() {
    
    String fizbuzzed = "1";
    
    int index = 2;
    
    while (index <= max){
      fizbuzzed += "\n" + valueOf(index);
      index++;
    } ;
    
    return fizbuzzed;
  }

  public static String valueOf(int i) {
    String biz = "";
    
    if (i % 3 == 0 || String.valueOf(i).contains("3")) {
      biz = "fiz";
    } 
    if (i % 5 == 0) {
      biz += "buzz";
    }
    
    if ("".equals(biz)) {
      biz += i ;
    }
    return biz;
  }
}
