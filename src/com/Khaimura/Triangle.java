package com.Khaimura;

public class Triangle {
    private double sideOne;
    private double sideTwo;
    private double sideThree;


    public Triangle() {
        // TODO Auto-generated constructor stub
    }

    public Triangle(double sideOne, double sideTwo, double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;

    }

    public double getSideOne() {
        return sideOne;
    }

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

    public double getSideThree() {
        return sideThree;
    }

    public void setSideThree(double sideThree) {
        this.sideThree = sideThree;
    }


    public double formulaOfTheHeron() {
        double semi_perimeter = (sideOne + sideTwo + sideThree) / 2;
        double area = Math.sqrt(semi_perimeter * (semi_perimeter - sideOne) * (semi_perimeter - sideTwo) * (semi_perimeter - sideThree));
        return area;
    }


    void print() {
        System.out.println(
                "Triangle " + '\n' +
                "sideOne= " + sideOne + '\n' +
                "sideTwo= " + sideTwo + '\n' +
                "sideThree= " + sideThree + '\n' +
                "Formula Of The Heron (Triangle area)= "+formulaOfTheHeron()
        );
    }
}