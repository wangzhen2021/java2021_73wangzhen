package com.daniu2021._Example01;

public class Person {

    private  String name;
    private  double weight;
    private  double height;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight<0){
            System.err.println("您输出的体重不合理！");
        }else
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height<0){
            System.err.println("您输出的身高不合理！");
        }else
            this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
