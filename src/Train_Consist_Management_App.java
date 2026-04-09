import java.util.*;

// Step 1: Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Step 2: Goods Bogie Class
class GoodsBogie {
    private String type;
    private String cargo;

    public GoodsBogie(String type) {
        this.type = type;
    }

    public void assignCargo(String cargo) {

        try {
            // Step 3: Safety Validation
            if (type.equalsIgnoreCase("Rectangular") &&
                    cargo.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException(
                        "Petroleum cannot be assigned to Rectangular bogie"
                );
            }

            // Safe assignment
            this.cargo = cargo;
            System.out.println("Cargo assigned: " + cargo + " to " + type + " bogie");

        } catch (CargoSafetyException e) {
            // Step 4: Handle Exception
            System.out.println("Error: " + e.getMessage());

        } finally {
            // Step 5: Always executes
            System.out.println("Assignment attempt completed for " + type + " bogie\n");
        }
    }

    @Override
    public String toString() {
        return type + " -> " + (cargo != null ? cargo : "No Cargo");
    }
}

