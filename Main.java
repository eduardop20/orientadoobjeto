public class Main {

    public static void main(String[] args){

        Carro c = new Carro("fiat", "amarelo", 4);
        Carro c1 = new Carro("GM", "preto", 4);

        System.out.println("Cor do carro: "+c.cor);
        System.out.println("Cor do carro1: "+c1.cor);

        c.acelerar();
    }

}