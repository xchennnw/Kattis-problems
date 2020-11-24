import java.util.Scanner;
import java.util.Arrays;

public class cccode {
	public static void main(String args[])
    { 
		Scanner sc = new Scanner(System.in);
		String aaa = sc.nextLine();
		String bbb = sc.nextLine();
		sc.close();
		
		
		int a = getInt(aaa);
		int[] b = getArray(bbb);
		
		
		print(a,b);
		
    }
	
	//store the first line of input as an int
	public static int getInt(String x) {
		int a = Integer.parseInt(x);
		return a;
	}
	
	//store the second line of input as an int array
	public static int[] getArray(String x) {
		
		String[] ss = x.split(" ");
		int[] aaa = new int[ss.length];
		for(int i = 0; i<ss.length; i++ ) {
			aaa[i] = Integer.parseInt(ss[i]);
		}
		return aaa;
	}
			
	public static void print(int length, int[] a) {
		//sort the array
		Arrays.sort(a);
		
		//int i is the index
		int i = 0;
		//int group is used to count the continuous numbers
		int group = 1;
		while(i<length-1) {
			
			if(a[i+1] == a[i]+1) {
				group++;
			}
			else {	
				if(group > 2) {
					System.out.print(a[i+1-group]+"-"+a[i]+" ");
				}else
				if(group == 2) {
					System.out.print(a[i-1]+" "+a[i]+" ");
				}else
				{
				    System.out.print(a[i]+" ");
				}
				group = 1;
			}			
		    i++;		    
		}
		i = length-1;
		if(group > 2) {
			System.out.print(a[i+1-group]+"-"+a[i]+" ");
		}else
		if(group == 2) {
			System.out.print(a[i-1]+" "+a[i]+" ");
		}else
		{
		    System.out.print(a[i]+" ");
		}
		
	}
	

}