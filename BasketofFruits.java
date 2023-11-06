import java.util.Scanner;
import java.util.Stack;

public class Basket {
    private Stack<String> items;

    public Basket() {
        items = new Stack<>();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void push(String item) {
        items.push(item);
    }

    public String pop() {
        if (!isEmpty()) {
            return items.pop();
        } else {
            return "Basket is empty.";
        }
    }

    public String peek() {
        if (!isEmpty()) {
            return items.peek();
        } else {
            return "Basket is empty.";
        }
    }

    public int size() {
        return items.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Basket basket = new Basket();
       boolean ulit  = true;
while(ulit){
        System.out.print("Enter the number of fruits you would like to catch: ");
        int numFruits = sc.nextInt();

        for (int i = 0; i < numFruits; i++) {
            System.out.print("Press A for apple, O for orange, M for mango, or G for guava: ");
            char choice = sc.next().toUpperCase().charAt(0);
            switch (choice) {
                case 'A':
                    basket.push("Apple");
                    break;
                case 'O':
                    basket.push("Orange");
                    break;
                case 'M':
                    basket.push("Mango");
                    break;
                case 'G':
                    basket.push("Guava");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    i--;
                    break;
            }
        }

        System.out.println("Fruits in the basket: " + basket.items);

        while (!basket.isEmpty()) {
            System.out.print("Enter E to start eating a fruit: ");
            char option = sc.next().toUpperCase().charAt(0);
            if (option == 'E') {
                String eatenFruit = basket.pop();
                System.out.println("Eating " + eatenFruit);
                if (!basket.isEmpty()) {
                    System.out.println("Fruits remaining in the basket: " + basket.items);
                } else {
                    System.out.println("No More Fruits");
                }
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
            System.out.println("Would you try again? Y/N");
            char tryagain = sc.next().toUpperCase().charAt(0);
            if(tryagain == 'Y'){
            	ulit = true;
            	continue;
        }
        else if(tryagain == 'N'){
        	ulit = false;
        	System.out.println("Thank you for eating the fruits!");
        	break;
        }
        else{
        	System.out.println("Please try again.");
        	ulit = true;
        	continue;
        }
     }
   }
}