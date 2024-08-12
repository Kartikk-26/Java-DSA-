import java.util.Scanner;

public class NestedSwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a category:");
        System.out.println("1 Electronics\n2 Clothing\n3 Groceries");
        int category = scanner.nextInt();

        switch (category) {
            case 1: // Electronics
                System.out.println("Select an item:");
                System.out.println("1 Laptop");
                System.out.println("2 Smartphone");
                System.out.println("3 Tablet");
                int electronicsItem = scanner.nextInt();
                switch (electronicsItem) {
                    case 1:
                        System.out.println("You selected Laptop.");
                        break;
                    case 2:
                        System.out.println("You selected Smartphone.");
                        break;
                    case 3:
                        System.out.println("You selected Tablet.");
                        break;
                    default:
                        System.out.println("Invalid item selected in Electronics.");
                        break;
                }
                break;

            case 2: // Clothing
                System.out.println("Select an item:");
                System.out.println("1 Shirt");
                System.out.println("2 Jeans");
                System.out.println("3 Jacket");
                int clothingItem = scanner.nextInt();
                switch (clothingItem) {
                    case 1:
                        System.out.println("You selected Shirt.");
                        break;
                    case 2:
                        System.out.println("You selected Jeans.");
                        break;
                    case 3:
                        System.out.println("You selected Jacket.");
                        break;
                    default:
                        System.out.println("Invalid item selected in Clothing.");
                        break;
                }
                break;

            case 3: // Groceries
                System.out.println("Select an item:");
                System.out.println("1 Milk");
                System.out.println("2 Bread");
                System.out.println("3 Eggs");
                int groceriesItem = scanner.nextInt();
                switch (groceriesItem) {
                    case 1:
                        System.out.println("You selected Milk.");
                        break;
                    case 2:
                        System.out.println("You selected Bread.");
                        break;
                    case 3:
                        System.out.println("You selected Eggs.");
                        break;
                    default:
                        System.out.println("Invalid item selected in Groceries.");
                        break;
                }
                break;

            default:
                System.out.println("Invalid category selected.");
                break;
        }

        scanner.close();
    }
}
