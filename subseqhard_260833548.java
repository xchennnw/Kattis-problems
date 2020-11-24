import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class cccode {
	public static void main(String args[])
    { 
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int a = Integer.parseInt(s);
		
		for(int i=0; i<a; i++) {
			String blank = sc.nextLine();
			String l=sc.nextLine();
			String x =sc.nextLine();
	
			int[] t = toArray(x, Integer.parseInt(l));
			System.out.println(count(t));
		}
		
		sc.close();
		
				
    }
			
	public static int[] toArray(String x, int l) {
		
		int[] a = new int[l];
		String[] ss = x.split(" ");
		for(int i = 0; i<l; i++ ) {
			a[i]=Integer.parseInt(ss[i]);
		}		
		return a;			
	}
	
	 public static int count(int[] nums) {
	        // key: sum of the first x integers in the array
		    // value: the times that this sum shows up
	        Map<Integer, Integer> mp = new HashMap<>();
	        
	        mp.put(0, 1);

	        int sum = 0;
	        int count = 0;
	        for (int i=0; i<nums.length; i++) {
	            sum += nums[i];
	            
	            //We want to count the sums s in the map that sum-s = 47
	        	if (mp.containsKey(sum - 47)) {
	            count += mp.get(sum - 47);
	            }	           
	            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
	        }
	        return count;
	  }


	
	
	
	

}