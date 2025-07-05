import java.util.LinkedList;

public class MyHashTable {

    // Inner class to store key-value pairs
    static class Entry {
        String key;
        String value;

        Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] table;
    private int capacity;

    @SuppressWarnings("unchecked")
    public MyHashTable(int capacity) {
        this.capacity = capacity;
        table = new LinkedList[capacity];
    }

    // Hash function: simple sum of character codes
    private int hash(String key) {
        int hashCode = 0;
        for (char ch : key.toCharArray()) {
            hashCode += ch;
        }
        return hashCode % capacity;
    }

    // Put a key-value pair into the table
    public void put(String key, String value) {
        int index = hash(key);

        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        // Check for existing key and update if found
        for (Entry entry : table[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }

        // Add new entry
        table[index].add(new Entry(key, value));
        System.out.println("Put (" + key + ", " + value + ")");
    }

    // Get the value for a given key
    public String get(String key) {
        int index = hash(key);

        if (table[index] != null) {
            for (Entry entry : table[index]) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
            }
        }

        return null; // key not found
    }

    // Main method for testing
    public static void main(String[] args) {
        MyHashTable map = new MyHashTable(10);

        map.put("name", "Alice");
        map.put("age", "25");

        System.out.println("Get 'name': " + map.get("name"));
    }
}
