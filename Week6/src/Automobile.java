public class Automobile {

    // Private fields
    private String autoMake;
    private String autoModel;
    private String autoColor;
    private int autoYear;
    private int currentSpeed;

    // 1) AddVehicle method
    public String addVehicle(String autoMake, String autoModel, String autoColor, int autoYear) {
        this.autoMake = autoMake;
        this.autoModel = autoModel;
        this.autoColor = autoColor;
        this.autoYear = autoYear;
        this.currentSpeed = 0;   // start stopped
        return "Vehicle added successfully.";
    }

    // 2) RemoveVehicle method
    public String removeVehicle(String autoMake, String autoModel, String autoColor, int autoYear) {
        if (this.autoMake != null &&
                this.autoMake.equalsIgnoreCase(autoMake) &&
                this.autoModel.equalsIgnoreCase(autoModel) &&
                this.autoColor.equalsIgnoreCase(autoColor) &&
                this.autoYear == autoYear) {

            // Clear stored information
            this.autoMake = null;
            this.autoModel = null;
            this.autoColor = null;
            this.autoYear = 0;
            this.currentSpeed = 0;

            return "Vehicle removed.";
        } else {
            return "Vehicle information does not match stored data.";
        }
    }

    // 3) Accelerate method
    public int accelerate(int amount) {
        if (amount > 0) {
            currentSpeed += amount;
        }
        return currentSpeed;
    }

    // 4) Brake method
    public int brake(int amount) {
        if (amount > 0) {
            currentSpeed -= amount;
            if (currentSpeed < 0) {
                currentSpeed = 0;   // do not allow negative speed
            }
        }
        return currentSpeed;
    }

    // method to display current vehicle info
    public String getVehicleInfo() {
        return "Make: " + autoMake +
                ", Model: " + autoModel +
                ", Color: " + autoColor +
                ", Year: " + autoYear +
                ", Speed: " + currentSpeed;
    }

    // List current inventory (vehicle details)
    public String listInventory() {
        if (autoMake == null || autoMake.isEmpty()) {
            return "No vehicle in inventory.";
        } else {
            return "Inventory:\n" +
                    "  Make: " + autoMake + "\n" +
                    "  Model: " + autoModel + "\n" +
                    "  Color: " + autoColor + "\n" +
                    "  Year: " + autoYear + "\n" +
                    "  Current Speed: " + currentSpeed + " mph";
        }
    }

}
