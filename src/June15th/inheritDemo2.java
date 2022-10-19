package June15th;

public class inheritDemo2 {

	public static void main(String[] args) {
		//case 1
		//P obj=new P();
		//obj.m1("gopi");
		
		
		//case 2
				//C obj=new C();
				//obj.m1("gopi");
				
				//case 3=== failure case u cant refer parent object using chaild reference
				//C obj=new P();
				//obj.m1("gopi");
		
		//case 4 reference value is p and method is c's because u r overrideing only methods no variables
				P obj=new C();
				System.out.println(obj.x);
				obj.m1("gopi");

	}

}
