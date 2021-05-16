  
public interface Comunicacao {
    
    public abstract void recebe_mensagem(String msg);
    public abstract String   envia_mensagem(String msg);

}