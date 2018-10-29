package archivos;

import java.io.File;
import java.io.IOException;

/**
 * @author lk23
 */
public class Crear {

    //Crear un nuevo archivo
    public void nuevoArchivo(String name) throws IOException {
        File f = new File(name);
        if (f.createNewFile()) {
            System.out.println("El archivo \"" + name + "\" fue creado");
        } else if (true) {
            System.out.println("El archivo \"" + name + "\" ya existe");
        }
    }
}
