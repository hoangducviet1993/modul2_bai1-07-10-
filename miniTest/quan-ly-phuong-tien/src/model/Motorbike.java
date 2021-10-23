package model;

public class Motorbike extends  Vehicle{
    private int capacity;

    public Motorbike() {
    }

    public Motorbike(String brand, String color, int price, int capacity) {
        super(brand, color, price);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                super.toString()+
                "capacity=" + capacity +
                '}';
    }
}
