public class Carro {

    private String marca;
    private String cor;
    private int portas;
    
    public Carro (String marca, String cor, int portas){
        this.marca = marca;
        this.cor = cor;
        this.portas = portas;
    }

    private boolean testCor(String cor)
    {
        if(cor!="vermelho")
        {
            return true;
        }
        return false;
    }

    public void acelerar(){
        System.out.println("acelerando...");
    }

    public String getCor() 
    {
        return cor;
    }

    public String getMarca() 
    {
        return marca;
    }

    public int Portas() 
    {
        return portas;
    }

    public void setCor(String cor) 
    {
        if(testCor(cor)){
            this.cor = cor;
        }

        else{
            System.out.println("A cor nao pode ser vermelha!");
        }
    }

    public void setMarca(String marca) 
    {
        this.marca = marca;
    }

    public void setPortas(int portas)
    {
        this.portas = portas;
    }

}
