public class Url implements IComposite {
    private String path;

    public String getPath(){
        return path;
    }
    public Void setPath(String thepath){
        this.path= thepath;
    } 
    public String afficher(){
        if (this.path == null){
            return null;
        }
        return this.getPath();
    }
}