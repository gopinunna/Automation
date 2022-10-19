package jun29th;

import java.util.ArrayList;


public class ArrayofGenerics2 {

	public static void main(String[] args) {
		
		
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("gopi");
		al.add("kosmik");
		al.add("selenium");
		al.add("automation");
		al.add("testing");

		System.out.println(al.size());
		//System.out.println(al.get(0));
		//System.out.println(al.get(1));
		//normal forloop
		//for(int i=0;i<al.size();i++)
		{
			//System.out.println(al.get(i));
		}
		
		// for each loop
		
		for(String temp:al)
			
		{
			System.out.println(temp);
		}
			
			

		
		

	}

}
