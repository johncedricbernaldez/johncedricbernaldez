import java.util.*;
public class Main {
	public static void main(String[] args) {
		LinkedList<String> prutas= new LinkedList<>();
		
		prutas.add("Apple");
		prutas.add("Banana");
		prutas.add("Orange");
		prutas.add("Mango");
		prutas.add("Watermelon");
		prutas.add("Grapes");
		prutas.add("Pear");
		prutas.add("Melon");
		prutas.add("Strawberry");
		prutas.add("Pineapple");
		
		System.out.println("List of Fruits:\n");
		for(int i=0; i < prutas.size(); i++){
			System.out.println(prutas.get(i));
		}
		prutas.remove("Watermelon");
		prutas.remove("Pear");
		prutas.remove("Melon");
		
	    System.out.println();
		System.out.println("Removing 3 from the list...");
		System.out.println();
		System.out.println("List of Fruits:\n");
		for(int j=0; j < prutas.size(); j++){
			System.out.println(prutas.get(j));
		}
	}
}