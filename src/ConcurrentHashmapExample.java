import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashmapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Add key-value pairs to the map
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        // Access the map concurrently using multiple threads
        Runnable task1 = () -> {
            map.put("D", 4);
            System.out.println("Task1: Added D -> 4");
        };

        Runnable task2 = () -> {
            map.put("E", 5);
            System.out.println("Task2: Added E -> 5");
        };

        Runnable task3 = () -> {
            System.out.println("Task3: Value for key A -> " + map.get("A"));
        };

        // Start threads
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        thread1.start();
        thread2.start();
        thread3.start();

// Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final map
        System.out.println("Final Map: " + map);

    }
}
