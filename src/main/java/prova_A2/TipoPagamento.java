package prova_A2;

public enum TipoPagamento {
    DEBITO(1, "Debito"),
    CREDITO(1, "Credito"),
    DINHEIRO(1, "Dinheiro"),
    FIADO(1, "Fiado");

    private int id;
    private String descricao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    private TipoPagamento(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public TipoPagamento valueOf(int id) {
        for (TipoPagamento sexo : TipoPagamento.values()) {
            if (sexo.getId() == id) {
                return sexo;
            }
        }
        return null;
    }
}
