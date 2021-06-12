package prova_A2;

public class Funcionario extends Pessoa {

    private int salario;
    private int comisao;
    private int cargo;
    private String status;
    
    @Override
    public void alterar(int id) {
        super.alterar(id);
        
        switch(id){
            case 6:
                System.out.println("Iforme o salario: ");
                this.salario = Main.scan.nextInt();
                break;
            case 7:
                System.out.println("Informe a comisssão: ");
                this.comisao = Main.scan.nextInt();
                break;
            case 8:
                System.out.println("Informe o cargo: ");
                this.cargo = Main.scan.next();
                break;
            case 9:
                System.out.println("Informe o status: ");
                this.status = Main.scan.next();
                break;
        }
    }

    @Override
    public void incluir() {
        super.incluir();
        System.out.println("Salario: ");
        this.salario = Main.scan.nextInt();
        System.out.println("Informe a Comisssão: ");
        this.comisao = Main.scan.nextInt();
        System.out.println("Cargo: ");
        this.cargo = Main.scan.next();
        System.out.println("Status: ");
        this.status = Main.scan.next();
    }

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
