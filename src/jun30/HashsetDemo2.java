package jun30;

import java.util.HashSet;

public class HashsetDemo2 {

	public static void main(String[] args) {
HashSet<Object> hs=new HashSet<Object>();
		
		hs.add("Kosmik");
		
		hs.add(100);
		
		hs.add("Selenium");
		
		hs.add("Kosmik");
		
		hs.add("JavaScript");
		
		
		
		//System.out.println(hs);
		
		System.out.println(hs.size());
		
		for(Object temp:hs)
		{
			System.out.println(temp);
		}

	}


	}


