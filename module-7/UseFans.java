import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * File: UseFans.java
 * Course: CSD-402
 * Module: 7
 * Author: Tiffany Davidson
 * Date: February 15, 2026
 *
 * Purpose:
 * This program creates a collection of Fan instances and displays each Fan without
 * using the toString() method. It includes display methods for a single Fan and
 * a collection of Fans.
 */
public class UseFans {

    /**
     * Displays one Fan instance without using toString().
     *
     * @param fan a single Fan object
     */
    public static void displayFan(Fan fan) {
        if (fan == null) {
            System.out.println("Fan: null");
            return;
        }

        System.out.println("Fan Details");
        System.out.println("On: " + fan.isOn());
        System.out.println("Speed: " + fan.getSpeedLabel() + " (" + fan.getSpeed() + ")");
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
    }

    /**
     * Displays a collection of Fan instances without using toString().
     *
     * @param fans collection of Fan objects
     */
    public static void displayFans(Collection<Fan> fans) {
        if (fans == null || fans.isEmpty()) {
            System.out.println("No fans to display.");
            return;
        }

        int count = 1;
        for (Fan fan : fans) {
            System.out.println();
            System.out.println("========================================");
            System.out.println("Fan #" + count);
            System.out.println("========================================");
            displayFan(fan);
            count++;
        }
        System.out.println();
    }

    /**
     * Test code required by assignment.
     * Creates and displays a collection of Fan instances.
     *
     * @param args command line args (not used)
     */
    public static void main(String[] args) {

        List<Fan> fanCollection = new ArrayList<>();

        // Create fans using both constructors
        Fan fan1 = new Fan(); // defaults
        Fan fan2 = new Fan(Fan.FAST, true, 10.0, "blue");
        Fan fan3 = new Fan(Fan.SLOW, true, 8.5, "black");

        // Update one fan using setters to show functionality
        fan1.setOn(true);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setRadius(7.0);
        fan1.setColor("white");

        // Add to collection
        fanCollection.add(fan1);
        fanCollection.add(fan2);
        fanCollection.add(fan3);

        // Display single instance method
        System.out.println("Single Fan Display (fan2):");
        System.out.println("----------------------------------------");
        displayFan(fan2);

        // Display collection method
        System.out.println();
        System.out.println("Collection Display (all fans):");
        displayFans(fanCollection);
    }
}
