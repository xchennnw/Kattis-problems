import java.util.Scanner;
import java.util.ArrayList;


public class cccode {
	
	private static char[] c = new char[12];
	private static ArrayList<Integer> l = new ArrayList<>();
	
	public static void main(String args[])
    { 
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int a = Integer.parseInt(s);
		int[] aaa = new int[a];
		for(int y=0; y<a; y++)	{
			
			String x =sc.nextLine();			
			for(int j = 0; j<12; j++ ) {
				c[j]=x.charAt(j);
			}
			aaa[y]=play(c);
		}
		
		sc.close();
		for(int y=0; y<a; y++)	{
			System.out.println(aaa[y]);
		}
					
    }
			
	
	public static int number(char[] a) {
		
	    int n = 0;
		for(int i = 0; i<12; i++ ) {
			if(a[i]=='o') {n++;}
		}
		return n;
	}
	
	 public static int play(char[] a) {
		    l.clear();
	        int count = 13;	        
	        int sign = 8;
	        for(int q=0; q<11; q++) {
	        	if(a[q]=='o'&& a[q+1]==a[q]) {
	        		l.add(q);
	        	}
	        }
	        if(l.size()>0 && l.size()<11) {
	        for(int p=0; p<l.size(); p++) {
	        	    int i = l.get(p);
					if(i>0 && i<10 && a[i+2]=='-'&&a[i-1]=='-') {
						char[] t = new char[12];
					    for(int j = 0; j<12; j++ ) {
							t[j]=a[j];
						}
						a[i+2]='o'; a[i]='-'; a[i+1]='-';
						t[i-1]='o'; t[i]='-'; t[i+1]='-';
						sign = 0;
						int aaa = play(a); int ttt=play(t);
						if(aaa>=ttt) {if(count>ttt) count=ttt;}
						else {if(count>aaa) count=aaa;}
					}else if(i<10 && a[i+2]=='-') {
						a[i+2]='o'; a[i]='-'; a[i+1]='-';
						sign = 0;
						int aaa= play(a);
						if(count>aaa) count=aaa;
					}else if(i>0 && a[i-1]=='-') {
						a[i-1]='o'; a[i]='-'; a[i+1]='-';
						sign = 0;
						int aaa= play(a);
						if(count>aaa) count=aaa;
					}
	        }
	        }else if(l.size()>=11){
	              count=12; 
	        }else {
	        	count = number(a);
	        }
	        	       
	        return count;
	  }


	
	
	
	

}