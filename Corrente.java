public class Corrente extends Conta implements ITributavel{

    private double limiteDisponivel;

    public Corrente(String descricao, Cliente cliente,String numero, double saldo,
                    double limiteDisponivel) {
        super(descricao, cliente, numero, saldo);
        this.limiteDisponivel = limiteDisponivel;
        
    }


    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(double limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }


    @Override
    public String toString() {
        return super.toString();
    }


    @Override
    public void mostraDados(String s) {
        super.mostraDados(s);
        System.out.println("\nConta Corrente \n"+
                "*Descrição: " + Produto.getDescricao() + "\n"+
                "*Cliente: " + getCliente().getNome() + "\n"
                + "*Número: " + getNumero()+ "\n"
                + "*Saldo: " + getSaldo() + "\n"+
                "*Limite Disponivel: R$ " + limiteDisponivel );

    }


    @Override
    public void calcularTributo() {
        System.out.println("Tributo: " + getSaldo() * 0.5);
    }
}
