package archivos;

import java.util.Scanner;

/**
 *
 * @author lk23
 */
public class Principal {

    public static void main(String[] args) {
        boolean end = true;
        do {
            System.out.println("1. Archivo");
            System.out.println("2. Directorio");
            System.out.println("3. Salir");
            end = menu(end);
        } while (end == true);

    }

    private static boolean menu(boolean end) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                subMenu1(sc);
                break;
            case 2:
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

    private static void subMenu1(Scanner sc) {
        boolean b = true;
        int opcion;
        do {
            System.out.println("1. Crear archivo");
            System.out.println("2. Leer archivo");
            System.out.println("3. Copiar Archivo");
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
                    break;
                case 3:
                    break;
                case 4:
                    b = false;
                    break;
                default:
                    System.out.println("Valor invalido \n");
                    break;
            }
        } while (b);

    }

    private static void subMenu2(Scanner sc) {
        System.out.println("sup \n");
    }

}
