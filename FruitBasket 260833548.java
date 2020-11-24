import java.util.Scanner;
import java.util.ArrayList;

public class code {
	public static void main(String args[])
    { 
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int N = Integer.parseInt(s);
		String ss = sc.nextLine();
	    sc.close();
	    ArrayList<Integer> arr = new ArrayList<>();
		String[] sss = ss.split(" ");
		for (int i = 0; i < N; i++) {
			arr.add(Integer.parseInt(sss[i]));
		}
		
		ArrayList<Integer> b = new ArrayList<>();
	    b.add(60); b.add(70); b.add(120);
	    
		System.out.print(result(arr, N));
		
					
    }
	
	public static int helper(ArrayList<Integer> a, int l, int n) {
		int count=0;
		int sub = 0;
		int add = 0;
		for(int i=0; i<l; i++) {
			int a1 = n+a.get(i);
			if(a1<200) {
				count++;
			}else if(a.get(i)<200) {
				add += a.get(i);
			}
			for(int j=i+1; j<l; j++) {
				int a2 = a1+a.get(j);
				if(a2<200) {
					count++;
				}else if(a.get(i)+a.get(j)<200) {
					add += a.get(i)+a.get(j);
				}
				for(int q=j+1; q<l; q++) {
					if(a.get(i)+a.get(j)+a.get(q)<200) {
						add += a.get(i)+a.get(j)+a.get(q);
					}
				}				
			}			
		}	
		sub = count*n;
		return add-sub;
	}
	
	public static int result(ArrayList<Integer> a, int b) 
	{       
		    int sum = 0;
		    if(b==1) {if(a.get(0)>=200) sum=a.get(0);}
		    else {
			    int x = a.get(0);
			    a.remove(0);
			    int y = helper(a,b-1,x);
			    sum = x*(int)(Math.pow(2, b-1)-1)+y+result(a,b-1)*2;
			    
		}
		return sum;
	}

}
