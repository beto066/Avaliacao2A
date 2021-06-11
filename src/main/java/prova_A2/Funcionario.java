package prova_A2;

public class Funcionario extends Pessoa {

    private int salario;
    private int comisao;
    private int cargo;
    private String status;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getComisao() {
        return comisao;
    }

    public void setComisao(int comisao) {
        this.comisao = comisao;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Funcionario() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Funcionario(String cpf, String nome, String email, Endereco endereco, Telefone telefone, int senha) {
        super(cpf, nome, email, endereco, telefone,senha);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Funcionario [getSalario()=" + getSalario() + ", getComisao()=" + getComisao() + ", getCargo()="
                + getCargo() + ", getStatus()=" + getStatus() + "]";
    }

    public void menuCliente() {

    }
}
