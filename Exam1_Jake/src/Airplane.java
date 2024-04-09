//Airplane.java
//Jake Beahan
//March 1, 2024

public class Airplane {

    private double altitude;
    private int passengerCount;


    public Airplane(){
        this.altitude = 0.0;
        this.passengerCount = 10;
    }

    public Airplane(double altitude, int passengerCount){
        this.altitude = altitude;
        this.passengerCount = passengerCount;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = Math.max(altitude, 0);
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = Math.max(passengerCount, 0);
    }

    public String toString(){
        return "Altitude: " + this.altitude + ", Passenger Count: " + this.passengerCount;
    }

    public void board(int number){
        this.passengerCount += number;
    }

    public void ascend(){
        this.altitude++;
    }
}