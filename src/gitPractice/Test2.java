package gitPractice;

public class Test2 {
public static void main(String[]args) {
	
	String str="liril";
	
	String reverse= "";
	
	char ch[]=str.toCharArray();
	
	for(int i=ch.length-1;i>=0;i--) {
		
		reverse = reverse+ch[i];
		
		
		
	}
	if(str.equals(reverse)) {
		System.out.println(str+ " "+"Is palindrome");
	}else {
		System.out.println(str+ " "+"Is not Palindrome");
	}
}
	
	
	
	
	
	
}
