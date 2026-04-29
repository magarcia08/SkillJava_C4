package estudio;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author merch
 */
public class ejercicio1 {
    public static void main(String[] args) {
        
        byte documento;
        String estado;
        byte estrato;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su documento de id: ");
        documento = teclado.nextByte();

        System.out.println("Ingrese su estado (A o S): ");
        estado = teclado.next();

        System.out.println("Ingrese su estrato (1 al 5): ");
        estrato = teclado.nextByte();

        if (estado.equals("S")) {
            System.out.println("Su tarifa es 0");

        } else if (estado.equals("A")) {
            if (estrato == 1) {
                System.out.println("Su tarifa es 10.000");
            } else if (estrato == 2) {
                System.out.println("Su tarifa es 15.000");
            } else if (estrato == 3) {
                System.out.println("Su tarifa es 30.000");
            } else if (estrato == 4) {
                System.out.println("Su tarifa es 50.000");
            } else if (estrato == 5) {
                System.out.println("Su tarifa es 65.000");
            } else {
                System.out.println("Ponga un estrato del 1 al 5");
            }

        } else {
            System.out.println("Estado inválido, ingrese A o S");
        }
    }
}
