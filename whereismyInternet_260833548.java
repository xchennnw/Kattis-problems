import java.io.*;
import java.util.*;

public class contest {
	
	static boolean[] h; //h[i]=true if i is connected, false if not 
	static ArrayList<ArrayList<Integer>> arr;
	

	public static void main(String args[]) throws Exception
    { 
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		String[] sss= sc.readLine().split(" ");
		int n = Integer.parseInt(sss[0]);
		int m = Integer.parseInt(sss[1]);
		
		h = new boolean[n+1];
		arr =  new ArrayList<>(n + 1);
		
		for (int i = 0; i <= n; i++) {
	        arr.add(new ArrayList<>());
		}
		
		for(int j=0; j<m; j++){
	    	    
			    sss= sc.readLine().split(" ");
	            int a = Integer.parseInt(sss[0]);
	            int b = Integer.parseInt(sss[1]);
	            arr.get(a).add(b);
	            arr.get(b).add(a);
	            
	    }
		
		
		bfs(1);
		boolean sign = true;
		StringBuilder ans = new StringBuilder();
		for (int k = 1; k <= n; k++)
            if (!h[k]) {
            	ans.append(k).append('\n');
            	sign = false;
            }
        if (sign) {
            System.out.println("Connected");
        }else {
        	System.out.println(ans);
        }
	
			
    }
	
	static void bfs(int a){
		Queue<Integer> q = new LinkedList<>();
        q.offer(a);
        h[a] = true;
        while (!q.isEmpty()) {
            int current = q.poll();
            for (int num : arr.get(current))
                if (!h[num]) {
                    h[num] = true;
                    q.offer(num);
                }
        }
	}

}
