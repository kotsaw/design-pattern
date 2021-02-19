import java.util.*;

public class Header implements IComposite{

    HashMap<String,String> hashHeader=new HashMap<String,String>();

    public Header(HashMap<String, String> header) {
        this.hashHeader = header;
    }

    public HashMap<String, String> getHeader() {
        return hashHeader;
    }
    public void setHeader(HashMap<String, String> header) {
        this.hashHeader=header;
    }
    
    public String afficher(){
        return hashHeader.toString();
    }
    
}