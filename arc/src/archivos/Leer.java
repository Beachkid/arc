package archivos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author lk23
 */
public class Leer {

    //Leer un archivo por nombre
    public void leer(String nombre) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        int c, opcion;
        boolean end = true;
        String ruta;
        
        do {
            System.out.println("1. buscar en carpeta predeterminada");
            System.out.println("2. buscar en otra carpeta");
            System.out.println("3. atras");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    try (FileReader f = new FileReader(nombre)) {
                        while ((c = f.read()) != -1) {
                            System.out.print((char) c);
                        }
                        f.close();
                        System.out.println("\n");
                    } catch (FileNotFoundException e) {
                        System.out.println("El archivo no existe");
                    }
                    break;
                case 2:
                    System.out.print("Ruta de archivo: ");
                    ruta = sc.next();
                    try {
                        FileReader f = new FileReader(formatoRuta(ruta,nombre));
                        while ((c = f.read()) != -1) {
                            System.out.print((char) c);
                        }
                        f.close();
                        System.out.println("\n");
                    } catch (FileNotFoundException e) {
                        System.out.println("El archivo no existe");
                    }
                    break;
                case 3:
                    end = false;
                default:
                    System.out.println("Valor invalido");
                    break;
            }
        } while (end);
    }
    
    //formato de ruta ej. "C:\\usuario\\carpeta\\archivo"
    private static String formatoRuta(String ruta,String nombre){
        return (ruta +"\\"+ nombre);
    }
    private static void line() {
        System.out.println("-----------------");
    }
}
