import java.util.*;
public class DictonaryOpration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dictionary sample = new Hashtable();
		sample.put("101", "Java");
		sample.put("102", "Program");
		
		for(Enumeration i = sample.elements(); i.hasMoreElements();) {
			System.out.println("Value in Dictionary:" + i.nextElement());
		}
		
		System.out.println("\nValue at key = 6:" + sample.get("6"));
		System.out.println("Value at key = 1:" + sample.get("1"));
		
		System.out.println("\nIs Empty?:" + sample.isEmpty());
		System.out.println();
		
		for(Enumeration k = sample.keys(); k.hasMoreElements();) {
			System.out.println("Keys in Dictionary:" + k.nextElement());
		}	
		
	}

}
