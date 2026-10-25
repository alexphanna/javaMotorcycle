/**

 * Project: Lab 1.5
 * Purpose Details: Motorcycle
 * Course: CMPSC 221
 * Author: Alex Hanna
 * Date Developed: 10/23/2026
 * Last Date Changed: 10/23/2026
 * Rev: 1

 */

public class Main {
    public static void main(String[] args) {
        Motorcycle myMotorcycle = new Motorcycle("Red", 55.5, Material.ALUMINUM, 26.0, "ABC123", 2.0, "V-Twin", 5.0);
        myMotorcycle.toggleHeadlight();
        System.out.println("Motorcycle color: " + myMotorcycle.getColor());
        System.out.println("Motorcycle size: " + myMotorcycle.getSize());
        System.out.println("Frame material: " + myMotorcycle.getFrameMaterial());
        System.out.println("Headlight on: " + myMotorcycle.isHeadlightOn());
        System.out.println("License plate: " + myMotorcycle.getLicensePlate());
        System.out.println("Fuel tank capacity: " + myMotorcycle.getFuelTank().getCapacity());
        System.out.println("Fuel tank current level: " + myMotorcycle.getFuelTank().getCurrentLevel());
        System.out.println("Engine size: " + myMotorcycle.getEngine().getSize());
        System.out.println("Engine type: " + myMotorcycle.getEngine().getType());
        System.out.println("Frame material: " + myMotorcycle.getFrame().getMaterial());
        System.out.println("Wheel size: " + myMotorcycle.getWheelSize());
        System.out.println("Tire pressure: " + myMotorcycle.getTirePressure());
        System.out.println("Tread depth: " + myMotorcycle.getTreadDepth());
        myMotorcycle.start();
        myMotorcycle.stop();

        
        Motorcycle myMotorcycle2 = new Motorcycle("Brown", 50.5, Material.CARBON_FIBER, 28.0, "F7DAPL", 3.0, "V-Twin", 4.0);
        myMotorcycle2.toggleHeadlight();
        System.out.println("Motorcycle color: " + myMotorcycle2.getColor());
        System.out.println("Motorcycle size: " + myMotorcycle2.getSize());
        System.out.println("Frame material: " + myMotorcycle2.getFrameMaterial());
        System.out.println("Headlight on: " + myMotorcycle2.isHeadlightOn());
        System.out.println("License plate: " + myMotorcycle2.getLicensePlate());
        System.out.println("Fuel tank capacity: " + myMotorcycle2.getFuelTank().getCapacity());
        System.out.println("Fuel tank current level: " + myMotorcycle2.getFuelTank().getCurrentLevel());
        System.out.println("Engine size: " + myMotorcycle2.getEngine().getSize());
        System.out.println("Engine type: " + myMotorcycle2.getEngine().getType());
        System.out.println("Frame material: " + myMotorcycle2.getFrame().getMaterial());
        System.out.println("Wheel size: " + myMotorcycle2.getWheelSize());
        System.out.println("Tire pressure: " + myMotorcycle2.getTirePressure());
        System.out.println("Tread depth: " + myMotorcycle2.getTreadDepth());
        myMotorcycle2.start();
        myMotorcycle2.stop();

        
        Motorcycle myMotorcycle3 = new Motorcycle("Purple", 75.5, Material.STEEL, 24.0, "KLE8E6", 4.0, "V-Twin", 3.0);
        myMotorcycle3.toggleHeadlight();
        System.out.println("Motorcycle color: " + myMotorcycle3.getColor());
        System.out.println("Motorcycle size: " + myMotorcycle3.getSize());
        System.out.println("Frame material: " + myMotorcycle3.getFrameMaterial());
        System.out.println("Headlight on: " + myMotorcycle3.isHeadlightOn());
        System.out.println("License plate: " + myMotorcycle3.getLicensePlate());
        System.out.println("Fuel tank capacity: " + myMotorcycle3.getFuelTank().getCapacity());
        System.out.println("Fuel tank current level: " + myMotorcycle3.getFuelTank().getCurrentLevel());
        System.out.println("Engine size: " + myMotorcycle3.getEngine().getSize());
        System.out.println("Engine type: " + myMotorcycle3.getEngine().getType());
        System.out.println("Frame material: " + myMotorcycle3.getFrame().getMaterial());
        System.out.println("Wheel size: " + myMotorcycle3.getWheelSize());
        System.out.println("Tire pressure: " + myMotorcycle3.getTirePressure());
        System.out.println("Tread depth: " + myMotorcycle3.getTreadDepth());
        myMotorcycle3.start();
        myMotorcycle3.stop();
    }
}