package archivos;

import java.io.File;
import java.util.Scanner;

/**
 * @author lk23
 */
public class Listar {

    //Leer el contenido de un directorio (directorio de trabajo)
    public String leerDirectorio() {
        Scanner sc = new Scanner(System.in);
        File folder = new File("C:\\Users\\folder");
        File[] listOfFiles = folder.listFiles();
        String folderDirec = null;
        boolean end = true;
        int respuesta;

        do {
            System.out.println("1. ver carpeta predeterminada");
            System.out.println("2. seleccionar carpeta");
            System.out.println("3. atras");

            respuesta = sc.nextInt();
            Principal.line();

            switch (respuesta) {
                case 1:
                    for (File listOfFile : listOfFiles) {
                        if (listOfFile.isDirectory()) {
                            System.out.println("Carpeta: " + listOfFile.getName());
                        }
                    }
                    for (File file : listOfFiles) {
                        if (file.isFile()) {
                            System.out.println("Archivo: " + file.getName());
                        }
                    }
                    break;
                case 2:
                    System.out.print("Introduzca el directorio que desea ver: ");
                    folderDirec = sc.next();
                    File folder1 = new File(folderDirec);
                    File[] listOfFiles1 = folder1.listFiles();

                    for (int k = 0; k < listOfFiles1.length; k++) {
                        if (listOfFiles1[k].isDirectory()) {
                            System.out.println("carpeta: " + listOfFiles1[k].getName());
                        }
                    }
                    for (int n = 0; n < listOfFiles1.length; n++) {
                        if (listOfFiles1[n].isFile()) {
                            System.out.println("Archivo: " + listOfFiles1[n].getName());
                        }
                    }
                    break;
                case 3:
                    end = false;
                    break;
                default:
                    System.out.println("Valor invalido");
                    break;
            }
        } while (end);
        return folder.getPath();
    }
}
