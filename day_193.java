import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Oranize Files
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        sc.nextLine();   
		List<String> files=new ArrayList<>();
		for(int i=0;i<n;i++){
		    files.add(sc.next());
		}
		char ch=sc.next().charAt(0);
		if(ch=='N'||ch=='n'){
		    files.sort((a,b)-> a.substring(0,a.indexOf(".")).compareTo(b.substring(0,b.indexOf("."))));
		    for(var i :files){
		        System.out.println(i);
		    }
		}
		else{
		    files.sort((a,b)->{if(!(a.substring(a.indexOf(".")+1).equals(b.indexOf(".")+1)))
          return a.substring(a.indexOf(".")+1).compareTo(b.substring(b.indexOf(".")+1));
        else{
          return a.compareTo(b);}
                          });
		    for(var i:files){
		        System.out.println(i);
		    }
		}

	}
}
