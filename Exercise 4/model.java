package model;

class Car {
    private String color;
    private String licensePlate;

    public Car(String licensePlate, String color) {
        this.color = color;
        this.licensePlate = licensePlate;
    }

    public String getColor(){
        return this.color;
    }
    public String getLicensePlate(){
        return this.licensePlate;
    }

    public String toString(){
        return (color + " " + licensePlate);
    }

}

class ParkingSpot {
    private Car car;
    private int spotNumber;

    public ParkingSpot(int spotNumber){
        this.spotNumber = spotNumber;
    }
    public boolean isFree (){
        return this.car == null;
    }

    public Car getCar() {
        return this.car;
    }
    public void parkCar(Car car) {
        this.car = car;
    }
    public void removeCar(){
        this.car = null;
    }
    public String toString(){
        if (isFree()) {
            return ("Spot " + spotNumber + ": free");
        }
        return ("Spot " + spotNumber + ": Car " + this.car);
    }
}

class ParkingGarage {
    private String name;
    private ParkingSpot[] spots;

    public ParkingGarage(String name, int spots) {
        this.name = name;
        this.spots = new ParkingSpot[spots];
        for (int i = 0; i < spots; i++) {
            this.spots[i] = new ParkingSpot(i + 1);
        }
    }

    public boolean parkCar(Car car) {
        for (int i = 0; i < this.spots.length; i++) {
            if (this.spots[i].isFree()){
                this.spots[i].parkCar(car);
                return true;
            }
        }
        return false;
    }
    public boolean removeCar(String licensePlate) {
        for (int i = 0; i < this.spots.length; i++) {
            if (this.spots[i].getCar().getLicensePlate() == licensePlate) {
                this.spots[i].removeCar();
                return true;
            }
        }
        return false;
    }

    public void showGarage(){
        System.out.println(name);
        for (int i = 0; i < this.spots.length; i++) {
            System.out.println(spots[i]);
        }
    }
}