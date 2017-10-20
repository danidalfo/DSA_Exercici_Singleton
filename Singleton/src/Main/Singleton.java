package Main;

import java.util.HashMap;
import java.util.Locale;
import java.util.ResourceBundle;


public class Singleton {

    private static Singleton instance = null;
    private ResourceBundle es;
    private ResourceBundle cat;
    private ResourceBundle en;
    private HashMap<String,ResourceBundle> llistaresources;

    protected Singleton()
    {
        llistaresources = new HashMap<String, ResourceBundle>();

    }

    private ResourceBundle resources(String lengua)
    {
        ResourceBundle tmp = llistaresources.get(lengua);
        if(tmp==null)
        {
            tmp = ResourceBundle.getBundle(lengua);
            llistaresources.put(lengua,tmp);
        }
        return tmp;
    }

    public static Singleton getInstance()
    {
        if(instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }

    public String getText(String lengua, String key)
    {
        String ret=null;

        ret = resources(lengua).getString(key);

        return ret;
    }
}