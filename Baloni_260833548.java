import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class baloni {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int a = Integer.parseInt(s);
		
		String s2 = sc.nextLine();
		String[] sss= s2.split(" ");
		sc.close();
		
		int[] b = new int[a];
		for(int y=0; y<a; y++)	{			
			   b[y] =Integer.parseInt(sss[y]);						
		}
		
		
		int xxx = a;
		int[] des = new int[a];
		for(int z=0; z<a; z++)	{			
			   des[z] =xxx;	
			   xxx--;
		}
		
		int count=0;
		while(b.length!=0) {
			b = lcs(b,des);
			count++;
		}
		System.out.print(count);
		
	}
	
	public  static int[] lcs(int[] t1, int[] t2) {
		
        
        int length1 = t1.length;
        int length2 = t2.length;
               
        int[][] dp = new int[length1+1][length2+1]; 
        int[][] s = new int[length1+1][length2+1];
        for (int i = 1; i < length1 +1; i++) {
            for (int j = 1; j < length2 +1; j++) {
                if (t1[i-1] == t2[j-1]){                          	
                    dp[i][j] = 1+ dp[i-1][j-1];
                    s[i][j] = 1;
                }else {
               
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                    if(dp[i-1][j]>dp[i][j-1]) {
                    	s[i][j] = 2;
                    }else {
                    	s[i][j] = 3;
                    }
                }
            }
        }
        int len= dp[length1][length2];
        int[] re = t1;        
        int i = length1;
        int j = length2;
        while(i>0&&j>0)
        {
            if(s[i][j]==1)
            {            	
                re[i-1]=0;
                i--;
                j--;
            }else if(s[i][j]==2) {          
                i--;
            }else if(s[i][j]==3) {
            	j--;
            }
        }
        int[] result = new int[length1-len];
        int index=0;
        for(int y = 0; y<length1;y++) {
        	if(!(re[y]==0)) {
        		result[index]=re[y];
        		index++;
        	}
        }
       
        return result;
    }
}
