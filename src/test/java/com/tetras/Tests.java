import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Tests {
    @Test
    public void Testevil(){
        HashMap map = new HashMap<String,String>();
        map.put("testevil","test");
        Header header = new Header(map);
        Body body = new Body("je suis un gentil client(pasdutout)");
        Url url = new Url("/evilurl");

        IComposite requettetoutegentille = new IComposite();
        requettetoutegentille.ajouter(url);
        requettetoutegentille.ajouter(header);
        requettetoutegentille.ajouter(body);

        IServeurWeb serveur = new ServeurWeb();
        int reponse;
        reponse = serveur.repondre(requettetoutegentille);
        assertEquals(403,reponse);
    }
    @Test
    public void TestNormal(){
        HashMap map = new HashMap<String,String>();
        map.put("testNormie","test");
        Header header = new Header(map);
        Body body = new Body("je suis un Normie");
        Url url = new Url("/urlNormie");

        IComposite requetteNormie = new IComposite();
        requetteNormie.ajouter(url);
        requetteNormie.ajouter(header);
        requetteNormie.ajouter(body);

        IServeurWeb serveur = new ServeurWeb();
        int reponse;
        reponse = serveur.repondre(requetteNormie);
        assertEquals(200,reponse);
    }
    @Test
    public void TestError(){
        HashMap map = new HashMap<String,String>();
        map.put("testFail","test");
        Header header = new Header(map);
        Body body = new Body("Je voulais m'afficher mais l'url est pas bonne");
        Url url = new Url(null);

        IComposite requetteNaze = new IComposite();
        requetteNaze.ajouter(url);
        requetteNaze.ajouter(header);
        requetteNaze.ajouter(body);

        IServeurWeb serveur = new ServeurWeb();
        int reponse;
        reponse = serveur.repondre(requetteNaze);
        assertEquals(500,reponse);
    }
    @Test
    public void TestAfficher(){
        HashMap map = new HashMap<String,String>();
        map.put("Affichemoi","test");
        Header header = new Header(map);
        Body body = new Body("Je suis un contenu visible");
        Url url = new Url("/affichage");

        IComposite requetteAffiche = new IComposite();
        requetteAffiche.ajouter(url);
        requetteAffiche.ajouter(header);
        requetteAffiche.ajouter(body);

        String requette = requetteAffiche.afficher();
        assertEquals(requette,"/affichage{Affichemoi=test}Je suis un contenu visible");
    }
}