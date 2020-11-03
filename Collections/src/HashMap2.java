import java.util.HashMap; // import the HashMap class
/*
 * Arrays store items as an ordered collection, and you have to access them
 * with an index number (int type).
 * A HashMap however,  * store items in "key/value" pairs, and you can access them
 * by an index * of another type (e.g. a String).
 *
 */
public class HashMap2 {
	
	HashMap<String, String> capitalCities = new HashMap<String, String>();
	
	public void storeData() {
		
		capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
		
	}
	
	public void display1() {
		System.out.println(capitalCities);
		
	}
	
	public void accessSpecficElement() {
		String captial=capitalCities.get("England");
		System.out.println("Captial of England is :"+captial);
	}
	public void removeelement() {
		capitalCities.remove("England");
		display1();
		
	}
	public void removeAllelement() {
		capitalCities.clear();
		display1();
		
	}
	
	public void numberofElements() {
		System.out.println(capitalCities.size());
		
	}
	public void LoopThroughAllElements() {
		
		for (String i : capitalCities.values()) {
			  System.out.println(i);
			}
		
		// Print keys and values
		for (String i : capitalCities.keySet()) {
		  System.out.println("key: " + i + " value: " + capitalCities.get(i));
		}
	}
}