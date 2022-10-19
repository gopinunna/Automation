package Jul1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapiDemo1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hMap=new HashMap<Integer, String>();
		hMap.put(100, "gopi");
		hMap.put(200, "sam");
		hMap.put(400, "sri");
		hMap.put(500, "raj");
		//System.out.println(hMap.size());
		//System.out.println(hMap.containsKey(103));
		//System.out.println(hMap.get(102));
		Set<Entry<Integer, String>> entrySet=hMap.entrySet();
		System.out.println(hMap.keySet());
		System.out.println(hMap.values());
		for(Entry<Integer, String> entry:entrySet)
		{
			System.out.println(entry.getKey()+"....."+entry.getValue());
		}

	}

}
