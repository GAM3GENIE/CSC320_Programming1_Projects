public class Main {
    public static void main(String[] args) {
        // Create an Automobile object
        Automobile myCar = new Automobile();

        // 1) Test addVehicle
        System.out.println("=== Test 1: addVehicle ===");
        String addResult = myCar.addVehicle("Audi", "Q5", "Black", 2023);
        System.out.println(addResult);
        System.out.println(myCar.getVehicleInfo());

        // 2) Test accelerate and brake
        System.out.println("\n=== Test 2: accelerate and brake ===");
        int speed1 = myCar.accelerate(30);
        System.out.println("After accelerate(30): " + speed1);

        int speed2 = myCar.accelerate(20);
        System.out.println("After accelerate(20): " + speed2);

        int speed3 = myCar.brake(25);
        System.out.println("After brake(25): " + speed3);

        int speed4 = myCar.brake(10);
        System.out.println("After brake(10): " + speed4);

        // 3) Test removeVehicle (with matching info)
        System.out.println("\n=== Test 3: removeVehicle (match) ===");
        String removeResult = myCar.removeVehicle("Audi", "Q5", "Black", 2023);
        System.out.println(removeResult);
        System.out.println(myCar.getVehicleInfo());

        // 4) Test addVehicle again, then remove with mismatch
        myCar.addVehicle("Acura", "NSX", "Red", 1997);
        System.out.println("\n=== Test 4: removeVehicle (mismatch) ===");
        String mismatchResult = myCar.removeVehicle("Ford", "Mustang", "Silver", 2019);
        System.out.println(mismatchResult);
        System.out.println("Car still exists: " + myCar.getVehicleInfo());

        // Test listInventory (empty)
        System.out.println("=== Test listInventory (empty) ===");
        System.out.println(myCar.listInventory());

        // Add a car and test again
        myCar.addVehicle("Toyota", "Supra", "Blue", 1996);
        System.out.println("\n=== Test listInventory (with car) ===");
        System.out.println(myCar.listInventory());

        // Accelerate and check inventory
        myCar.accelerate(40);
        System.out.println("\n=== Test listInventory (after accelerate) ===");
        System.out.println(myCar.listInventory());

    }
}