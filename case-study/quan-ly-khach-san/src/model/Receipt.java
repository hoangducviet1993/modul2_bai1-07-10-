package model;

public class Receipt {
    private String customerName;
    private String staffName;
    private double checkIn;
    private double checkOut;
    private double totalPrice =0;
    private int receiptId = 0 ;

    public Receipt() {
    }

    public Receipt(String customerName, String staffName, double checkIn, double checkOut, double totalPrice, int receiptId) {
        this.customerName = customerName;
        this.staffName = staffName;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.totalPrice = totalPrice;
        this.receiptId = receiptId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public double getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(double checkIn) {
        this.checkIn = checkIn;
    }

    public double getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(double checkOut) {
        this.checkOut = checkOut;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(int receiptId) {
        this.receiptId = receiptId;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "customerName='" + customerName + '\'' +
                ", staffName='" + staffName + '\'' +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                ", totalPrice=" + totalPrice +
                ", receiptId=" + receiptId +
                '}';
    }
}
