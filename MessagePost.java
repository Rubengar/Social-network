import java.util.*;
/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MessagePost
{
    // instance variables - replace the example below with your own
    private String username;
    private String message;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String autor,String text)
    {
        username = autor;
        message = text;
        timestamp = System.currentTimeMillis();
        likes = 0;
        comments = new ArrayList<>();
    }

    /**
     *Suma uno a likes
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
     * Añade un comentario al arraylist
     */
    public void addComment(String text)
    {
        comments.add(text);
    }

    /**
     * Devuelve el mensaje
     */
    public String getText()
    {
        return message;
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
        System.out.println(message);
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
