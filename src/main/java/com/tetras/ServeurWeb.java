public class ServeurWeb implements IServeurWeb {
    public int repondre(RequetteHttp requette){
        if (requette.getPath().getPath()=! null){
            return 200;
        }
        return 500;
    }

    public ServeurWeb(){

    }
}