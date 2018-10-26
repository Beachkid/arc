
package archivos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author lk23
 */
public class Leer {

    public Leer() {
    }
    
    
    public void leer() throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int c;
        
        System.out.print("Introduce el nombre del archivo: ");
        nombre = sc.nextLine();
        
        try (FileReader f = new FileReader(nombre)) {
            while ((c = f.read()) != -1){
                System.out.print((char) c);
            }
        }
        
    }
}
