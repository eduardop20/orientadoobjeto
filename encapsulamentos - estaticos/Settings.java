public class Settings {
    
    public static float min_portas = 1;
    public static float max_portas = 4;

    public static boolean testPortas(Carro car)
    {
        if(car.getPortas() <= max_portas && car.getPortas() >= min_portas)
        {
            return true;
        }
        return false;
    }
}
