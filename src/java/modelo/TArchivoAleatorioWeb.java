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


public class TArchivoAleatorioWeb
{
    /**
     * @param args
     * @throws java.io.FileNotFoundException
     */
    
    public static void main(String[] args) throws IOException  
    {
        // TODO code application logic here 21
        Column cml= new Column();
        cml.crearArchivo();
        Table tbl = new Table();
        tbl.crearArchivo();
        Schema sch = new Schema();
        sch.crearArchivo();
        sch.leerSch(2);
        sch.actualizarSch(2, "Competencias");
        sch.borrarRegistro(1);   
    }  
}
dskfsf
        dfgd
dsfg
dfg

f
fd
f
fd
f
f
fd
























gfhgf
fhdr
dfgh
fgh
fgh