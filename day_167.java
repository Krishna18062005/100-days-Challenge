import java.util.*;

class armStrong{
    public static void main(String[] args){
        int num1=5;
        int num2=10;
        int ans=0;
        for(int i=0;i<num1;i++){
            ans+=num2;            
        }
        System.out.println(ans);
        num1+=num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println(num1+" "+num2);
        HashSet<Integer> set=new HashSet<>();
        int[] arr={100,233,5544,676,100,233,5544};
        boolean isDup=false;
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                isDup=true;
                System.out.println(arr[i]+" is a duplicate one ");
            }
            else{
                set.add(arr[i]);
            }
        }
        if(!isDup)
        System.out.println("Array doesn't contains Duplicate element");        
        
    }
}
