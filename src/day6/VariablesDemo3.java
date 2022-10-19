package day6;

public class VariablesDemo3 {
	
	
	
	int x;
	int y;
	static int z;

	public static void main(String[] args) {
		
		
		VariablesDemo3 obj1=new VariablesDemo3();
		System.out.println(obj1.x);
	    System.out.println(obj1.y);
		System.out.println(VariablesDemo3.z);
obj1.x=10;
obj1.y=20;
System.out.println(obj1.x);
System.out.println(obj1.y);
System.out.println(VariablesDemo3.z); 

	}

}
