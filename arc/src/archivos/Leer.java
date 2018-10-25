
package archivos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author lk23
 */
public class Leer {
    
    public void leer(String nombre) throws FileNotFoundException, IOException {
        FileReader f = new FileReader(nombre);
        int c;
        while ((c = f.read()) != -1){
            System.out.print((char) c);
        }
        f.close();
        
    }
}
