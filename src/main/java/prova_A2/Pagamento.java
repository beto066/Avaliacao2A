package prova_A2;

import java.util.*;

public class Pagamento {

    private float valor;
    private Date dataPagamento;
    private String tipoPagamento;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Pagamento() {
    }

    public Pagamento(float valor, Date dataPagamento, String tipoPagamento) {
        super();
        this.valor = valor;
        this.dataPagamento = dataPagamento;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Pagamento [getValor()=" + getValor() + ", getDataPagamento()=" + getDataPagamento() + "]";
    }

    public void statusPedido() {

    }

}
