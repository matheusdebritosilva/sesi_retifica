public class Veiculo implements Imprimivel {
    private String marca;
    private String modelo;
    private int potencia;
    private Motor motor;
    private Proprietario proprietario;

    public Veiculo(String marca, String modelo, int potencia, Proprietario proprietario) {
    this.marca = marca;
    this.modelo = modelo;
    this.motor = new Motor(potencia);
    this.proprietario = proprietario;
}



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public void imprimir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Potência: " + motor.getPotencia());
        System.out.println("Proprietário: " + getProprietario().getNome());

    }
}
