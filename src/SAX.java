import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author migue
 */
public class SAX
{
    ManejadorSAX sh;
    SAXParser parser;
    File ficheroXML;
    public int abrirSAX(File fichero)//Con este método obtendremos la ruta del archivo SAX que queramos abrir y veremos si se puede abrir correctamente.
    {
        try
        {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            parser = factory.newSAXParser();
            sh = new ManejadorSAX();
            ficheroXML = fichero;
            return 0;
        }
        catch(Exception e)
        {
            return -1;
        }
    }
    public String recorrerSAX()//Con este método recorreremos el archivo SAX para mostrarlo por pantalla.
    {
        try 
        {
            sh.cadena_resultado="";
            parser.parse(ficheroXML, sh);
            return sh.cadena_resultado;
        } 
        catch (SAXException e)
        {
            return "Error";
        }
        catch (Exception e) 
        {
            return "Error";
        }
    }
}

class ManejadorSAX extends DefaultHandler//Esta clase se encarga de colocar todo el archivo SAX en el array cadena_resultado
{
    String cadena_resultado="";
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException 
    {
        for(int i=start; i<length+start; i++)
        {
            cadena_resultado = cadena_resultado + ch[i];
        }
        cadena_resultado = cadena_resultado.trim() + "\n";


    }
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException //Al final de cada película se pondrá una linea de separación
    {
        if(qName.equals("Pelicula"))
        {
            cadena_resultado = cadena_resultado + "--------------------\n";
        }
    }
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException //Método con el cual se muestran los datos de cada película
    {
        switch (qName) 
        {
            case "Pelicula":
                cadena_resultado = cadena_resultado + "El año de estreno es: " + attributes.getValue(attributes.getQName(0).trim()) + "\n" + "El país de origen es: " + attributes.getValue(attributes.getQName(1).trim());
                break;
            case "Titulo":
                cadena_resultado = cadena_resultado + "El título es: " + "".trim();
                break;
            case "Director":
                cadena_resultado = cadena_resultado + "La edad del director es: " + attributes.getValue(attributes.getQName(0)) + "\n";
                cadena_resultado = cadena_resultado + "El director es: " + "".trim();
                break;
            case "Genero":
                cadena_resultado = cadena_resultado + "Genero: " + "".trim();
                break;
            case "Actor":
                cadena_resultado = cadena_resultado + "Actor: " + "".trim();
                break;
            case "Compositor":
                cadena_resultado = cadena_resultado + "Compositor: " + "".trim();
                break;
        }
    }
}
