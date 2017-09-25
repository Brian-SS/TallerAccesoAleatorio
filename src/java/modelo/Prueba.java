/*
 *  TALLER ARCHIVOS ACCESO ALEATORIO
 *   co-Author ::: Juan Albarracin
 *   co-Author ::: Mario Bolaños
 *   co-Author ::: Brian Sterling
 *     Program ::: Bases de Datos
 *  Credential ::: SIST0008-G01:SIV
 */
package modelo;


import java.io.IOException;
import java.io.RandomAccessFile;


public class Prueba
{
    public static void main(String[] args) throws IOException
    {
        //Declaramos un objerto de la clase 
        RandomAccessFile XFAleatorios;
        String codigo = "1234";           //04 CARACTERES
        String nombre = "Mario Rojas";    //11 CARACTERES
        String edad = "29";               //02 CARACTERES
        String peso = "60.55";            //05 CARACTERES
        String activo = "*";              //01 CARACTERES
        String fol = "\r\n";              //02 CARACTERES
        int longitud = 25;
        int registro;
        XFAleatorios = new RandomAccessFile("Datos.txt", "rw");
        System.out.println("longitud del archivo: " + XFAleatorios.length());
        System.out.println("longitud del registros: " + XFAleatorios.length() / longitud);
        registro = 3;
        XFAleatorios.seek((registro - 1) * longitud);
        XFAleatorios.writeBytes(codigo);
        System.out.println(XFAleatorios.getFilePointer()); //Byte actual
        XFAleatorios.writeBytes(nombre);
        System.out.println(XFAleatorios.getFilePointer()); //Byte actual
        XFAleatorios.writeBytes(edad);
        System.out.println(XFAleatorios.getFilePointer()); //Byte actual
        XFAleatorios.writeBytes(peso);
        System.out.println(XFAleatorios.getFilePointer()); //Byte actual
        XFAleatorios.writeBytes(activo);
        System.out.println(XFAleatorios.getFilePointer()); //Byte actual
        XFAleatorios.writeBytes(fol);
        System.out.println(XFAleatorios.getFilePointer()); //Byte actual
        XFAleatorios.close();
    }
}

//01
//02
//03
04
05
06
07
08
09
10
11