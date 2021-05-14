public class ContaCorrente extends Conta{
    
    public ContaCorrente()
    {

    }

    public void imprime_saldo()
    {
        System.out.println("Conta Corrente");
        System.out.println("Saldo: R$ "+getSaldo());
    }
}