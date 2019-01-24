package bdde;

import java.io.File;
import java.io.FileInputStream;
import java.io.StreamTokenizer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author lk23
 */
public class wordCounter {

    public static void main(String[] args) {
        File f = new File("C:\\Users\\lk23\\Desktop\\archivos\\what.txt");
        File direc = new File("C:\\Users\\lk23\\Desktop\\archivos\\archivosTexto");
        File direction = new File()
        /*
        try {
            wordCounter(f);
        } catch (IOException ex) {
            Logger.getLogger(wordCounter.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        /*
        try {
            wordCounterDirectory(direc);
        } catch (IOException ex) {
            Logger.getLogger(wordCounter.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
    }

    public static void wordCounter(File textFile) throws FileNotFoundException, IOException {
        int count = 0;
        if (textFile.isFile() && textFile.canRead()) {
            FileInputStream input = new FileInputStream(textFile);
            StreamTokenizer streamToken = new StreamTokenizer(input);
            while (streamToken.nextToken() != -1) {
                count++;
            }
            System.out.println("El archivo " + textFile.getName() + " contenia " 
                    + count + " palabras con " + streamToken.lineno() + " lineas de texto.");
        } else {
            System.out.println("No fue posible acceder al archivo");
        }
    }

    public static void wordCounterDirectory(File directory) throws IOException {
        if (directory.isDirectory()) {
            File[] listOfFiles = directory.listFiles();
            for (int i = 0; i < listOfFiles.length; i++) {
                wordCounter(listOfFiles[i]);
            }
        } else {
            System.out.println("Este no es un directorio");
        }

    }
    
    public static void wordLister(File textFile, File reference) throws FileNotFoundException, IOException{
        FileInputStream rInput = new FileInputStream(reference);
        FileInputStream fInput = new FileInputStream(reference);
        
        StreamTokenizer tokenR = new StreamTokenizer(fInput);
        StreamTokenizer tokenF = new StreamTokenizer(rInput);
        String[] referenceArray = new String[6];
        List<String> lista = null;
        
        while (lista.add(tokenF.toString())){
            tokenF.nextToken();
        }
        // Creates an empty HashMap
        HashMap<String, Integer> hmap = new HashMap<>(); 
        
        // Traverse through the given list
        for (int i = 0; i < lista.size(); i++) { 
  
            // Get if the element is present
            
            Integer c = hmap.get(lista.get(i)); 
            
            // If this is first occurrence of element 
            // Insert the element
            if (hmap.get(lista.get(i)) == null) { 
                hmap.put(lista.get(i), 1);
            }
            // If elements already exists in hash map 
            // Increment the count of element by 1
            else { 
                hmap.put(lista.get(i), ++c); 
            } 
        }
        System.out.println(hmap);// Print HashMap 
        
    }
    
    static void createHashMap(int arr[]) 
    { 
        
    } 
}

/*
<ARCHIVO FISICO>
-coleccion de bytes almacenadas en un dispositivo
-Depende del sistema operativo

<ARCHIVO LOGICO>
- un canal que oculta los detalles de la ubicacion y formato fisico del archivo
- Programas de aplicacion
-Esta compuesto de registros, que a su vez estan formados de campos. Estos pueden ser de longitud fija o variable.

<SISTEMA DE ARCHIVOS>
Usuario <--> aplicacion <--> Sistema operativo <--> Hardware

<ARCHIVOS>
*Un archivo binario es un archivo informatico que contiene informacion de cualquier tipo 
codificada en binario para el proposito de almacenamiento y procesamiento en computadoras

* En los archivos de texto la informacion se guarda como caracteres, codificados en ASCII u otras codificaciones de texto,
lo que los hace eficaces a la hora de guardar textos, y numeros pequeños.

<METODOS DE ACCESO>
Los datos se pueden guardar y recuperar de los archivos a travez de algoritmos llamados metodos de acceso.
Proveen un grupo de operaciones que se pueden aplicar a un archivo.

<ARCHIVOS SECUENCIALES>
Los registros se organizan secuencialmente de acuerdo a la clave primaria en un arhcivo secuencial ordenado
    - La busqueda de valores de las claves es eficiente y relativamente rapido si se emplea busqueda binaria.
    - Insertar y borrar registros no es eficiente.
Los archivos secuencuales no ordenados permiten insertar registros facilmente. Los registros se agregan al final. encontrar un registro
requiere una busqueda lineal.

<ARCHIVOS INDEXADOS>
- Se crea la tabla o archivo como indice
- El indice contiene lso valores de las claves asociadas al valor de la clave de uno o mas registros.
- Para recuperar un registro primero se busca la clave en el indice, que tiene la direccion del registro en el archivo.

<ARCHIVOS HASHED>
- La direccion de cada registro se determina por un algoritmo de hashing.
- El algoritmo convierte la clave primaria en un valor que se puede buscar en una tabla de indice que
contiene el registro.


 */
