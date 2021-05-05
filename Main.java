public class Main {

    public static void main(String[] args){

        Carro c = new Carro("fiat", "amarelo", 4);
        Carro c1 = new Carro("GM", "preto", 2);

       c.setCor("vermelho");

        System.out.println("Cor do carro: "+c.getCor());
        System.out.println("Cor do carro1: "+c1.getCor());

        c.setPortas(3);
        
        System.out.println("Portas do carro: " + c.getPortas());
        System.out.println("Portas do carro1: " + c1.getPortas());
        
        System.out.println(Settings.testPortas(c)); 
    }

}