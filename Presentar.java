/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan Requenes
 */
public class Presentar {
    public static void main(String[] args) {
        
        double base = 10.5;
        double altura=6.7;
        double lado1 = 7;
        double lado2 = 8.4;
        Triangulo t = new Triangulo(altura,base);
        Triangulo t1 = new Triangulo(base, base, base);
        double a=t.area();
        double p = t1.perimetro();
        System.out.println("el area es :" + a);
        System.out.println("el perimetro es :" + p);
    }
}
