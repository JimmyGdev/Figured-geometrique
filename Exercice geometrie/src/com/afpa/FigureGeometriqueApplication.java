package com.afpa;

import com.afpa.figureGeometrique.view.FigureGeometriqueView;
import com.afpa.figureGeometrique.controller.*;
import java.util.Scanner;

public class FigureGeometriqueApplication {

    public static void main(String[] args) {

        boolean continueOrNot;
        String geometricalFigure;
        String geometricalTypeOperation;
        double parameter1;
        double parameter2;
        String reponse;

        Scanner sc = new Scanner(System.in);

        FigureGeometriqueView figureGeometriqueView = new FigureGeometriqueView();

        do{

            geometricalFigure = figureGeometriqueView.askGeometricalFigure();
            if (geometricalFigure.equalsIgnoreCase("cercle") || geometricalFigure.equalsIgnoreCase("carré")){
                parameter1 = figureGeometriqueView.askfigureParameters();
                geometricalTypeOperation = figureGeometriqueView.askGeometricalOperationType();
                sc.nextLine();
                figureGeometriqueController figureGeometriqueController = new figureGeometriqueController(geometricalFigure, geometricalTypeOperation, parameter1 , parameter1);
                figureGeometriqueView.affichResult(figureGeometriqueController.getResult());
               if (figureGeometriqueController.quadrilatereOrNot()){
                    if (figureGeometriqueView.repeindre()){
                        String couleur = figureGeometriqueView.couleurRepeinte();
                        figureGeometriqueController.getCarre().color(couleur);
                    }
               }

            }
            else{
                parameter1 = figureGeometriqueView.askfigureParameters();
                parameter2 = figureGeometriqueView.askfigureParameters();
                geometricalTypeOperation = figureGeometriqueView.askGeometricalOperationType();
                sc.nextLine();
                figureGeometriqueController figureGeometriqueController = new figureGeometriqueController(geometricalFigure, geometricalTypeOperation, parameter1 , parameter2);
                figureGeometriqueView.affichResult(figureGeometriqueController.getResult());
                if (figureGeometriqueController.quadrilatereOrNot()){
                    if (figureGeometriqueView.repeindre()){
                        String couleur = figureGeometriqueView.couleurRepeinte();
                        figureGeometriqueController.getRectangle().color(couleur);
                    }
                }

            }
            // Continue ou pas ?
            System.out.println("Voulez vous réaliser une autre opération ? (O/N)");
            reponse = sc.nextLine();

            continueOrNot = reponse.equals("O");
        }

        while (reponse.equalsIgnoreCase("o"));

    }
}
