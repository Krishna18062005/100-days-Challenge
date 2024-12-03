import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Dates till Next Date
		int[] mc={31,28,31,30,31,30,31,31,30,31,30,31};
		
		String str[]=new Scanner(System.in).next().split("-");
		int day=Integer.parseInt(str[0]);
		int mon=Integer.parseInt(str[1]);
		int year=Integer.parseInt(str[2]);
		mc[1]=leapOrNot(year);
		if(day+1<=mc[mon-1]){
		    for(int i=1;i<day+2;i++){
		        if(i<10) System.out.print(0);
		        System.out.println(i+"-"+str[1]+"-"+year);
		    }
		}
		else if(mon==12&&day==31){
		    for(int i=1;i<=31;i++){
		        if(i<10) System.out.print(0);
		        System.out.println(i+"-12-"+year);
		    }
		    System.out.println("01-01-"+(year+1));
		    
		}
		else{
		    if(day==mc[mon-1]){
		        for(int i=1;i<=day;i++){
		            if(i<10) System.out.print(0);
		            System.out.println(i+"-"+str[1]+"-"+str[2]);
		        }
		        System.out.print("01-");
		        if(mon+1<10) System.out.print(0);
		        System.out.print((mon+1)+"-"+year);
		    }
		}

	}
	static int leapOrNot(int y){
	    if(y%100==0&&y%400!=0) return 28;
	    if(y%4==0) return 29;
	    return 28;
	}
}
