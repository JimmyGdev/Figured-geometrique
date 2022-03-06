package com.afpa.figureGeometrique.view;
import java.util.Scanner;

public class FigureGeometriqueView {
    private String typeGeometricalFigure;
    private String typeGeometricalOperation;
    private double nb1;
    private String repeindre;
    private String couleur;


    private static final Scanner sc = new Scanner(System.in);

    public FigureGeometriqueView() {
    }


    public String askGeometricalFigure(){
        System.out.println("Quel figure géométrique voulez vous faire? " +
                "carré, triangle, rectangle, cercle" );

        this.typeGeometricalFigure = sc.nextLine();
        return  typeGeometricalFigure;
    }

    public String  askGeometricalOperationType(){
        System.out.println("Quel operation géometrique voulez vous effectuer ? "
        + "surface, périmètre, hypoténuse ou trunc");

        this.typeGeometricalOperation = sc.nextLine();
        return typeGeometricalOperation;
    }

    public double askfigureParameters(){
            System.out.println("Donner un paramètre");
            this.nb1 =  sc.nextInt();
            return nb1;
        }

    public void affichResult(double result){
        System.out.println("Le résultat de l'opération est " + result);
        }

    public boolean repeindre(){
        System.out.println("Voulez vous repeindre le quadrilatère?" +
                    " oui ou non");
        this.repeindre = sc.nextLine();
        if (repeindre.equalsIgnoreCase("oui")){
            return true;
        }
        else{
            return false;
            }
        }

    public String couleurRepeinte(){
        System.out.println("De quel couleur?");
        this.couleur = sc.nextLine();
        return this.couleur;
        }

    }
