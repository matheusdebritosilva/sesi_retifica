public class Carro extends Veiculo {
    private int quantidadePortas;

    
    public Carro(String marca, String modelo, int quantidadePortas, int potencia, Proprietario proprietario) {
        super(marca, modelo,potencia, proprietario); 
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void imprimir() {
        System.out.println("=== CARRO ===");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Potência: " + getMotor().getPotencia());
        System.out.println("Quantidade de portas: " + quantidadePortas);
        System.out.println("Proprietário: " + getProprietario().getNome());


    }
}