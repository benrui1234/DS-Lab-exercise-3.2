public class Item {
    private static String name;

    public Item(String name) {
        this.name = name;
    }

    // Get item name
    public static String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}