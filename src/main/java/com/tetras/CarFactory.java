public class CarFactory{
    // on instancie ici toutes nos voitures 
    public static VoitureDuChampionnatDeFormuleUn getTypeCar(ConstructeurAutomobile type ){
        if (ConstructeurAutomobile.Renault.equals(type))
            return new CarRenault();
        else if (ConstructeurAutomobile.Ferrari.equals(type))
            return new CarFerrari();
        else if (ConstructeurAutomobile.Mercedes.equals(type))
            return new CarMercedes();
    }
}