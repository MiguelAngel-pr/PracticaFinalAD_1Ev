
import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import java.io.File;
import java.io.FileOutputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author migue
 */
public class DOM 
{
    Document doc;//Esta variable almacena el DOM
    File ficheroXML;
    public int abrirDOM(File file)//Este método se encargar de comprobar que podamos abrir el archivo xml correctamente y generarlo.
    {
        doc = null;//doc representa el árbol DOM
        try 
        {
            ficheroXML = file;
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();//Se crea un objeto DocumentBuilder para cargar en el la estructura del DOM.
            doc = builder.parse(file);//Interpreta el documento xml y genera el DOM equivalente.
            return 0;
        } 
        catch(Exception e) 
        {
            e.printStackTrace();
            return -1;
        }  
    }
    
    public int añadirDOM(String titulo, String director, String edad, String genero1, String genero2, String año, String actor1, String actor2, String compositor, String pais)
    //Método usado para añadir los elementos al archivo dom 
    {
        try
        {
            //Creo el titulo y añado el texto
            Node ntitulo = doc.createElement("Titulo");
            Node ntitulo_texto = doc.createTextNode(titulo);
            ntitulo.appendChild(ntitulo_texto);

            //Creo el director y añado el texto
            Node ndirector = doc.createElement("Director");
            Node ndirector_texto = doc.createTextNode(director);
            ndirector.appendChild(ndirector_texto);
            
            //Creo el elemento reparto y genero
            Node nreparto = doc.createElement("Reparto");
            Node ngeneros = doc.createElement("Generos");
            
            //Si el usuario ha rellenado el campo, creo el actor1 y añado el texto
            if(!actor1.equals("") && !actor1.equals(null))
            {
                Node nactor1 = doc.createElement("Actor");
                Node nactor1_texto = doc.createTextNode(actor1);
                nactor1.appendChild(nactor1_texto);
                nreparto.appendChild(nactor1);
            }
            
            //Si el usuario ha rellenado el campo, creo el actor2 y añado el texto
            if(!actor2.equals("") && !actor2.equals(null))
            {
                Node nactor2 = doc.createElement("Actor");
                Node nactor2_texto = doc.createTextNode(actor2);
                nactor2.appendChild(nactor2_texto);
                nreparto.appendChild(nactor2);
            }
            
            //Si el usuario ha rellenado el campo, creo el compositor y añado el texto
            if(!compositor.equals("") && !compositor.equals(null))
            {
                Node ncompositor = doc.createElement("Compositor");
                Node ncompositor_texto = doc.createTextNode(compositor);
                ncompositor.appendChild(ncompositor_texto);
                nreparto.appendChild(ncompositor);
            }
            
            //Creo el compositor y añado el texto
            Node ngenero1 = doc.createElement("Genero");
            Node ngenero1_texto = doc.createTextNode(genero1);
            ngenero1.appendChild(ngenero1_texto);
            ngeneros.appendChild(ngenero1);
            
            //Añado el 2º género
            if(!genero2.equals("-"))
            {
                Node ngenero2 = doc.createElement("Genero");
                Node ngenero2_texto = doc.createTextNode(genero2);
                ngenero2.appendChild(ngenero2_texto);
                ngeneros.appendChild(ngenero2);
            }
            
            Node npelicula = doc.createElement("Pelicula");//Creo el nodo libro para añadirle todos sus nodos hijos
            ((Element)npelicula).setAttribute("año_estreno", año); //Añado el atributo
            ((Element)npelicula).setAttribute("pais_origen", pais);
            ((Element)ndirector).setAttribute("edad", edad);
           
            npelicula.appendChild(ntitulo);
            npelicula.appendChild(ndirector);
            npelicula.appendChild(ngeneros);
            npelicula.appendChild(nreparto);

            Node nraiz = doc.getFirstChild();//Creo y añado todo al nodo libros
            nraiz.appendChild(npelicula);
            guardarDOM(ficheroXML);
            return 0;      
        } 
        catch(Exception e)
        {
            return -1;
        }
    }
    
    public int guardarDOM(File ficheroXML)//Metodo usado para guardar el DOM como un archivo nuevo
    {
        try 
        {
            OutputFormat format = new OutputFormat(doc);
            format.setIndenting(true);
            XMLSerializer s = new XMLSerializer(new FileOutputStream(ficheroXML), format);
            s.serialize(doc);
            return 0;
        } 
        catch (Exception e) 
        {
            return -1;
        }
    }
}
