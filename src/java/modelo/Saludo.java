/*
 *  TALLER ARCHIVOS ACCESO ALEATORIO
 *  co-Author ::: Juan Albarracin
 *  co-Author ::: Mario Bolaños
 *  co-Author ::: Brian Sterling
 *  Professor ::: Fabian Giraldo
 *    Program ::: Bases de Datos
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Labing I5
 */
public class Saludo 
{
    public String saludar(String nombre)
    {
      return "Hola " + nombre;
    }
    
    public ArrayList<String> listar()
    {
        ArrayList resultado = new ArrayList();
        resultado.add("A");
        resultado.add("B");
        resultado.add("C");
        return resultado;
    }
}