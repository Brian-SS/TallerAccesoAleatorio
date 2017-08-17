/*
 *  TALLER ARCHIVOS ACCESO ALEATORIO
 *   co-Author ::: Juan Albarracin
 *   co-Author ::: Mario Bolaños
 *   co-Author ::: Brian Sterling
 *     Program ::: Bases de Datos
 *  Credential ::: SIST0008-G01:SIV
 */
package modelo;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Mario-Bx
 */
public class TArchivoAleatorioWeb {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    
    
    //public static void main(String[] args) throws IOException
    public void crear() throws FileNotFoundException
    {
        // TODO code application logic here 21
        
        Column cml= new Column();
        cml.crearArchivo();
       
                
                

        
//        cml.crearColumn("String", "Elemento",1);
//        cml.crearColumn("Int", "Telefono",1);
//        cml.crearColumn("Boolean", "Soltero",4);
//        cml.crearColumn("Float", "Peso",3);
//        cml.crearColumn("Int", "C.C.",5);
        
//        cml.leerColum(2);
//        cml.actualizarColum(1, "nombre", "Edad");
//        cml.borrarRegistro(1);
//        cml.existe(1);
        
        
        
        Table tbl = new Table();
        tbl.crearArchivo();
        
//        tbl.crearTabla("Carros", 1);
//        tbl.crearTabla("Deportes", 2);
//        tbl.crearTabla("Materias", 3);
//        tbl.crearTabla("Comidas", 4);
//        tbl.crearTabla("Celulares", 5);
        
//        tbl.leerTabla(5);
//        tbl.actualizarTabla(1, "nombre", "Cabello");
//        tbl.borrarRegistro(2);
        
        Schema sch = new Schema();
        sch.crearArchivo();
        
//        sch.crearSch("Prueba-1");
//        sch.crearSch("Prueba-2");
//        sch.crearSch("Prueba-3");
        
        sch.leerSch(2);
        sch.actualizarSch(2, "Competencias");
        sch.borrarRegistro(1);
      
    }
    
}
