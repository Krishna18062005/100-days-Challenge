import java.util.*;
class prime{
    public static void main(String[] args){
        long n=new Scanner(System.in).nextLong();
        //System.out.println(isPrime(n)?n+" is a prime number":n+" is not a prime number");
        System.out.println(isGcd(n,new Scanner(System.in).nextLong()));

    }
    public static boolean isPrime(long n){
        if(n<=1) return false;
        if(n<=3) return true;
        
        if(n%2==0||n%3==0) return false;
        int c=0;
        for(long i=4;i<=n;i++){
            if(n%i==0){
                return false;
            }
        }

        
        return true;
        
    }
    public static long isGcd(long a ,long b){
        if (a == 0)
        return b;
        return isGcd(b%a,a);
    }
    }
