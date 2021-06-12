package prova_A2;

public class Telefone {

    private String ddd;
    private String numero;
    private String observacao;
    private TipoTelefone tipoTelefone;
    
    public static Telefone adcionaTelefone(){
        Telefone telefone = new Telefone();
        
        System.out.println("Adcione o telefone");
        System.out.println("DDD: ");
        telefone.ddd = Main.scan.next();
        System.out.println("Numero: ");
        telefone.numero = Main.scan.next();
        System.out.println("Quel o tupo do telefone? 1_ telefone fixo  2_ telefone movel");
        telefone.tipoTelefone = TipoTelefone.valueOf(Main.scan.nextInt());
        System.out.println("Observações sobre o celular: ");
        telefone.observacao = Main.scan.next();
        
        return telefone;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public TipoTelefone getCelular() {
        return tipoTelefone;
    }

    public void setTipoTelefone(int id) {
        this.tipoTelefone = TipoTelefone.valueOf(id);
    }

    public Telefone(String ddd, String numero, String observacao, int id) {
        super();
        this.ddd = ddd;
    this.numero = numero;
        this.observacao = observacao;
        this.tipoTelefone = TipoTelefone.valueOf(id);
    }

    public Telefone() {
    }

    @Override
    public String toString() {
        return "Telefone [getDdd()=" + getDdd() + ", getNumero()=" + getNumero() + ", getObservacao()="
                + getObservacao() + ", getCelular()=" + getCelular() + "]";
    }
}
