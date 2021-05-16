public class Mensagem implements Comunicacao{
    
    public void recebe_mensagem(String msg)
    {
        System.out.println("app Mensagem");
        System.out.println("Mensagem recebida: "+msg);
    }

    public String envia_mensagem(String msg)
    {
        return msg;
    }

}