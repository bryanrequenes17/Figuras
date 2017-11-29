/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan Requenes
 */
public class Triangulo extends Figura{
    private double altura;
    private double base;
    private double lado1;
    private double lado2;

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public Triangulo(double base, double lado1, double lado2) {
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Triangulo(double altura, double base, double lado1, double lado2) {
        this.altura = altura;
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

   

    @Override
    public double area() {
     double areat = (base*altura)/2;
    return areat;
    }

    @Override
    public double perimetro() {
        return lado1+lado2+base; 
   }
}
