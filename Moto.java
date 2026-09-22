public class Moto extends Veiculo {
    private int cilindradas;

     public Moto(String marca, String modelo, int potencia, int cilindradas, Proprietario proprietario) {
        
    super(marca, modelo, potencia, proprietario); 
        

        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void imprimir() {
        System.out.println("=== MOTO ===");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Potência: " + getMotor().getPotencia());
        System.out.println("Cilindradas: " + cilindradas);
        System.out.println("Proprietário: " + getProprietario().getNome());

    }
}
