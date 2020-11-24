import java.io.*;
import java.util.*;

public class contest {
	

	public static void main(String args[]) throws Exception
    { 
		
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(sc.readLine());
		while (a!=0) {
			
			TreeMap<String, ArrayList<String>> map = new TreeMap<>();
            
            while (a > 0) {
                String name = sc.readLine();
                String two = name.substring(0, 2);
                if (!map.containsKey(two)) {
                    map.put(two, new ArrayList<>(Arrays.asList(name)));
                }
                else {
                    map.get(two).add(name);
                }
                a--;
            }
            for (Map.Entry<String, ArrayList<String>> m : map.entrySet()) {
                for (String s : m.getValue())
                    System.out.println(s);
            }
            System.out.println();
			
            a = Integer.parseInt(sc.readLine());
			
			
		}
    }
		
}
