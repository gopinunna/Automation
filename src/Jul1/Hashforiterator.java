package Jul1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashforiterator {

	public static void main(String[] args) {
		Set<String> hs=new HashSet<String>();
		hs.add("raysinfo");
		hs.add("kosmik");
		hs.add("gopi");
		hs.add("kphb");
		
       System.out.println(hs);
		
		System.out.println(hs.size());
		
		Iterator<String> it=hs.iterator();
	
		while(it.hasNext())
		{
			System.out.println(it.next());
			//if additional //it.next();is givin then some o/p is escaped
			
		}
		
		

	}

}
