package prova_A2;

import java.util.Date;
import java.util.List;

public class Pedido{

    private float valorTotal;
    private String produto;
    private Pagamento pagamento;
    private Cliente cliente;
    private Funcionario funcionario;

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Pedido() {
    }

    public Pedido(Integer id, float valorTotal, String produto, Pagamento pagamento, Cliente cliente,
            Funcionario funcionario) {
        super();
        this.valorTotal = valorTotal;
        this.produto = produto;
        this.pagamento = pagamento;
        this.cliente = cliente;
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "Pedido [" + ", getValorTotal()=" + getValorTotal() + ", getCliente()="
                + getCliente() + ", getFuncionario()=" + getFuncionario() + "]";
    }

    public void statusPedido() {

    }

    public void incluir() {
        System.out.println("Informe o valor do produto: ");
        this.valorTotal = Main.scan.nextInt();
        System.out.println("Informe ");
    }

    public void alterar() {
        // TODO Auto-generated method stub

    }

    public void excluir(List<Pedido> lista) {
        lista.removeIf(p -> (p.equals(this)));
    }
}
