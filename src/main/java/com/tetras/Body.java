public class Body implements IComposite {

    private String content;

    public Body(String thecontent){
        this.content= thecontent;
   }
    public String getContent(){
        return content;
    }
    public void setContent(String thecontent){
        this.content= thecontent;
    }

    public String afficher(){
         return this.getContent();
    }
}