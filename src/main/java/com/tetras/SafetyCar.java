public class Safetycar {
    
    private static SafetyCar instance = new SafetyCar();
    
    private SafetyCar (){

    }

    public static SafetyCar getInstance() {
        return instance;
    }
}