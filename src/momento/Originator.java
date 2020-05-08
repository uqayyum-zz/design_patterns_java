package momento;

/**
 * @author UMAIR QAYYUM
 *
 */

//The Object that holds the information and the object for which we want to resstore and save the state for.
public class Originator {
    private String content;

    public Momento createState(){
        return new Momento(content);
    }

    public void restore(Momento state){
        content = (state == null) ? content : state.getContent();
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
