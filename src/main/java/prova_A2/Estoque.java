package prova_A2;

import java.util.List;
import java.util.Objects;

public class Estoque implements CRUD<Estoque> {

    private String sabor;
    private String tipo;
    private String marca;
    private float kg;
    private float preco;
    private int quantEstoque;

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estoque other = (Estoque) obj;
        if (!Objects.equals(this.sabor, other.sabor)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        return true;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getKg() {
        return kg;
    }

    public void setKg(float kg) {
        this.kg = kg;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    public Estoque() {
    }

    public Estoque(String sabor, String tipo, String marca, float kg, float preco, int quantEstoque) {
        super();
        this.sabor = sabor;
        this.tipo = tipo;
        this.marca = marca;
        this.kg = kg;
        this.preco = preco;
        this.quantEstoque = quantEstoque;
    }

    @Override
    public String toString() {
        return "Estoque [getSabor()=" + getSabor() + ", getTipo()=" + getTipo() + ", getMarca()=" + getMarca()
                + ", getKg()=" + getKg() + ", getPreco()=" + getPreco() + ", getQuantEstoque()=" + getQuantEstoque()
                + "]";
    }

    @Override
    public void incluir() {
        // TODO Auto-generated method stub

    }

    @Override
    public void alterar() {
        // TODO Auto-generated method stub

    }

    @Override
    public void excluir(List<Estoque> lista) {
        lista.removeIf(p -> (p.equals(this)));
    }

    @Override
    public void imprimirTudo(List<Estoque> lista) {
        lista.forEach(p -> System.out.println(p));
    }

    @Override
    public void imprimirOrdenado(List<Estoque> lista) {
        lista.stream().sorted((p1,p2) -> p1.getTipo().compareTo(p2.getTipo()))
                .forEach(p -> System.out.println(p));
    }

    @Override
    public void imprimirFiltro(List<Estoque> lista, Object mudarNome) {
        lista.stream().filter(p -> p.getMarca().equals(getMarca()))
                .forEach(p -> System.out.println(p));
    }

}
