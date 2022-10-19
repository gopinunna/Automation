package jun29th;

import java.util.ArrayList;


public class ArrayofGenerics3 {

	public static void main(String[] args) {
		
		
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);

		System.out.println(al.size());
		//System.out.println(al.get(0));
		//System.out.println(al.get(1));
		//normal forloop
		//for(int i=0;i<al.size();i++)
		{
			//System.out.println(al.get(i));
		}
		
		// for each loop
		
		for(Integer temp:al)
			
		{
			System.out.println(temp);
		}
			
			

		
		

	}

}
