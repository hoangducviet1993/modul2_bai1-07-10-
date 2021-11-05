package model;

public class Car extends Vehicle implements Comparable<Car> {
    private int seats;

    public Car() {
    }

    public Car(String brand, String color, int price, int seats) {
        super(brand, color, price);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Car{" +
                super.toString() +
                "seats=" + seats +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return getPrice()-o.getPrice();
    }
}
