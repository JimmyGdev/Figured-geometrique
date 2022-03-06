package com.afpa.figureGeometrique.controller;

import com.afpa.FigureGeometriqueInterface;


public class Triangle implements FigureGeometriqueInterface {
 private double base;
 private double hauteur;
 private double hypotenuse;

    public Triangle(double base, double hauteur) {
        this.base = base;
        this.hauteur = hauteur;
        this.hypotenuse = Math.sqrt(base * base + hauteur * hauteur);
    }

    public double calculAire(){
        return (this.base * this.hauteur)/2 ;
    }

    public double calculPerimetre(){
        return this.base + this.hauteur + this.hypotenuse;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }
}



