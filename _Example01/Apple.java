package com.daniu2021._Example01;


public class Apple {
    String brand;
    private double size;
    private boolean state;

    public Apple(String brand, double size, boolean state) {
        this.brand = brand;
        this.size = size;
        this.state = state;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public void call() {
        System.out.println("可以打电话");
    }
    public void  surfInternet(){
        System.out.println("可以上网浏览");
    }

    @Override
    public String toString() {
        return "Apple{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                ", state=" + state +
                '}';
    }
}
