public class Conta {
    
    private int numero;
    private float saldo;

    public void depositar(float valor)
    {
        saldo += valor;
    }

    public void sacar(float valor)
    {
        saldo -= valor;
    }

    public void imprime_saldo()
    {
        System.out.println(saldo);
    }

}
