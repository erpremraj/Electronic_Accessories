/**
 * 1. Electronics Gadgets Accessories Mini-Project
 */
package mini_project1;
import java.util.ArrayList;
import java.util.Scanner;

class Accessories {
    private int id;
    private String name;
    private String model;

    public Accessories(int id, String name, String model) {
        this.id = id;
        this.name = name;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {

        return "Electronic gadget ID: " + id + ", Electronic gadget Name: " + name + ", Model: " + model;
    }
}


public class Electronic_Accessories {
    private static ArrayList<Accessories> accessories = new ArrayList<>();
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	System.out.println("**************************************************||E-Accessories||******************************************************");
        while (true) {
        	
            System.out.println("1. Add Electronic gadget");
            System.out.println("2. View Electronic gadget");
            System.out.println("3. Update Electronic gadget");
            System.out.println("4. Delete Electronic gadget");
            System.out.println("5. Exit");
            System.out.println("**************************************************||E-Accessories||******************************************************");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                	addAccessory();
                    break;
                case 2:
                    viewAccessory();
                    break;
                case 3:
                    updateAccessory();
                    break;
                case 4:
                    deleteAccessory();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            
        }
    }

    private static void addAccessory() {
        System.out.print("Enter Electronic gadget ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Electronic gadget Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Model : ");
        String model = scanner.nextLine();
        accessories.add(new Accessories(id, name, model));
        System.out.println("Electronic gadget added successfully!");
    }

    private static void viewAccessory() {
        if (accessories.isEmpty()) {
            System.out.println("No Electronic gadget found.");
            return;
        }
        
        for (Accessories accessory : accessories) {
            System.out.println(accessory);
        }
        System.out.println("**************************************************||E-Accessories||******************************************************");
    }

    private static void updateAccessory() {
        System.out.print("Enter Electronic gadget ID to update: ");
        int id = scanner.nextInt();
        for (Accessories accessory : accessories) {
            if (accessory.getId() == id) {
                scanner.nextLine(); // Consume newline
                System.out.print("Enter new Electronic gadget Name: ");
                String newName = scanner.nextLine();
                System.out.print("Enter new Model : ");
                String newModel = scanner.nextLine();
                accessories.set(accessories.indexOf(accessory), new Accessories(id, newName, newModel));
                System.out.println("Accessory updated successfully!");
                return;
            }
        }
        System.out.println("Electronic gadget not found!");
    }

    private static void deleteAccessory() {
        System.out.print("Enter Electronic ID to delete: ");
        int id = scanner.nextInt();
        for (Accessories accessory : accessories) {
            if (accessory.getId() == id) {
            	accessories.remove(accessory);
                System.out.println("Electronic gadget deleted successfully!");
                return;
            }
        }
        System.out.println("Electronic gadget not found!");
    }
    
}