package Hotel;

import java.util.Scanner;

/**
 * @author Lopez Chaidez Luis Enrique
 */
public class HotelElVago{
    
    public static String nombre;
    private static String tipoHabitacion;
    private static double precio;
    private static int numCuartos;
    private static int estrellas;

    // @param args the command line arguments
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Crea el nombre de el hotel.");
        nombre = sc.nextLine();
        tipoHabitacion = sc.next();
        System.out.println("Habitaciones: ");
        numCuartos = sc.nextInt();
        System.out.println("Estrellas del hotel: ");
        estrellas = sc.nextInt();
    }

    public static Habitaciones habitacionRandom() {
        int numCuartos = (int) (Math.random() * 4);
        switch (numCuartos) {
            case 0:
                tipoHabitacion = "Presidencial";
                precio = 80000;
                numCuartos = 2;
                break;
            case 1:
                tipoHabitacion = "Economica";
                precio = 1000;
                numCuartos = 2;
                break;
            case 2:
                tipoHabitacion = "Lujosa";
                precio = 40000;
                numCuartos = 2;
                break;
            case 3:
                tipoHabitacion = "Perversion";
                precio = 2000;
                numCuartos = 2;
                break;
            default:
                break;
        }
        Habitaciones x = new Habitaciones(precio,tipoHabitacion,numCuartos);
        return x;
    }

}
