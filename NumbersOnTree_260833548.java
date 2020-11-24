import java.util.*;
public class code {
	
public static void main(String[] args) {
	
Scanner scan = new Scanner(System.in);

int h = scan.nextInt();
long t = (long)(Math.pow(2 , h + 1) - 1);
long x = 0;
    
if (scan.hasNext())
    {
    char[] arr = scan.next().toCharArray();    
    for (char a : arr)
        {
        if (x == 'L')
            x = (2 * x) + 1;
        else
            x = (2 * x) + 2;
        }
    }
System.out.println(t - x);   
scan.close();
    }
}