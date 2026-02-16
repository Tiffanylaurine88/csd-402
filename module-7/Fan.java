/**
 * File: Fan.java
 * Course: CSD-402
 * Module: 7
 * Author: Tiffany Davidson
 * Date: February 15, 2026
 *
 * Purpose:
 * This class models a basic fan with speed, on or off state, radius, and color.
 * It includes constants for fan speeds, constructors, and getter and setter methods.
 *
 * Notes:
 * - Uses the 'this' reference wherever allowed (constructors, setters, instance methods).
 */
public class Fan {

    // Speed constants required by assignment
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields with required defaults
    private int speed;
    private boolean on;
    private double radius;
    private String color;

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
     *
     * @param speed fan speed constant
     * @param on fan power state
     * @param radius fan radius
     * @param color fan color
     */
    public Fan(int speed, boolean on, double radius, String color) {
        this.setSpeed(speed);
        this.setOn(on);
        this.setRadius(radius);
        this.setColor(color);
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        if (speed != STOPPED && speed != SLOW && speed != MEDIUM && speed != FAST) {
            throw new IllegalArgumentException(
                    "Invalid speed. Use STOPPED(0), SLOW(1), MEDIUM(2), or FAST(3)."
            );
        }
        this.speed = speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be greater than 0.");
        }
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        if (color == null || color.trim().isEmpty()) {
            throw new IllegalArgumentException("Color cannot be null or blank.");
        }
        this.color = color.trim();
    }

    /**
     * Returns a readable speed label for display methods.
     * This is NOT toString, it is a helper method.
     *
     * @return speed label
     */
    public String getSpeedLabel() {
        if (this.speed == STOPPED) return "STOPPED";
        if (this.speed == SLOW) return "SLOW";
        if (this.speed == MEDIUM) return "MEDIUM";
        return "FAST";
    }
}
