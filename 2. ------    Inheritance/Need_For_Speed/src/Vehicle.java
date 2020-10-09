public class Vehicle {
    public static final double DEFAULT_FUEL_CONSUMPTION = 1.25;
    private double fuelConsumption;
    private double fuel;
    private int horsePower;

    public Vehicle(double fuel, int horsePower) {
        this.fuel = fuel;
        this.horsePower = horsePower;
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }

    public double getFuelConsumption() {
        return this.fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        if (this.fuelConsumption == 0.0) {
            this.fuelConsumption = fuelConsumption;
        }

    }

    public double getFuel() {
        return this.fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void drive(double kilometers) {
        double fuelNeeded = this.fuelConsumption * kilometers;
        if (this.fuel >= fuelNeeded) {
            this.fuel -= fuelNeeded;
        }
    }

}
