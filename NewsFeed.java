import java.util.*;
/**
 * Write a description of class NewsFeed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewsFeed
{
    // instance variables - replace the example below with your own
    ArrayList<MessagePost> messages;
    ArrayList<PhotoPost> photos;

    /**
     * Constructor for objects of class NewsFeed
     */
    public NewsFeed()
    {
        messages = new ArrayList<>();
        photos = new ArrayList<>();
    }

    /**
     * Añade un objeto MessagePost  al ArrayList
     */
    public void addMessagePost(MessagePost message)
    {
        messages.add(message);
    }
    /**
     * Añade un objeto PhotoPost al ArrayList
     */
    public void addPhotoPost(PhotoPost photo)
    {
        photos.add(photo);
    }
    /**
     * Muestra la informacion de todos los post
     */
    public void show()
    {
        for (MessagePost mensaje: messages)
        {
            mensaje.display();
            System.out.println(mensaje.timeString(System.currentTimeMillis()));
        }
        for (PhotoPost mensaje: photos)
        {
            mensaje.display();
            System.out.println(mensaje.timeString(System.currentTimeMillis()));
        }
    }
}
