public class Main {
    
    public static void main(String[] args) {
ContaCorrente c = new ContaCorrente();
        c.depositar(50);    
        c.imprime_saldo();
ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(100);
        cp.sacar(40);
        cp.imprime_saldo();
    } 
    
}

