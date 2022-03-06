package com.afpa.figureGeometrique.controller;

public class figureGeometriqueController {
    private String typeGeometricalFigure;
    private String typeGeometricalOperation;
    private double nb1;
    private double nb2;
    private double result;

    private Carre carre;
    private Triangle triangle;
    private Cercle cercle;
    private Rectangle rectangle;
    private boolean quadrilatereOrNot = false;


    public figureGeometriqueController() {
    }

    public figureGeometriqueController(String typeGeometricalFigure, String typeGeometricalOperation, double nb1, double nb2) {
        this.typeGeometricalFigure = typeGeometricalFigure;
        this.typeGeometricalOperation = typeGeometricalOperation;
        this.nb1 = nb1;
        this.nb2 = nb2;

        switch (typeGeometricalFigure){
            case ("carré"):
                this.carre = new Carre(nb1, nb2);
                this.quadrilatereOrNot = true;
                if (typeGeometricalOperation.equalsIgnoreCase("aire")){
                    this.result = carre.calculAire();
                }
                else {
                    this.result = carre.calculPerimetre();
                }
                break;
            case("triangle"):
                this.triangle = new Triangle(nb1, nb2);
                if (typeGeometricalOperation.equalsIgnoreCase("aire")){
                    this.result = triangle.calculAire();
            }
                else{
                    this.result = triangle.calculPerimetre();
                }
                break;
            case("cercle"):
                this.cercle = new Cercle(nb1);
                if (typeGeometricalOperation.equalsIgnoreCase("aire")){
                    this.result = cercle.calculAire();
                }
                else{
                    this.result = cercle.calculPerimetre();
                }
                break;
            case("rectangle"):
                this.rectangle = new Rectangle(nb1, nb2);
                this.quadrilatereOrNot = true;
                if (typeGeometricalOperation.equalsIgnoreCase("aire")){
                    this.result = rectangle.calculAire();
                }
                else{
                    this.result = rectangle.calculPerimetre();
                }
                break;
            default:
                System.out.println("Cette figure ou paramètre non reconnu");
        }
    }

    public boolean quadrilatereOrNot(){
        if (this.quadrilatereOrNot){
            return true;
        }
        return false;
    }

    public double getResult() {
        return this.result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public Carre getCarre() {
        return carre;
    }

    public void setCarre(Carre carre) {
        this.carre = carre;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }

    public Cercle getCercle() {
        return cercle;
    }

    public void setCercle(Cercle cercle) {
        this.cercle = cercle;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }
}
