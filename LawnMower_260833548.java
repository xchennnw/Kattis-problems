import java.io.*;
import java.util.*;

public class contest {
	

	public static void main(String args[]) throws Exception
    { 
		
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = sc.readLine().split(" ");
		int a = Integer.parseInt(s[0]);	
		while (a!=0) {
			int x = Integer.parseInt(s[0]);	
			int y = Integer.parseInt(s[1]);
			float wide = Float.parseFloat(s[2]);
			String[] xx = sc.readLine().split(" ");
			String[] yy = sc.readLine().split(" ");
			float[] xxx = new float[x];
			float[] yyy = new float[y];
			for(int j=0; j<x; j++) {
			    xxx[j] = Float.parseFloat(xx[j]);			
			}
			for(int j=0; j<y; j++) {
			    yyy[j] = Float.parseFloat(yy[j]);			
			}
			Arrays.sort(xxx);
			Arrays.sort(yyy);
			
			
			
			boolean ifOK = true;
			
			if(xxx[0]>(wide/2)) {
				ifOK = false;
			}else if(xxx[x-1]+(wide/2)<75){
				ifOK = false;
			}else {
				for(int i=0; i<x-1; i++) {
					if((xxx[i+1]-xxx[i])>wide) {
						ifOK = false;
						break;
					}
				}
			}
			
			if(yyy[0]>(wide/2)) {
				ifOK = false;
			}else if(yyy[y-1]+(wide/2)<100){
				ifOK = false;
			}else {
				for(int i=0; i<y-1; i++) {
					if((yyy[i+1]-yyy[i])>wide) {
						ifOK = false;
						break;
					}
				}
			}
			if(ifOK) {
			    System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
			s = sc.readLine().split(" ");
			a = Integer.parseInt(s[0]);	
			
			
		}
    }
		
}
