public class Cliente implements IPrint{

    private String Nome;
    private String CPF;

    public Cliente(String nome, String CPF) {
        Nome = nome;
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public void mostraDados(String s) {
        System.out.println(
                "Nome: " + Nome + "\n" +
                "CPF: " + CPF + "\n"
        );

    }

}
