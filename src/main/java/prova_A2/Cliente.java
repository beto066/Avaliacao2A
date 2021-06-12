package prova_A2;

public class Cliente extends Pessoa {

    private String fidelidade;
    private Boolean devedor;
    private int valorDevedor;
    
    @Override
    public void alterar(int id) {
        super.alterar(id);

        switch (id) {
            case 6:
                System.out.println("Quantas compras o cliente fez? ");
                this.fidelidade = Main.scan.next();
                break;
            case 7:
                System.out.println("O cliente é devedor? 1_ SIM  2_ NÃO  ");
                this.devedor = (Main.scan.nextInt() == 1);
                this.valorDevedor = 0;
                break;
            case 8:
                if (!devedor) {
                    System.out.println("O cliente não é devedor!  ");
                } else {
                    System.out.println("Quanto o cliente deve? ");
                    this.valorDevedor = Main.scan.nextInt();
                }
        }
    }

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
        return super.toString() + " getFidelidade()=" + getFidelidade() + ", getDevedor()=" + getDevedor() + ", getValorDevedor()="
                + getValorDevedor() + "]";
    }

    public void menuCliente() {

    }

}
