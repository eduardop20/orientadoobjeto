public class Main {

    public static void main(String[] args) {
        Carro c = new Carro();
        Aviao a = new Aviao();
        Bicicleta b = new Bicicleta();


        c.setMotorizado(true);
        a.setMotorizado(true);
        b.setMotorizado(false);

        System.out.println("Carro motorizado? "+c.getMotorizado());
        System.out.println("Avião motorizado? "+a.getMotorizado());
        System.out.println("Bicicleta motorizado? "+b.getMotorizado());
    }
}