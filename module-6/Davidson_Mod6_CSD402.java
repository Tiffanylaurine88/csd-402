/**
 * File: Davidson_Mod6_CSD402.java
 * Course: CSD-402
 * Module: 6
 * Author: Tiffany Davidson
 * Date: February 8, 2026
 *
 * Purpose:
 * This program defines a Fan class that models a basic fan with speed, on or off state,
 * radius, and color. The class includes constants for fan speeds, constructors, getters
 * and setters, and a toString method. The main method tests the Fan class by creating
 * two Fan instances and printing their states.
 *
 * Assignment Requirements Covered:
 * - Fan class with constants STOPPED, SLOW, MEDIUM, FAST set to 0, 1, 2, 3
 * - Private field speed with default STOPPED
 * - Private boolean field on (fan power state)
 * - Private field radius with default 6
 * - String field color with default "white"
 * - Getter and setter methods for all mutable fields
 * - No argument constructor sets defaults
 * - Argument constructor sets all values
 * - toString returns description of fan state
 * - Test code creates two instances and demonstrates functionality
 */

public class Davidson_Mod6_CSD402 {

    /**
     * Fan class models the state and behavior of a fan.
     */
    public static class Fan {

        /**
         * Speed constants required by assignment.
         */
        public static final int STOPPED = 0;
        public static final int SLOW = 1;
        public static final int MEDIUM = 2;
        public static final int FAST = 3;

        /**
         * Private fields required by assignment.
         * Defaults:
         * speed = STOPPED
         * on = false
         * radius = 6
         * color = "white"
         */
        private int speed = STOPPED;
        private boolean on = false;
        private double radius = 6.0;
        private String color = "white";

        /**
         * No argument constructor.
         * Sets all fields to default values.
         */
        public Fan() {
            this.speed = STOPPED;
            this.on = false;
            this.radius = 6.0;
            this.color = "white";
        }

        /**
         * Argument constructor.
         * Sets all fields based on parameters.
         *
         * @param speed fan speed value, should be one of the constants
         * @param on whether the fan is on
         * @param radius fan radius
         * @param color fan color
         */
        public Fan(int speed, boolean on, double radius, String color) {
            setSpeed(speed);
            this.on = on;
            setRadius(radius);
            setColor(color);
        }

        /**
         * Returns the current fan speed.
         *
         * @return speed as an int constant value
         */
        public int getSpeed() {
            return speed;
        }

        /**
         * Sets the fan speed.
         * Valid values are the constants STOPPED, SLOW, MEDIUM, FAST.
         *
         * @param speed new speed value
         * @throws IllegalArgumentException if speed is not valid
         */
        public void setSpeed(int speed) {
            if (speed != STOPPED && speed != SLOW && speed != MEDIUM && speed != FAST) {
                throw new IllegalArgumentException(
                        "Invalid speed. Use STOPPED(0), SLOW(1), MEDIUM(2), or FAST(3)."
                );
            }
            this.speed = speed;
        }

        /**
         * Returns whether the fan is on.
         *
         * @return true if fan is on, false otherwise
         */
        public boolean isOn() {
            return on;
        }

        /**
         * Sets the fan power state.
         *
         * @param on true turns fan on, false turns it off
         */
        public void setOn(boolean on) {
            this.on = on;
        }

        /**
         * Returns the fan radius.
         *
         * @return radius as a double
         */
        public double getRadius() {
            return radius;
        }

        /**
         * Sets the fan radius.
         *
         * @param radius new radius value
         * @throws IllegalArgumentException if radius is not positive
         */
        public void setRadius(double radius) {
            if (radius <= 0) {
                throw new IllegalArgumentException("Radius must be greater than 0.");
            }
            this.radius = radius;
        }

        /**
         * Returns the fan color.
         *
         * @return color string
         */
        public String getColor() {
            return color;
        }

        /**
         * Sets the fan color.
         *
         * @param color new color string
         * @throws IllegalArgumentException if color is null or blank
         */
        public void setColor(String color) {
            if (color == null || color.trim().isEmpty()) {
                throw new IllegalArgumentException("Color cannot be null or blank.");
            }
            this.color = color.trim();
        }

        /**
         * Converts speed constant into a readable string.
         *
         * @param speedConstant speed value
         * @return readable speed label
         */
        private String speedLabel(int speedConstant) {
            if (speedConstant == STOPPED) return "STOPPED";
            if (speedConstant == SLOW) return "SLOW";
            if (speedConstant == MEDIUM) return "MEDIUM";
            return "FAST";
        }

        /**
         * Returns a description of the fan state.
         * If the fan is off, it returns the fan is off plus color and radius.
         * If the fan is on, it returns speed plus color and radius.
         *
         * @return string description of fan status
         */
        @Override
        public String toString() {
            if (!on) {
                return "Fan is OFF | Color: " + color + " | Radius: " + radius;
            }
            return "Fan is ON | Speed: " + speedLabel(speed) + " (" + speed + ")" +
                    " | Color: " + color + " | Radius: " + radius;
        }
    }

    /**
     * Test code required by assignment.
     * Creates two Fan objects, one default and one using argument constructor.
     * Demonstrates getters, setters, and toString output.
     *
     * @param args command line args (not used)
     */
    public static void main(String[] args) {

        // Fan created using the default constructor
        Fan defaultFan = new Fan();

        // Fan created using the argument constructor
        Fan customFan = new Fan(Fan.FAST, true, 10.0, "blue");

        System.out.println("Default fan (created with no argument constructor):");
        System.out.println(defaultFan);
        System.out.println();

        System.out.println("Custom fan (created with argument constructor):");
        System.out.println(customFan);
        System.out.println();

        // Demonstrate setter and getter methods on the default fan
        System.out.println("Updating the default fan using setters...");
        defaultFan.setOn(true);
        defaultFan.setSpeed(Fan.MEDIUM);
        defaultFan.setRadius(8.5);
        defaultFan.setColor("black");

        System.out.println("Updated default fan state:");
        System.out.println(defaultFan);
        System.out.println();

        // Demonstrate getters
        System.out.println("Reading values using getters from updated default fan:");
        System.out.println("On: " + defaultFan.isOn());
        System.out.println("Speed: " + defaultFan.getSpeed());
        System.out.println("Radius: " + defaultFan.getRadius());
        System.out.println("Color: " + defaultFan.getColor());
    }
}
