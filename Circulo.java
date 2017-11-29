/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan Requenes
 */
public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }


    public double area() {
        return Math.PI*Math.pow(radio, 2);
    }

    public double perimetro() {
        return 2*Math.PI*radio;
    }
}
