package com.afpa.figureGeometrique.controller;

public class Quadrilatere {

    private double coteA;
    private double coteB;
    private String color;


    public Quadrilatere() {
    }

    public Quadrilatere(double coteA, double coteB) {
        this.coteA = coteA;
        this.coteB = coteB;

    }

    public Quadrilatere(int coteA, int coteB, String color) {
        this.coteA = coteA;
        this.coteB = coteB;
        this.color = color;
    }

    public void color(String color) {
        System.out.println("Je repeint le quadrilatère en " + color);
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCoteA() {
        return coteA;
    }

    public void setCoteA(int coteA) {
        this.coteA = coteA;
    }

    public double getCoteB() {
        return coteB;
    }

    public void setCoteB(int coteB) {
        this.coteB = coteB;
    }
}

