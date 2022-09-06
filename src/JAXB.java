
import java.io.File;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import manejadorjaxb.Peliculas;
import manejadorjaxb.Peliculas.Pelicula;
import manejadorjaxb.Peliculas.Pelicula.Generos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author migue
 */
public class JAXB 
{
    Peliculas misPeliculas;//Variable para usar los metodos de la clase Películas.
    File ficheroXML;
    String tituloGuardado;
    public int abrirJAXB(File fichero)//Con este método obtendremos la ruta del archivo XML que queramos abrir y veremos si se puede abrir correctamente.
    {
        try
        {
            ficheroXML = fichero;
            //Crea una instancia JAXB
            JAXBContext contexto = JAXBContext.newInstance(Peliculas.class);
            //Crea un objeto Unmarshaller.
            Unmarshaller u = contexto.createUnmarshaller();
            //Deserializa (unmarshal) el fichero
            misPeliculas = (Peliculas) u.unmarshal(fichero);
            return 0;
        }
        catch(Exception e)
        {
            return -1;
        }
    }
    
    public void cambioJAXB()//Método usado para q cuando añadas una película nueva también la puedas modificar sin tener que cerrar y abrir de nuevo el programa
    {
        abrirJAXB(ficheroXML);
    }
    
    public int guardarJAXB()//Con este método se guardará el archivo JAXB modificado
    {
        try
        {
            JAXBContext jaxbContext = JAXBContext.newInstance(Peliculas.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(misPeliculas, ficheroXML);
            return 0;
        }
        catch(Exception e)
        {
            return -1;
        }
    }
    
    public int compruebaTitulo(String busqueda)//Con este método se guardará el título para identificar la Película que se quiere modificar
    {
        String titulo = "";
        List<Peliculas.Pelicula> lPeliculas = misPeliculas.getPelicula(); 
        for(int i=0; i<lPeliculas.size(); i++)
        {
            Pelicula pelicula_temp = lPeliculas.get(i);
            titulo = pelicula_temp.getTitulo();
            if(busqueda.equals(titulo))
            {
                tituloGuardado = titulo;
                return 0;
            }
        }  
        return -1;
    }
    
    public void modificarJAXB(String elemento, String remplazo)//Método con el cual se modifica el elemento que quiera el usuario 
    {
        if(remplazo.equals(null))
        {
            remplazo = "";
        }
        List<Peliculas.Pelicula> lPeliculas = misPeliculas.getPelicula();
        for(int i=0; i < lPeliculas.size(); i++)
        {
            Pelicula pelicula_temp = lPeliculas.get(i);
            if(pelicula_temp.getTitulo().equals(tituloGuardado))//Detecto la película que quiero modificar con el identificador que le he pasado
            {
                switch(elemento)//Dependiendo del elemento que el usuario quiera modificar se remplazara un elemento u otro
                                //Si el elemento no era obligatorio y no está se añadirá
                {
                    case "Título":
                        pelicula_temp.setTitulo(remplazo);
                        tituloGuardado = remplazo;
                        break;
                    case "Director":
                        pelicula_temp.getDirector().setValue(remplazo);
                        break;
                    case "Edad Director":
                        pelicula_temp.getDirector().setEdad(Short.parseShort(remplazo));
                        break;
                    case "Género1":
                        pelicula_temp.getGeneros().getGenero().set(0,remplazo);
                        break;
                    case "Género2":
                        if(pelicula_temp.getGeneros().getGenero().size() == 2)
                        {
                            pelicula_temp.getGeneros().getGenero().set(1,remplazo);
                        }
                        else
                        {
                            pelicula_temp.getGeneros().getGenero().add(1, remplazo);
                        }
                        break;
                    case "Actor1":
                        if(pelicula_temp.getReparto().getActor().size() > 0)
                        {
                            pelicula_temp.getReparto().getActor().set(0,remplazo);
                        }
                        else
                        {
                            pelicula_temp.getReparto().getActor().add(0, remplazo);
                        }
                        break;
                    case "Actor2":
                        if(pelicula_temp.getReparto().getActor().size() > 1)
                        {
                            pelicula_temp.getReparto().getActor().set(1,remplazo);
                        }
                        else 
                        {
                            pelicula_temp.getReparto().getActor().add(1, remplazo);
                        }
                        break;
                    case "Compositor":
                            pelicula_temp.getReparto().setCompositor(remplazo);
                        break;
                    case "Año Estreno":
                        pelicula_temp.setAñoEstreno(Integer.parseInt(remplazo));
                        break;
                    case "País Origen":
                        pelicula_temp.setPaisOrigen(remplazo);
                        break;
                }
            }
        }
        guardarJAXB();
    }
}