package jun29th;

import java.util.ArrayList;


public class ArrayofGenerics {

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
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}

		
		

	}

}
