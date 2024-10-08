import java.util.*;

public class day_155{
  public static void main(String[] args){
    String n=Integer.toBinaryString(new Scanner(System.in).nextInt());
    for(int i=n.length()-1;i>=0;i--){
      System.out.print(n.substring(i)+" ");
    }
  }
}
