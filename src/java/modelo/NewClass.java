/*
 *  TALLER ARCHIVOS ACCESO ALEATORIO
 *   co-Author ::: Juan Albarracin
 *   co-Author ::: Mario Bolaños
 *   co-Author ::: Brian Sterling
 *     Program ::: Bases de Datos
 *  Credential ::: SIST0008-G01:SIV
 */
package modelo;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class NewClass
{
    public static void main(String[] args)
    {
        File file = new File("salida.txt");
        // abrir el archivo para escritura
        FileOutputStream out = null;
        
        try
        {
            out = new FileOutputStream(file);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        // crear los datos a escribir
        byte[] datos = {10, 20, 30, 40, 50};

        try
        {
            // escribir los datos en el flujo
            out.write(datos);
            // cerrar el flujo de datos
            out.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}