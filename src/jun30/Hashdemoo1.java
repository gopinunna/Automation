package jun30;

import java.util.HashSet;
import java.util.Set;

public class Hashdemoo1 {

	public static void main(String[] args) {
		Set<String> hs=new HashSet<String>();
		//hs.add("gopi");
		System.out.println(hs.add("gopi"));
		System.out.println(hs.add("selenium"));
		System.out.println(hs.add("kosmik"));
		//System.out.println(hs.add("gopi"));
		System.out.println(hs.size());
		
		//for each loop
		for(String temp:hs)
		{
			System.out.println(temp);
		}

	}

}
