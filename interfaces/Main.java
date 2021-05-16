
public class Main {
    
    public static void main(String[] args) {
        
        Chat c = new Chat();
        Mensagem m = new Mensagem();

        String msg = c.envia_mensagem("Mensagem enviada pelo app Chat");
        m.recebe_mensagem(msg);

    }

}