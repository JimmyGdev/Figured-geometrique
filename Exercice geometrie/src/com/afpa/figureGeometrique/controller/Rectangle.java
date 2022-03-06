package com.afpa.figureGeometrique.controller;

import com.afpa.FigureGeometriqueInterface;

public class Rectangle extends Quadrilatere implements FigureGeometriqueInterface {

    private double longueur;
    private double largeur;

    public Rectangle(double coteA, double coteB) {
        super(coteA ,coteB);
        this.largeur = coteA;
        this.longueur = coteB;
    }



    public double calculAire(){
        return getLargeur() * getLongueur();
    }

    public double calculPerimetre(){
        return (getLargeur() * getLongueur()) * 2;
    }


    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }
}
