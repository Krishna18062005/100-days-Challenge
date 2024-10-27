import java.util.*;

public class main{
  public static void main(String[] args){
    //Borrow and Add
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    for(int i=0;i<n;i++){
      int num=sc.nextInt();
      if(num%100==0) continue;
      if(num%10==0) sum+=num-9;
      else sum+=num;
    }
    System.out.println(sum);
  }
  
}
