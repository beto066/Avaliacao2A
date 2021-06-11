package prova_A2;

public class Cliente extends Pessoa {

    private String fidelidade;
    private Boolean devedor;
    private int valorDevedor;

    public String getFidelidade() {
        return fidelidade;
    }

    public void setFidelidade(String fidelidade) {
        this.fidelidade = fidelidade;
    }

    public Boolean getDevedor() {
        return devedor;
    }

    public void setDevedor(Boolean devedor) {
        this.devedor = devedor;
    }

    public int getValorDevedor() {
        return valorDevedor;
    }

    public void setValorDevedor(int valorDevedor) {
        this.valorDevedor = valorDevedor;
    }

    public Cliente() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Cliente(String cpf, String nome, String email, Endereco endereco, Telefone telefone, int senha) {
        super(cpf, nome, email, endereco, telefone,senha);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Cliente [getFidelidade()=" + getFidelidade() + ", getDevedor()=" + getDevedor() + ", getValorDevedor()="
                + getValorDevedor() + "]";
    }

    public void menuCliente() {

    }

}
