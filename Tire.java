/**

 * Project: Lab 1.5
 * Purpose Details: Tire for Motorcycle
 * Course: CMPSC 221
 * Author: Alex Hanna
 * Date Developed: 10/23/2026
 * Last Date Changed: 10/23/2026
 * Rev: 1

 */

public class Tire {
    private double pressure;
    private double treadDepth;    

    public Tire(double pressure, double treadDepth) {
        this.pressure = pressure;
        this.treadDepth = treadDepth;
    }

    public double getPressure() {
        return pressure;
    }

    public double getTreadDepth() {
        return treadDepth;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public void setTreadDepth(double treadDepth) {
        this.treadDepth = treadDepth;
    }
}
