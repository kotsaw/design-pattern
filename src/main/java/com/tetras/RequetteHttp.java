import java.util.*;


public class RequetteHttp implements IComposite {
    private List<IComposite> sous_objet;

public RequetteHttp(){
    this.sous_objet = new ArrayList<IComposite>();
}
public void ajouter(IComposite composant){
    sous_objet.add(composant);
}
public void retirer(IComposite composant){
    sous_objet.remove(composant);
}
public IComposite getComposant(int id){
    return (IComposite) sous_objet.get(id);
}
public String afficher(){
    String req ="";
    Iterator<IComposite> Iterator= sous_objet.iterateur();
    while (iterateur.hasNext()){
        req= req+iterateur.next().afficher() +"";
    }
    return req;
}
}