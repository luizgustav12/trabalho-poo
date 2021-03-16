package com.mycompany.aula1503;

public class Cliente {
    String nome; //nao precisa colocar NOMECLIENTE pq ja sao classes diferentes,elas ja vao ta difetente
    String cpf;
    String agencia;
    String contaCorrente;
    String endereco;
    String telefone;
    
    // public, private e protected
    // sua o get o set
    public Cliente(){
        
    }
    
    public void imprimir(){       
        System.out.println("CADASTRO CLIENTE");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);  
        System.out.println("Agência: " + this.agencia);
        System.out.println("Conta Corrente: " + this.contaCorrente);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
    }
    
    
}
