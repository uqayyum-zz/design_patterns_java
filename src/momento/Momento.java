package momento;

/**
 * @author UMAIR QAYYUM
 *
 */

// The class that has the current contents of the object.
public class Momento {
    private final String content;

    public Momento(String content){
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
