public class Main {
    public static void main(String[] args) {

        Proprietario dono1 = new Proprietario("Cr7", "777.777.777-7");
        Moto cb500 = new Moto(
            "Bmw",
            "S1000",
            120,
            999,
            dono1
        );

        cb500.imprimir();

        Proprietario dono2 = new Proprietario("Messi", "10.10.10");
        Carro carro = new Carro(
            "Mercedes",
            "G63 AMG",
            300,
            4,
            dono2
        );

        carro.imprimir();
    }
}
