import java.util.*;

class TrainConsistApp {

    public static <Bogie, Bogie, Bogie> void main(String[] args) {

        // Step 1: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("First Class", 24));

        // Step 2: Stream → map → reduce
        int totalSeats = bogies.stream()
                .map(Bogie::getCapacity)   // Extract capacity
                .reduce(0, Integer::sum);  // Aggregate

        // Step 3: Display result
        System.out.println("Total Seating Capacity: " + totalSeats);

        // Program continues...
    }
}