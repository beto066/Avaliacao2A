package prova_A2;

import java.util.Date;
import java.util.List;

public class Pedido implements CRUD<Pedido> {

    private Integer id;
    private float valorTotal;
    private Produto produto;
    private Pagamento pagamento;
    private Cliente cliente;
    private Funcionario funcionario;

    public Integer getId() {
        return this.id;
    }

    public void setData(Integer id) {
        this.id = id;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
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

    public Pedido(Integer id, float valorTotal, Produto produto, Pagamento pagamento, Cliente cliente,
            Funcionario funcionario) {
        super();
        this.id = id;
        this.valorTotal = valorTotal;
        this.produto = produto;
        this.pagamento = pagamento;
        this.cliente = cliente;
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "Pedido [getData()=" + getId() + ", getValorTotal()=" + getValorTotal() + ", getCliente()="
                + getCliente() + ", getFuncionario()=" + getFuncionario() + "]";
    }

    public void statusPedido() {

    }

    @Override
    public void incluir() {
        System.out.println("Informe o valor do produto: ");
        this.valorTotal = Main.scan.nextInt();
        System.out.println("Informe ");
    }

    @Override
    public void alterar() {
        // TODO Auto-generated method stub

    }

    @Override
    public void excluir(List<Pedido> lista) {
        lista.removeIf(p -> (p.equals(this)));
    }

    @Override
    public void imprimirTudo(List<Pedido> lista) {
        lista.forEach(p -> System.out.println(p));
    }

    @Override
    public void imprimirOrdenado(List<Pedido> lista) {
        lista.stream().sorted((p1,p2) -> p1.getId().compareTo(p2.getId()))
                .forEach(p -> System.out.println(p));
    }

    @Override
    public void imprimirFiltro(List<Pedido> lista, Object produto) {
        lista.stream().filter(p -> p.produto.getNome().equals(produto))
                .forEach(p -> System.out.println(p));
    }

}
