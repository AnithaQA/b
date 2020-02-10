package gitPractice;

import java.util.HashMap;
import java.util.Map;

public class Test1 {

	public static void main(String[]args) {
		
		
		
		String str="abcdeeff";
		
		char ch[]=str.toCharArray();
		
		Map <Character,Integer>map=new HashMap();
		
		for(char c:ch) {
			
			if(map.containsKey(c)){
			int counter=map.get(c);
			map.put(c, ++counter);
			
			}else {
				map.put(c, 1);
			}
			
		}
		
		System.out.println("Duplicates");
		
		for(char c:map.keySet()) {
			
			if(map.get(c)>1) {
				System.out.println(c);
			}
		}
		
		}
		
	}

