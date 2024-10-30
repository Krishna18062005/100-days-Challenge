import java.util.*;

public class BitWise {
    public static void main(String[] args) {
      //int a=new Scanner(System.in).nextInt();
    //   int a=5;
    //   if((a&1)==1)
    //   System.out.println("odd");
    //   else{
    //     System.out.println("Even");
    //   }
      int sumOfDigit=0;
      int n=12345;
      while(n>0){
        sumOfDigit+=(n%10);
        n/=10;
      }
      System.out.print(sumOfDigit);
  }
}
