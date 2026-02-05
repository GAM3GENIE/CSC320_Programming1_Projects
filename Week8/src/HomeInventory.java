import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HomeInventory {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        try{
            // call home class with parameterized constructor
            Home[] homes = new Home[1];
            homes[0] = new Home(
                   1560,
                   "750 Lincoln Road",
                    "Yuba City",
                    "CA",
                    95991,
                    "The Grove",
                    "available"
            );
            // list values
            System.out.println("=== Initial Inventory ===");
            for (int i = 0; i < homes.length; i++){
                System.out.println("Home " + (i + 1) + ": " + homes[i].homeInfo());
            }
            // remove home
            System.out.println("\n=== Remove Home ===");
            String removeResult = homes[0].removeHome();
            System.out.println(removeResult);
            // add home
            System.out.println("\n=== Add New Home ===");
            String addResult = homes[0].addHome(
                    1800,
                    "1255 Lincoln Road",
                    "Yuba City",
                    "CA",
                    95991,
                    "Lincoln Village",
                    "available"
            );
            System.out.println(addResult);
            // print new home after add
            System.out.println("\n=== Inventory After Add ===");
            for (int i = 0; i < homes.length; i++){
                System.out.println("Home " + (i + 1) + ": " + homes[i].homeInfo());
            }
            // update home
            System.out.println("\n=== Update Home ===");
            String updateResult = homes[0].updateHome(0, null, null, null, 0, null, "under contract");
            System.out.println(updateResult);
            // print home after update
            System.out.println("\n=== Inventory After Update ===");
            for (int i = 0; i < homes.length; i++){
                System.out.println("Home " + (i + 1) + ": " + homes[i].homeInfo());
            }
            // ask user if they want to print list
            System.out.print("\nDo you want to print the information to a file? (Y or N): ");
            String input = scn.nextLine().trim();
            if (input.equalsIgnoreCase("Y")){
                String dirPath = "C:\\Temp";
                String filePath = dirPath + "\\Home.txt";
                // create directory if not exist
                File dir = new File(dirPath);
                if (!dir.exists()){
                    dir.mkdir();
                }
                // helper to write to file
                writeInventoryToFile(homes, filePath);
            }else {
                System.out.println("file will not be printed");
            }
        } catch (Exception e) {
            System.out.println("error in main: " + e.getMessage());
        }finally {
            scn.close();
        }
    }
    // helper to write inventory to file
    private static void writeInventoryToFile(Home[] homes, String filePath){
        try(FileWriter writer = new FileWriter(filePath)){
            writer.write("Home Inventory\n");
            writer.write("================\n");
            for (int i = 0; i < homes.length; i++){
                writer.write("Home " + (i + 1) + ": " + homes[i].homeInfo() + System.lineSeparator());
            }
            System.out.println("Inventory written to file: " + filePath);
        }catch (IOException e){
            System.out.println("failed to write file: " + e.getMessage());
        }
    }
}
