package jun29th;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int [] a=new int[5];
		System.out.println("NO of elements in array"+a.length);
		
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		a[0]=100;
		a[1]=200;	
		a[2]=300;	
		a[3]=400;	
		a[4]=500;
			
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
