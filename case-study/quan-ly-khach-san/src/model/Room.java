package model;

public class Room {
    private int roomId;
    private boolean Status;
    private int numberOfBeds;
    private int numberOfToilet;
    private double price;

    public Room() {
    }

    public Room(int id, boolean status, int numberOfBeds, int numberOfToilet, double price) {
        this.roomId = id;
        Status = status;
        this.numberOfBeds = numberOfBeds;
        this.numberOfToilet = numberOfToilet;
        this.price = price;
    }

    public int getId() {
        return roomId;
    }

    public void setId(int id) {
        this.roomId = id;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfToilet() {
        return numberOfToilet;
    }

    public void setNumberOfToilet(int numberOfToilet) {
        this.numberOfToilet = numberOfToilet;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id='" + roomId + '\'' +
                ", Status=" + Status +
                ", numberOfBeds=" + numberOfBeds +
                ", numberOfToilet=" + numberOfToilet +
                ", price=" + price +
                '}';
    }
}
