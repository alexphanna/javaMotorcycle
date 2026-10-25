/**

 * Project: Lab 1.5
 * Purpose Details: Wheel for Motorcycle
 * Course: CMPSC 221
 * Author: Alex Hanna
 * Date Developed: 10/23/2026
 * Last Date Changed: 10/23/2026
 * Rev: 1

 */

class Wheel {
    private double size;
    private Tire tire;
    public Wheel(double size) {
        this.size = size;
        this.tire = new Tire(32.0, 8.0);
    }
    public Tire getTire() {
        return tire;
    }
    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }
    public void setTire(Tire tire) {
        this.tire = tire;
    }
}