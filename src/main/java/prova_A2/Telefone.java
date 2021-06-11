package prova_A2;

public class Telefone {

    private String ddd;
    private String numero;
    private String observacao;
    private Boolean celular;
    
    public static Telefone adcionaTelefone(){
        Telefone telefone = new Telefone();
        
        System.out.println("Adcione o telefone");
        System.out.println("DDD: ");
        telefone.ddd = Main.scan.next();
        System.out.println("Numero: ");
        telefone.numero = Main.scan.next();
        System.out.println("É um celular? 1_ SIM   2_ NÃO");
        telefone.celular = (Main.scan.nextInt() == 1);
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

    public Boolean getCelular() {
        return celular;
    }

    public void setCelular(Boolean celular) {
        this.celular = celular;
    }

    public Telefone(String ddd, String numero, String observacao, Boolean celular) {
        super();
        this.ddd = ddd;
        this.numero = numero;
        this.observacao = observacao;
        this.celular = celular;
    }

    public Telefone() {
    }

    @Override
    public String toString() {
        return "Telefone [getDdd()=" + getDdd() + ", getNumero()=" + getNumero() + ", getObservacao()="
                + getObservacao() + ", getCelular()=" + getCelular() + "]";
    }

}
