
public abstract class Produto implements IPrint{


    private static String descricao;
    private static Cliente cliente;

    public Produto(String descricao, Cliente cliente) {
        Produto.descricao = descricao;
        Produto.cliente = cliente;
    }



    public static String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        Produto.descricao = descricao;
    }

    public static Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        Produto.cliente = cliente;
    }
}
