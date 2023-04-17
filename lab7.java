import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab7 {
    public static void main(String[] args) {
        List<String> region = new ArrayList<>();
        region.add("Lviv-Lviv region");
        region.add("Dnipro-Dnipropetrovsk region");
        region.add("Kharkiv-Kharkiv region");
        region.add("Vinnytsia-Vinnytsia region");
        region.add("Odesa-Odesa region");
        region.add("Rivne-Rivne region");
        region.add("Poltava-Poltava region");
        region.add("Sumy-Sumy region");
        region.add("Cherkasy-Cherkasy region");
        region.add("Mykolaiv-Mykolaiv region");

        Scanner in = new Scanner(System.in);

        testAddElement(region, in);

        testGettingElement(region, in);

        testRemovingElement(region, in);
    }

    private static void testAddElement(List<String> region, Scanner in) {
        System.out.println("Enter city and region to add in the format City-Region: ");
        String elementToAdd = in.nextLine();
        region.add(elementToAdd);
        System.out.println("Element " + elementToAdd + " added");
        System.out.println("List of regions: " + region);
    }

    private static void testGettingElement(List<String> region, Scanner in) {
        System.out.println("Enter city to search: ");
        String city = in.next();
        in.nextLine(); 
        boolean found = false;
        for (String element : region) {
            String[] parts = element.split("-");
            if (parts[0].equalsIgnoreCase(city)) {
                System.out.println("City " + city + ": " + parts[1]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("City " + city + " not found");
        }
    }

    private static void testRemovingElement(List<String> region, Scanner in) {
        System.out.println("Enter city to delete: ");
        String cityToDelete = in.next();
        in.nextLine(); 
        boolean removed = false;
        for (int i = 0; i < region.size(); i++) {
            String element = region.get(i);
            String[] parts = element.split("-");
            if (parts[0].equalsIgnoreCase(cityToDelete)) {
                region.remove(i);
                System.out.println("Element " + element + " removed");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("City " + cityToDelete + " not found");
        }
        System.out.println("List of regions: " + region);
    }
}
