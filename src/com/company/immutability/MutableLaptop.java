package com.company.immutability;

public class MutableLaptop {
    private String model;
    private String sistemOperare;

    public MutableLaptop(String model, String sistemOperare) {
        this.model = model;
        this.sistemOperare = sistemOperare;
    }

    public String getModel() {
        return model;
    }

    public String getSistemOperare() {
        return sistemOperare;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSistemOperare(String sistemOperare) {
        this.sistemOperare = sistemOperare;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", sistemOperare='" + sistemOperare + '\'' +
                '}';
    }
}
