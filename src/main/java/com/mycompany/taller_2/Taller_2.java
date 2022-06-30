package com.mycompany.taller_2;

import java.util.Scanner;

/**
 *
 * @author Juan David Murcia Hernandez
 */
public class Taller_2 {

    /**
     * aca se crean los parametros para las diferentes naves
     *
     * @param args
     */
    public static void main(String[] args) {
        
        NavesEspaciales Lanzadera = new NaveLanzadera("Nombre de la nave: ", "la luna ", "Saturno V ", 0, 0, 0, 0, 0, 0, 0, "petróleo refinado y oxígeno líquido ") {
        };
        
        NavesEspaciales naveTripulada = new NaveEspacialTripulada("NombreDeTripulante", "destino", "nombre", 0, 0, 0, 0, 0, 0, 0, "combustible") {
        };
        
        NaveEspecialNoTripulada naveNoTripulada = new NaveEspecialNoTripulada("NombreDeTripulante", "destino", "nombre", 0, 0, 0, 0, 0, 0, 0, "combustible") {
        };

        var opcion = "";
        Scanner sc = new Scanner(System.in);
        String nombre, destino, color, combustible, paisCreador1, velocidad, NombreDeTripulante;
        /**
         * crearenmos el bucle para que solo finalice cuando le digitemos la
         * letra f, y una serie de casos a los cuales pueda acceder el usuario
         * al digitar una letra de a-f
         */

        do {
            /**
             * esta sera nuestra serie de casos a los cuales tendremos acceso
             */
            System.out.println("Introduzca una opcion de a-f");
            System.out.println("\nla opcion A mostrara los datos de una nave lanzadera");
            System.out.println("\nla opcion B mostrara los datos de una nave tripulada");
            System.out.println("\nla opcion C mostrara los datos de una nave no tripulada");
            System.out.println("\nla opcion D servira para crear una nave espacial");
            System.out.println("\nla opcion F sera para finalizar");

            opcion = sc.nextLine();

            switch (opcion.toUpperCase()) {
                case "A":
                    Lanzadera.verDatos();
                    break;

                case "B":
                    naveTripulada.verDatos();
                    break;

                case "C":
                    naveNoTripulada.verDatos();
                    break;

                case "D":
                    System.out.println("\nIngrese el nombre de la nave: ");
                    nombre = sc.nextLine();

                    System.out.println("\nIngrese el destino de la nave: ");
                    destino = sc.nextLine();

                    System.out.println("\nIngrese el color de la nave: ");
                    color = sc.nextLine();

                    System.out.println("\nIngrese el tipo de combustible de la nave: ");
                    combustible = sc.nextLine();

                    System.out.println("\nIngrese el pais creador de la nave: ");
                    paisCreador1 = sc.nextLine();

                    System.out.println("\nIngrese la velocidad de la nave: ");
                    velocidad = sc.nextLine();

                    System.out.println("\nIngrese el nombre del astronauta: ");
                    NombreDeTripulante = sc.nextLine();

                    System.out.println("\nSu nave es: " + nombre + "\ncon destino a: " + destino + "\nde color: " + color + "\ntipo de combustible: " + combustible + "\npais creador: " + paisCreador1
                            + "\nvelocidad de la nave: " + velocidad + " Km/h" + "\nnombre del astronauta: " + NombreDeTripulante);

                    break;

                default:
                    System.out.println("\n");

            }
            /**
             * este sera nuestra letra para finalizar la ejecucion por medio de
             * sc.close con la f
             */
            sc.nextLine();
        } while (opcion.compareToIgnoreCase("F") != 0);
        sc.close();

    }

}
