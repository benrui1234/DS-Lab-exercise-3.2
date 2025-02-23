import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Adds item
        public void addition() {
            System.out.print("Add an object to your inventory: ");
            String yourItems = scn.nextLine();
            Inventory.addItem(yourItems);
        }

        // Removes item
        public void subtraction () {
            System.out.print("Remove an object from your inventory: ");
            String yourItems1 = scn.nextLine();
            Inventory.removeItem(yourItems1);
        }

        // Checks if object is in the inventory
        public void checkItemInInventory () {
            System.out.print("Check if an object is in your inventory: ");
            String yourItems2 = scn.nextLine();
            Inventory.hasItem(yourItems2);
        }

        // Displays all items in the inventory
        public void displayItems() {
            System.out.print("Display the inventory (Y/N): ");
            String choices = scn.nextLine();
            if (choices.equals("Y")) {
                Inventory.displayItems();
            } else if (choices.equals("N")) {
                System.out.println(" ");
            } else {
                System.out.println("Not a valid option");
            }
        }

        // Gets total number of items
        public void totalItems () {
            System.out.print("Display the number of items in the inventory (Y/N): ");
            String choices1 = scn.nextLine();
            if (choices1.equals("Y")) {
                Inventory.getItemCount();
            } else if (choices1.equals("N")) {
                System.out.println(" ");
            } else {
                System.out.println("Not a valid option");
            }
    }
    }
}
