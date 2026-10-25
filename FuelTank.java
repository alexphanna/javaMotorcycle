/**

 * Project: Lab 1.5
 * Purpose Details: Fuel Tank for Motorcycle
 * Course: CMPSC 221
 * Author: Alex Hanna
 * Date Developed: 10/23/2026
 * Last Date Changed: 10/23/2026
 * Rev: 1

 */

public class FuelTank {
    private double capacity;
    private double currentLevel;

    public FuelTank(double capacity) {
        this.capacity = capacity;
        this.currentLevel = 0.0;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getCurrentLevel() {
        return currentLevel;
    }

    public void fill(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount to fill cannot be negative.");
        }
        currentLevel += amount;
        if (currentLevel > capacity) {
            currentLevel = capacity; // Prevent overfilling
        }
    }

    public void consume(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount to consume cannot be negative.");
        }
        currentLevel -= amount;
        if (currentLevel < 0) {
            currentLevel = 0; // Prevent negative fuel level
        }
    }
}
