package archivos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * @author lk23
 */
public class Duplicar {

    //Copiar el contenido de un archivo en otro
    public void copiar(File source, File target) throws IOException {
        Files.copy(source.toPath(), target.toPath());
    }
}
