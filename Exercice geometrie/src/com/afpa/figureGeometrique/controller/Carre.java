package com.afpa.figureGeometrique.controller;

import com.afpa.FigureGeometriqueInterface;

public class Carre extends Quadrilatere implements FigureGeometriqueInterface {


    public Carre(double coteA, double coteB) {
        super(coteA, coteB);
    }

    public double calculAire(){
        return getCoteA() * getCoteB();
    }

    public double calculPerimetre(){
        return getCoteA()*4;
    }
}

