package com.codegym;

public class Product {
    String code;
    String name;
    String type;
    double price;
    String currencyUnit;

    public Product(String code, String name, String type, double price, String currencyUnit) {
        this.code = code;
        this.name = name;
        this.type = type;
        this.price = price;
        this.currencyUnit = currencyUnit;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCurrencyUnit() {
        return currencyUnit;
    }

    public void setCurrencyUnit(String currencyUnit) {
        this.currencyUnit = currencyUnit;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", currencyUnit='" + currencyUnit + '\'' +
                '}';
    }
}
