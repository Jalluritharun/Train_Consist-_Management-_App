import java.util.*;

public class TrainSafetyApp {

    public static void main(String[] args) {

        // Step 1: Create goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));

        // Step 2: Stream + allMatch validation
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.getType().equalsIgnoreCase("Cylindrical") ||
                                b.getCargo().equalsIgnoreCase("Petroleum")
                );

        // Step 3: Display result
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT");
        } else {
            System.out.println("Train is NOT SAFE");
        }

        // Program continues...
    }
}