import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ccode {
	
	 public static List<Integer> t = new ArrayList<Integer>();
	 public static List<List<Integer>> ans = new ArrayList<List<Integer>>();

	 
	
	public static void main(String args[])
    { 
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] s2 = s.split(" ");
		int N = Integer.parseInt(s2[0]);
		int p = Integer.parseInt(s2[1]);
		String ss = sc.nextLine();
	    sc.close();
	    
	    int[] arr = new int[N];
		String[] sss = ss.split(" ");
		for (int i = 0; i < N; i++) {
			arr[i]=Integer.parseInt(sss[i]);
		}
		
		
		System.out.print(count(arr, p));
		
					
    }
	public static int count(int[] nums, int p) {
        int pre = 0, maxAns = nums[0]-p;
        for (int x : nums) {
            pre = Math.max(pre + x-p, x-p);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }


	
  
}
