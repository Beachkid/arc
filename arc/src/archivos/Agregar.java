
package archivos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author lk23
 */
public class Agregar {
    
    void escribir(String nombre, boolean sobreEscribir) throws IOException{
        Scanner sc = new Scanner(System.in);
        if (sobreEscribir == true) {
            FileWriter f = new FileWriter(nombre,sobreEscribir);
            String cadena;
            cadena = sc.nextLine();
            f.write(cadena);
            f.close();
        } else {
            FileWriter f = new FileWriter(nombre);
            String cadena;
            cadena = sc.nextLine();
            f.write(cadena);
            f.close();
        }
        
    }
}
