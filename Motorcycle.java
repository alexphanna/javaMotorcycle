/**

 * Project: Lab 1
 * Purpose Details: Motorcycle
 * Course: IST 242
 * Author: Joe Oakes
 * Date Developed:
 * Last Date Changed:
 * Rev:

 */

// Motorcycle class
class Motorcycle {
    /**
     * The color of the bike
     */
    private String color;
    /**
     * The size of the bike
     */
    private double size;
    private Frame frame;
    private Wheel[] wheels;
    private Engine engine;
    private FuelTank fuelTank;
    private boolean headlightOn;
    private int gear;
    private boolean rightTurnSignalOn;
    private boolean leftTurnSignalOn;
    private String licensePlate;


    /**
     * Adds two numbers and returns the result.
     *
     * @param color This is the color of the bike frame.
     * @param size This is the size of the bike frame.
     * @param frameMaterial This is the material of the bike frame.
     * @param wheelSize This is the size of the bike wheels.
     * @param licensePlate This is the license plate of the bike.
     * @param engineSize This is the size of the bike engine.
     * @param engineType This is the type of the bike engine.
     * @param fuelTankCapacity This is the capacity of the bike fuel tank.
     */
    public Motorcycle(String color, double size, Material frameMaterial, double wheelSize, String licensePlate, double engineSize, String engineType, double fuelTankCapacity) {
        this.color = color;
        this.size = size;
        this.frame = new Frame(frameMaterial);
        this.wheels = new Wheel[2];
        this.wheels[0] = new Wheel(wheelSize);
        this.wheels[1] = new Wheel(wheelSize);
        this.engine = new Engine(engineSize, engineType);
        this.fuelTank = new FuelTank(fuelTankCapacity);
        this.headlightOn = false;
        this.gear = 0;
        this.rightTurnSignalOn = false;
        this.leftTurnSignalOn = false;
        this.licensePlate = licensePlate;
    }

    public boolean isHeadlightOn() {
        return headlightOn;
    }

    public void toggleHeadlight() {
        this.headlightOn = !this.headlightOn;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public boolean isRightTurnSignalOn() {
        return rightTurnSignalOn;
    }

    public void toggleRightTurnSignal() {
        this.rightTurnSignalOn = !this.rightTurnSignalOn;
    }

    public boolean isLeftTurnSignalOn() {
        return leftTurnSignalOn;
    }

    public void toggleLeftTurnSignal() {
        this.leftTurnSignalOn = !this.leftTurnSignalOn;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getGear() {
        return gear;
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getSize(){
        return size;
    }

    public void setSize(double size){
        this.size = size;
    }

    public Material getFrameMaterial(){
        return frame.getMaterial();
    }

    public double getTirePressure(){
        return wheels[0].getTire().getPressure();
    }

    public double getTreadDepth(){
        return wheels[0].getTire().getTreadDepth();
    }

    public double getWheelSize(){
        return wheels[0].getSize();
    }

    public Frame getFrame() {
        return frame;
    }

    public void start() {
        System.out.println("Bike started!");
    }
    public void stop() {
        System.out.println("Bike stopped.");
    }
}
