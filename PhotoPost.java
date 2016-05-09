import java.util.*;
/**
 * Write a description of class PhotoPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhotoPost
{
    // instance variables - replace the example below with your own
    private String username;
    private String filename;
    private String caption;
    private long timestamp;
    private  int likes;
    private ArrayList<String>  comments;

    /**
     * Constructor for objects of class PhotoPost
     */
    public PhotoPost(String autor,String filename,String caption)
    {
        username = autor;
        this.filename = filename;
        this.caption = caption;
        likes = 0;
        timestamp = System.currentTimeMillis();
        comments = new ArrayList<>();
    }

    /**
     * Suma uno a likes
     */
    public void like()
    {
        likes++;
    }
    /**
     * Resta un like si no tiene cero
     */
    public void unlike()
    {
         if (likes>0)
        {
            likes--;
        }
    }
    /**
     * Añade un comentario
     */
    public void addComment(String text)
    {
         comments.add(text);
    }
    /**
     * Devuelve el nombre de la imagen
     */
    public String getImageFile()
    {
        return filename;
    }
    /**
     * Devuelve la cabezera de la imagen
     */
    public String getCaption()
    {
        return caption;
    }
    /**
     * Devuelve el tiempo en milisegundos
     */
    public long getTimeStamp()
    {
        return timestamp;
    }
    /**
     * Muestra la informacion por pantalla
     */
    public void display()
    {
        System.out.println(username+" a publicado:");
        System.out.println(caption);
        System.out.println(filename);
        if (comments.isEmpty())
        {
            System.out.println("No tiene nigun comentario");
        }
        else
        {
            System.out.println("=================");
            System.out.println("Comentarios");
            System.out.println("=================");
            for (String text : comments)
            {
                System.out.println(text);
            }
        }        
    }
    /**
     * Devuelve una cadena con el tiempo transcurrido
     */
    public String timeString(long time)
    {
        String cadena = null;
        if ((timestamp-time)/1000 > 60)
        {
            long total = (timestamp-time)/1000;
            cadena = (total/60+ "m" +total % 60+" s");
        }
        else
        {
            cadena = ((timestamp-time)/1000 + "s");
        }
        return cadena;
    }
}
