import java.util.ArrayList;
import java.util.List;

// Step 6: Main Application
class TrainCargoApp {

    public static void main(String[] args) {

        List<GoodsBogie> bogies = new ArrayList<>();

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        bogies.add(b1);
        bogies.add(b2);

        // ✅ Safe assignment
        b1.assignCargo("Petroleum");

        // ❌ Unsafe assignment (handled safely)
        b2.assignCargo("Petroleum");

        // ✅ Another safe assignment
        b2.assignCargo("Coal");

        // Display final state
        System.out.println("Final Bogie Status:");
        for (GoodsBogie b : bogies) {
            System.out.println(b);
        }

        // Program continues safely...
    }
}
