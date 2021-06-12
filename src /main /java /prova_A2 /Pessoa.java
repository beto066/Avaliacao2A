package prova_A2;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class Pessoa implements CRUD<Pessoa> {

    private String cpf;
    private String nome;
    private String email;
    private Endereco endereco;
    private Telefone telefone;
    private int senha;
    
    public Pessoa(String cpf, String nome, String email, Endereco endereco, Telefone telefone, int senha) {
        super();
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.senha = senha;
    }

    public Pessoa() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Pessoa [getCpf()=" + getCpf() + ", getNome()=" + getNome() + ", getEmail()=" + getEmail() + "]";
    }

    public Pessoa loginUsuario(List<Pessoa> lista) {
		System.out.println("------------[Login]--------------");
		System.out.println("Digite o email: ");
		String email = Main.scan.next();
		System.out.println("Digite a senha: ");
		int senha = Main.scan.next().hashCode();
		
		for (Pessoa p : lista) {
			if(p.getEmail().equalsIgnoreCase(email) && p.getSenha()==senha ) {
				return p;
			}
		}
		return null;
	}

    @Override
    public void incluir() {
        System.out.println("------------[Cadastro]--------------");
        System.out.println("Nome: ");
        this.nome = Main.scan.next();
        System.out.println("Email:");
        this.email = Main.scan.next();
        System.out.println("Senha: ");
        this.senha = Main.scan.next().hashCode();
        this.endereco = Endereco.adcionaEndereco();
        this.telefone = Telefone.adcionaTelefone();
    }

    @Override
    public void alterar() {
        System.out.println("Escolha um para alterar: ");
        System.out.println("1_ Nome: ");
        System.out.println("2_ Email:");
        System.out.println("3_ Senha: ");
        System.out.println("4_ Telefone: ");
        System.out.println("5_ Endereço: ");
        
        switch(Main.scan.nextInt()){
            case 1:
                System.out.println("Nome: ");
                this.nome = Main.scan.next();
                break;
            case 2: 
                System.out.println("Email:");
                this.email = Main.scan.next();
                break;
            case 3:
                System.out.println("Senha: ");
                this.senha = Main.scan.next().hashCode();
                break;
            case 4:
                this.telefone = Telefone.adcionaTelefone();
                break;
            case 5:
                this.endereco = Endereco.adcionaEndereco();
        }
    }

    @Override
    public void excluir(List<Pessoa> lista) {
        lista.removeIf(p -> (p.equals(this)));
    }

    @Override
    public void imprimirTudo(List<Pessoa> lista) {
        lista.forEach(p -> System.out.println(p));
    }

    @Override
    public void imprimirOrdenado(List<Pessoa> lista) {
        lista.stream().sorted((p1,p2) -> p1.getNome().compareTo(p2.getNome()))
                .forEach(p -> System.out.println(p));
    }

    @Override
    public void imprimirFiltro(List<Pessoa> lista, Object ddd) {
        lista.stream().filter((Pessoa p) -> {
            if(p.telefone != null)
                return p.telefone.getDdd().equals(ddd);
            
            return false;
        }).forEach(p -> System.out.println(p));
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
