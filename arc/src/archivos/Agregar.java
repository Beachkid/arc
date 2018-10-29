package archivos;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author lk23
 */
public class Agregar {

    //sobreescribir un archivo
    void escribirSobre(String nombre, boolean sobreEscribir) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sobreEscribir == true) {
            try {
                FileWriter f = new FileWriter(nombre, sobreEscribir);
                System.out.print("Texto: ");
                String cadena = sc.nextLine();
                f.write(cadena);
                f.close();
            } catch (FileNotFoundException e) {
                System.out.println("El archivo no existe");
            }
        } else {
            try {
                FileWriter f = new FileWriter(nombre);
                System.out.print("Texto: ");
                String cadena = sc.nextLine();
                f.write(cadena);
                f.close();
            } catch (FileNotFoundException e) {
                System.out.println("El archivo no existe");
            }
        }
    }

}
