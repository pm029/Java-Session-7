import java.util.HashSet; // Import the HashSet class
/*
 * A HashSet is a collection of items where every item is unique,
 * and it is found in the java.util package:
 */
public class HashSet2 {
	HashSet<String> trainers = new HashSet<String>();
	public void storeData() {
		
		trainers.add("Shafeeq");
		trainers.add("Luke");
		trainers.add("Ed");
		trainers.add("John");
		trainers.add("James");
		trainers.add("Shafeeq");
		trainers.add("James");
		trainers.add("john");
	    System.out.println(trainers);
		
	}
	
	public void display1() {
		System.out.println(trainers);
		
	}
	
	public void DoesItemExists() {
		if( trainers.contains("shafeeq")) {
			System.out.println("YEs he is here");
		}else {
			System.out.println("No he does not exists");
		}
	}
	
	public void accessSpecficElement() {
		
	}
	public void removeelement() {
		trainers.remove("shafeeq");
		
	}
	public void removeAllelement() {
		trainers.clear();
		display1();
		
	}
	public void numberofElements() {
		System.out.println(trainers.size());
		
	}
	public void LoopThroughAllElements() {
		for (String i : trainers) {
			  System.out.println(i);
			}
	}
}