package archivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author lk23
 */
public class Principal {

    private String ultimoArchivo;

    public static void main(String[] args) throws IOException {
        menu();
    }
    
    private static void menu() throws IOException {
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean end = true;
        
        do {
            System.out.println("1. Archivo");
            System.out.println("2. Directorio");
            System.out.println("3. Salir");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    line();
                    subMenu1(sc);
                    break;
                case 2:
                    line();
                    subMenu2(sc);
                    break;
                case 3:
                    end = false;
                    break;
                default:
                    System.out.println("Valor invalido \n");
                    break;
            }
        } while (end == true);
    }

    private static void subMenu1(Scanner sc) throws IOException {
        boolean end = true;
        Leer l = new Leer();
        Agregar a = new Agregar();
        Crear c = new Crear();
        Duplicar d = new Duplicar();

        String ruta;
        String nombre;
        int opcion = 0;
        int opcion2;

        do {
            System.out.println("1. Crear archivo");
            System.out.println("2. Leer archivo");
            System.out.println("3. Copiar Archivo");
            System.out.println("4. Escribir en archivo");
            System.out.println("5. Atras");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el nombre del archivo que quieres crear: ");
                    ruta = sc.next();
                    c.nuevoArchivo(ruta);
                    break;
                case 2:
                    System.out.print("Introduce el nombre del archivo que quieres leer: ");
                    nombre = sc.next();
                    l.leer(nombre);
                    break;
                case 3:
                    System.out.print("Introduce el nombre del archivo que quieres copiar:");
                    String copia = sc.next();
                    System.out.println("Introduce el nombre del nuevo archivo");
                    String nuevaCopia = sc.next();
                    File source = new File(copia);
                    File target = new File(nuevaCopia);
                    d.copiar(source, target);
                    break;
                case 4:
                    System.out.print("Introduzca el nombre del archivo: ");
                    String nombreArchivo = sc.next();
                    System.out.println("1. escribir sobre el archivo\n"
                            + "2. despues del archivo\n"
                            + "3. atras");
                    opcion2 = sc.nextInt();
                    switch (opcion2) {
                        case 1:
                            a.escribirSobre(nombreArchivo, false);
                            break;
                        case 2:
                            a.escribirSobre(nombreArchivo, true);
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Valor Invalido");
                            break;
                    }
                    break;
                case 5:
                    end = false;
                    break;
                default:
                    line();
                    System.out.println("Valor invalido \n");
                    break;
            }
            line();
        } while (end);
    }

    private static void subMenu2(Scanner sc) {
        Listar l = new Listar();
        l.leerDirectorio();
    }

    static void line() {
        System.out.println("-----------------");
    }

}
