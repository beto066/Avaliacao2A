/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova_A2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        List<Pessoa> lista = new ArrayList<Pessoa>();
        Pessoa pessoa = new Pessoa("33464","paulo","shfsdf@hbchjfd.com",null,
                new Telefone("98", "3287436", "numero", true) ,"arroz".hashCode());
        Pessoa pessoa2 = new Pessoa("3346544","paula","shfsdf@hbchjfd.com",null,null,"feijão".hashCode());
        
        lista.add(pessoa);
        lista.add(pessoa2);
        pessoa.imprimirTudo(lista);
        pessoa.imprimirFiltro(lista,"98");
        pessoa.excluir(lista);
        //pessoa.imprimirTudo(lista);
        
        
        //System.out.println("Já tem uma conta? 1 _ SIM   2_ NÃO");
        
        //if(scan.nextInt()==1){
            
        //}
        
    }
    
    //public static 
}
