package prova_A2;

public class Produto {

    private String nome;
    private int quantidade;
    private int valorPago;
    private int valorCobrado;
    private Estoque estoque;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getValorPago() {
        return valorPago;
    }

    public void setValorPago(int valorPago) {
        this.valorPago = valorPago;
    }

    public int getValorCobrado() {
        return valorCobrado;
    }

    public void setValorCobrado(int valorCobrado) {
        this.valorCobrado = valorCobrado;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Produto() {
    }

    public Produto(int quantidade, int valorPago, int valorCobrado, Estoque estoque, String nome) {
        super();
        this.quantidade = quantidade;
        this.valorPago = valorPago;
        this.valorCobrado = valorCobrado;
        this.estoque = estoque;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto [getQuantidade()=" + getQuantidade() + ", getValorPago()=" + getValorPago()
                + ", getValorCobrado()=" + getValorCobrado() + "]";
    }

}
