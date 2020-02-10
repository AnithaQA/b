package gitPractice;

public class Test3 {
public static void main(String[]args) {
	//fibnocci
	
	int num=10, t1=0,t2=1, orginalInteger,sum;
	
	orginalInteger=num;
	
	for(int i=0;i<=orginalInteger;++i) {
		
		sum=t1+t2;
		t1=t2;
		t2=sum;
		
		System.out.print(sum + "+");
		
	}
	
	
	
	
	
	
}
}
