package archivos;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author lk23
 */
public class Principal {

    public static void main(String[] args) throws IOException {
        boolean end = true;
        do {
            System.out.println("1. Archivo");
            System.out.println("2. Directorio");
            System.out.println("3. Salir");
            end = menu(end);
        } while (end == true);

    }

    private static boolean menu(boolean end) throws IOException {
        Scanner sc = new Scanner(System.in);
        int opcion;
        try {
            opcion = sc.nextInt();
        } catch (Exception e) {
            opcion = 0;
        }
        switch (opcion) {
            case 1:
                clearConsole();
                subMenu1(sc);
                break;
            case 2:
                clearConsole();
                subMenu2(sc);
                break;
            case 3:
                end = false;
                break;
            default:
                System.out.println("Valor invalido \n");
                break;
        }
        return end;
    }

    private static void subMenu1(Scanner sc) throws IOException {
        boolean b = true;
        int opcion = 0;
        do {
            System.out.println("1. Crear archivo");
            System.out.println("2. Leer archivo");
            System.out.println("3. Copiar Archivo");
            System.out.println("4. ");
            System.out.println("4. Atras");
            try {
                opcion = sc.nextInt();
            } catch (Exception e) {
                System.out.print("");
                opcion = 0;
            }
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    Leer l = new Leer();
                    l.leer();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    b = false;
                    break;
                default:
                    clearConsole();
                    System.out.println("Valor invalido \n");
                    break;
            }
            clearConsole();
        } while (b);

    }

    private static void subMenu2(Scanner sc) {
        System.out.println("sup \n");
    }

    private static void clearConsole() {
        for (int i = 0; i < 50; ++i) {
            System.out.println(); //clear console
        }
    }

}
