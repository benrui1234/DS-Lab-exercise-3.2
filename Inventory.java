import java.util.ArrayList;

public class Inventory {
    private static ArrayList<Item> items;
    private static int itemsCount;

    // Constructor
    public Inventory(int count) {
        // Initialize the items list
        this.itemsCount = count;
    }

    // Method to add an item to the inventory
    public static void addItem(String item) {
        // Adds an item
        items.add(item);
        itemsCount += 1;
        System.out.println(item + "has been added.");
    }

    // Method to remove an item from the inventory
    public static void removeItem(String item) {
        // Removes an item if it exists, if it doesn't then implement proper error handling
        if (items.contains(item)) {
            items.remove(item);
            itemsCount -= 1;
            System.out.println("The item has been removed.");
        } else {
            System.out.println("The item does not exist.");
        }
    }

    // Method to check if an item exists in the inventory
    public static void hasItem(String item) {
        if (items.contains(item)) {
            System.out.println("The item exists.");
        } else {
            System.out.println("The item does not exist.");
        }
    }

    // Method to display all items in the inventory
    public static void displayItems() {
        // Displays all items
        System.out.println(items.toString());
    }

    // Method to get the total number of items
    public static int getItemCount() {
        // Gets the total number of items
        System.out.println("There are " + itemsCount + " items in your inventory.");
        return itemsCount; // Placeholder
    }
}