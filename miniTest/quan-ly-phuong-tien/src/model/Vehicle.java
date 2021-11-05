package model;

public class Vehicle {
    private String brand;
    private String color;
    private int price;
    private int id = 0;

    public Vehicle() {
    }

    public Vehicle(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}
