import java.io.*;
import java.util.*;

public class contest {
	
    static HashMap<String, HashSet<String>> node = new HashMap<>();
    static HashMap<String, String> parent = new HashMap<>();
    static HashMap<String, Boolean> ifVisit = new HashMap<>();
    static String first;
	

	public static void main(String args[]) throws Exception
    { 
		
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(sc.readLine());
		
		while (a > 0) {
            String[] sss = sc.readLine().split(" ");
            
            
            for (int i = 0; i < sss.length; i++) {
                if (!node.containsKey(sss[i])) {
                    node.put(sss[i], new HashSet<>());
                    ifVisit.put(sss[i], false);
                    parent.put(sss[i], "");
                }
                if(i>0) {
                node.get(sss[i]).add(sss[0]);
                node.get(sss[0]).add(sss[i]);
                }
            }
            a--;
        }
		
		String[] lastline = sc.readLine().split(" ");		
        first = lastline[0];        
        if (!dfs(lastline[1]))
            System.out.println("no route found");
        else {
        	
            String b = first;
            String path = "";
            while (b.length() != 0) {
                path += b + " ";
                b = parent.get(b);
            }
            System.out.println(path);
        }
        
        sc.close();
		
    }
	
	
	public static boolean dfs(String s) {
        if (!node.containsKey(s))
            return false;
        ifVisit.put(s, true);
        if (s.equals(first))
            return true;
        for (String ss : node.get(s)) {
            if (ifVisit.get(ss))
                continue;
            parent.put(ss, s);
            if (dfs(ss))
                return true;
        }
        return false;
    }
		
}
