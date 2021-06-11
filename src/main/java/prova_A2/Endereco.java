package prova_A2;

public class Endereco {

    private String cep;
    private String bairro;
    private String logadoro;
    private String numero;
    
    public static Endereco adcionaEndereco(){
        Endereco endereco = new Endereco();
        
        System.out.println("Informe o endereço: ");
        System.out.println("CEP: ");
        endereco.setCep(Main.scan.next());
        System.out.println("Bairro: ");
        endereco.setBairro(Main.scan.next());
        System.out.println("Logradouro: ");
        endereco.setLogadoro(Main.scan.next());
        System.out.println("Numero da casa: ");
        endereco.setNumero(Main.scan.next());
        
        return endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogadoro() {
        return logadoro;
    }

    public void setLogadoro(String logadoro) {
        this.logadoro = logadoro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Endereco(String cep, String bairro, String logadoro, String numero) {
        super();
        this.cep = cep;
        this.bairro = bairro;
        this.logadoro = logadoro;
        this.numero = numero;
    }

    public Endereco() {
    }

    @Override
    public String toString() {
        return "Endereco [getCep()=" + getCep() + ", getBairro()=" + getBairro() + ", getLogadoro()=" + getLogadoro()
                + ", getNumero()=" + getNumero() + "]";
    }

}
