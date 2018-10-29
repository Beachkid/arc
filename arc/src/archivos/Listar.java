package archivos;

import java.io.File;
import java.util.Scanner;

/**
 * @author lk23
 */
public class Listar {

    //Leer el contenido de un directorio (directorio de trabajo)
    public void directorioVer(String path) {
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        int files = 0;
        int folders = 0;

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("archivo " + listOfFiles[i].getName());
            } else if (listOfFiles[i].isDirectory()) {
                System.out.println("carpeta " + listOfFiles[i].getName());
            }
        }
    }
    //Leer un archivo por su direccion

    public String leerDirectorio() {
        Scanner sc = new Scanner(System.in);
        File folder = new File("C:\\Users\\lk23\\Documents\\NetBeansProjects\\arc\\arc");
        File[] listOfFiles = folder.listFiles();
        String folderDirec = null;
        String fileName;
        boolean end = true;
        int respuesta;

        do {
            System.out.println("1. ver carpeta predeterminada");
            System.out.println("2. seleccionar carpeta");
            System.out.println("3. atras");

            respuesta = sc.nextInt();
            line();

            switch (respuesta) {
                case 1:
                    for (File file : listOfFiles) {
                        if (file.isFile()) {
                            System.out.println(file.getName());
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

    private static void line() {
        System.out.println("-----------------");
    }
}
