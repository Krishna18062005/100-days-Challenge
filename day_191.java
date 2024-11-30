import java.util.*;
public class Hello {
    public static class Pair{
        int count;
        String Fam;
        Pair(int c,String fam){
            Fam=fam;
            count=c;
        }
    }

    public static void main(String[] Kaidrix) {
		//Sort Familes - Persons Count
		List<Pair> pq=new ArrayList<>();
		//(a,b)->{if(a.count!=b.count) {b.count-a.count;{ else {a.Fam.compareTo(b.Fam);}});
		HashMap<String,Integer> mp=new HashMap<>();
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    sc.nextLine();
	    for(int i=0;i<n;i++){
	        String ip=sc.next();
	        String ip2=sc.next();
	        if(mp.containsKey(ip2)){
	            mp.put(ip2,mp.get(ip2)+1);
	        }
	        else
	        mp.put(ip2,1);
	    }int co=0;
	    for(String st:mp.keySet()){
	        co++;
	        pq.add(new Pair(mp.get(st),st));
	    }
	    pq.sort((a,b)->{
	        if(a.count!=b.count){return b.count-a.count;}else {return a.Fam.compareTo(b.Fam);}});
	    System.out.println(co);
	    while(!pq.isEmpty()){
	        Pair ip=pq.remove(0);
	        System.out.println(ip.Fam+" "+ip.count);
	    }
		

	}
}
