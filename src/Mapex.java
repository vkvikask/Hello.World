import java.util.HashMap;
import java.util.Map.Entry;

public class Mapex {

	public static void main(String[] args) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		hm.put(101, 102);
		hm.put(201, 202);
		hm.put(301, 302);
		for (Entry<Integer, Integer> entry : hm.entrySet())  {
			System.out.println("key is      "+entry.getKey()+" "+"and its Value is   "+entry.getValue());
		} 
	    
	

	}

}
