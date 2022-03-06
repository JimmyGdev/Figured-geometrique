package com.afpa.figureGeometrique.controller;

import com.afpa.FigureGeometriqueInterface;


public class Cercle implements FigureGeometriqueInterface {
    private double rayon;

    public Cercle() {
    }

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double calculAire(){
        return Math.pow(Math.PI * this.rayon, 2);
    }

    public double calculPerimetre(){
        return 2 * Math.PI * this.rayon;
    }
}

