package archivos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Lopez Chaidez Luis Enrique
 */
public class Leer {
    
    /**
     * Leer un archivo por su nombre
     * @param name nombre de el archivo
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void leer(String name) throws FileNotFoundException, IOException {
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
                    try (FileReader f = new FileReader(name)) {
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
                        FileReader f = new FileReader(formatoRuta(ruta,name));
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
    
    /**
     * 
     * @param ruta Ruta de el archivo en formato "C:\\usuario\\carpeta\\"
     * @param nombre nombre de archivo
     * @return String en formato "C:\\usuario\\carpeta\\archivo"
     */
    //formato de ruta ej. "C:\\usuario\\carpeta\\archivo"
    private static String formatoRuta(String ruta,String name){
        return (ruta +"\\"+ name);
    }
    private static void line() {
        System.out.println("-----------------");
    }
}
