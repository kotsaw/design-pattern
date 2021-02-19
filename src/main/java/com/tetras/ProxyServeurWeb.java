public class ProxyServeurWeb{

    private ServeurWeb servweb;

    public ProxyServeurWeb(ServeurWeb serveurWeb){
        super();
        this.servweb=serveurWeb;
    }
    public int repondre(RequetteHttp requette){
        if ( servweb == null){
            servweb= new ServeurWeb();
        }
        if (requette.getPath().getPath() != null && requette.getPath().getPath().equals("/evilurl") ){
            return 403;
        }
        return servweb.repondre(requette);

    }
}