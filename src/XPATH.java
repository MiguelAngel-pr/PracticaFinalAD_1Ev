import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
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
public class XPATH 
{
    File ficheroActual;
    public String EjecutaXPath(File file, String consulta)//Método con el cual comprobamos que se pueda abrir correctamente y formamos el archivo que queramos mostrar dependiendo de la consulta
    {    
        ficheroActual = file;
        String salida = "";//Variable que guarda el archivo de texto a mostrar por pantalla
        Node nodoActual;
        try
        {
            //Crea un objeto DocumentBuilderFactory para el DOM (JAXP)
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            
            //Crea un árbol DOM (parsear) con el archivo LibrosXML.xml
            Document XMLDoc = factory.newDocumentBuilder().parse(file);
            
            //Crea el objeto XParh
            XPath xpath = XPathFactory.newInstance().newXPath();
            
            //Crea un XPathExpression con la consulta deseada
            XPathExpression exp = xpath.compile(consulta);
            
            //Ejecuta la consulta indicando que se ejecute sobre el DOM y que devolverá el resultado como una lista de nodos.
            Object result = exp.evaluate(XMLDoc, XPathConstants.NODESET);
            NodeList nodeList = (NodeList) result;
            //Ahora recorre la lista para sacar los resultados.
            //Esto me devuelve el nodo y el texto de este
            for(int i = 0; i < nodeList.getLength(); i++)
            {
                nodoActual = nodeList.item(i);
                if(nodoActual.getNodeName().equals("Pelicula"))//Si es nodo libro
                {
                    NodeList listaNodos = nodeList.item(i).getChildNodes();
                    salida = salida + "Pelicula " + i + "\n";
                    salida = salida + "El año de estreno es: " + nodoActual.getAttributes().item(0).getNodeValue() + "\n";
                    salida = salida + "El país de origen es: " + nodoActual.getAttributes().item(1).getNodeValue() + "\n";
                    for(int j=1; j < listaNodos.getLength(); j++)
                    {
                        if(listaNodos.item(j).getNodeType()==Node.ELEMENT_NODE)
                        {
                            salida = salida + ejecutaConsulta(j, listaNodos); 
                        }
                    }
                    salida = salida + "--------------------- \n";
                }
                else
                {
                    salida = salida + ejecutaConsulta(i, nodeList);
                }                
            }
            return salida;
        }
        catch (Exception ex)
        {
            return "Error";
        }
    }
    public String ejecutaConsulta(int a, NodeList nodeList)//Método que según la consulta que ponga el usuario mostrará unos datos u otros
    {
        String salida = "";
        String nombreNodo = nodeList.item(a).getNodeName();
        NodeList nodeList2 = nodeList.item(a).getChildNodes();
        switch(nombreNodo)
        {
            case("año_estreno"):
                salida = salida + "El año de estreno es: " + nodeList.item(a).getFirstChild().getNodeValue() + "\n";
                break;
            case("pais_origen"):
                salida = salida + "El país de origen es: " + nodeList.item(a).getFirstChild().getNodeValue() + "\n";
                break;
            case("edad"):
                salida = salida + "La edad del director es: " + nodeList.item(a).getFirstChild().getNodeValue() + "\n";
                break;
            case("Titulo"):
                salida = salida + "El título es: " + nodeList.item(a).getFirstChild().getNodeValue() + "\n";
                break;
            case("Director"):
                salida = salida + "El director es: " + nodeList.item(a).getFirstChild().getNodeValue() + "\n";
                salida = salida + "Su edad es: " + nodeList.item(a).getAttributes().item(0).getNodeValue() + "\n";
                break;
            case("Reparto"):
                for(int i=0; i<nodeList2.getLength(); i++)
                {
                    salida = salida + ejecutaConsulta(i, nodeList2);
                }
                break;
            case("Actor"):
                salida = salida + "Actor: " + nodeList.item(a).getFirstChild().getNodeValue() + "\n";
                break;
            case("Compositor"):
                salida = salida + "Compositor: " + nodeList.item(a).getFirstChild().getNodeValue() + "\n";
                break;
            case("Generos"):
                for(int i=1; i<nodeList2.getLength(); i++)
                {
                    salida = salida + ejecutaConsulta(i, nodeList2);
                }
                break;
            case("Genero"):
                salida = salida + "Género: " + nodeList.item(a).getFirstChild().getNodeValue() + "\n";
                break;
        }
        return salida;
    }
    public String recogeConsulta(String respuesta)//Método para realizar el cambio entre consultas
    {
        String respuestaConsulta = EjecutaXPath(ficheroActual, respuesta);
        return respuestaConsulta;
    }
}