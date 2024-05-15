public class SeguroVida extends Produto implements ITributavel{
    private double premio;


    public SeguroVida(String descricao, Cliente cliente, double premio) {
        super(descricao, cliente);
        this.premio = premio;
    }

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }

    @Override
    public void mostraDados(String s) {
        System.out.println("\nSeguro de Vida\n"+
                "*Descrição: " + Produto.getDescricao() + "\n"+
                "*Cliente: " + Produto.getCliente().getNome() + "\n"
                + "*Prêmio: " + getPremio()
        );

    }


    @Override
    public void calcularTributo() {
        System.out.println("Tributo: " + getPremio()*0.7);

    }
}
