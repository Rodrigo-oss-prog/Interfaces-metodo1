public class Main {
    public static void main(String[] args) {

        System.out.println("Sistema\n");

        Cliente cliente = new Cliente("João", "223.226.555-11");

        Poupanca poupanca = new Poupanca("PoupaMais", cliente, "499", 2200.00,
                20.00);
        poupanca.mostraDados("Poupança");
        Corrente CC1 = new Corrente("CC Standart", cliente,"226658", 200.00,
                900.0);
        CC1.mostraDados("Corrente");
        CC1.calcularTributo();
        SeguroVida seguroVida = new SeguroVida("SeguroMais", cliente, 10000.0);
        seguroVida.mostraDados("Seguro de Vida");
        seguroVida.calcularTributo();
    }
}
