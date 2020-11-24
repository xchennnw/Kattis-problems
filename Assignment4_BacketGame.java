import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class code {
	
	 

	 
	
	public static void main(String args[])
    { 
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			if(sc.hasNextLine()) {
		     String x = sc.nextLine();
		     String[] sss=x.split(" ");
		     int n = Integer.parseInt(sss[0]);
			 int m = Integer.parseInt(sss[1]);
			   
			 int[] arr = new int[m];		
			 for (int i = 0; i < m; i++) {
				arr[i]=Integer.parseInt(sss[i+2]);
			 }
						
			 System.out.println(count(arr,n,m));
			}
			 else {
				 
				 sc.close();
				 break;
			 }
		}  
		
		
		
					
    }
	
	static int N = 1000005;	
	static int[] dp = new int[N];
	
	 
	static String count(int[] a, int n, int m) {
	    
		for(int i=0; i<dp.length; i++) {
			dp[i]=0;
		}
			 
		for (int i = 1; i <= n; i++) {
		    for (int j = 0; j < m; j++) {
			   if (i - a[j] >= 0 && dp[i - a[j]]==0) {
			      dp[i] = 1;
			      break;
			    }
		    }
		}
		if( dp[n] ==1) {
			return "Stan wins" ;
		}else {
			return "Ollie wins";
		}
	    
	}	
	
}
