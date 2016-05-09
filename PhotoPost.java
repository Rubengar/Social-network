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
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void like()
    {
        likes++;
    }

    public void unlike()
    {
         if (likes>0)
        {
            likes--;
        }
    }

    public void addComment(String text)
    {
         comments.add(text);
    }

    public String getImageFile()
    {
        return filename;
    }

    public String getCaption()
    {
        return caption;
    }

    public long getTimeStamp()
    {
        return timestamp;
    }

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

    private String timeString(long time)
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
