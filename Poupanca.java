public class Poupanca extends Conta{

    private double rendimentoAnual;


    public Poupanca(String descricao, Cliente cliente, String numero,double saldo,
                    double rendimentoAnual) {
        super(descricao,cliente,numero,saldo);
        this.rendimentoAnual = rendimentoAnual;


    }

    public double getRendimentoAnual() {
        return rendimentoAnual;
    }

    public void setRendimentoAnual(double rendimentoAnual) {
        this.rendimentoAnual = rendimentoAnual;
    }
    @Override
    public void mostraDados(String s) {
        super.mostraDados(s);
        System.out.println("Poupança \n" +
                "*Descrição: " + Produto.getDescricao() + "\n"+
                "*Cliente: " + getCliente().getNome() + "\n"
                + "*Número: " + getNumero()+"\n"
                + "*Saldo: " + getSaldo()+ "\n"+
                "*Rendimento Anual: R$ " + getRendimentoAnual());
    }

}











