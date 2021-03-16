package com.mycompany.aula1503;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Cadastro de Cliente");
        Cliente cli = new Cliente(); // instancia um obj
        
        System.out.println("Digite o nome: ");
        cli.nome = scan.next();
        
        System.out.println("Digite o cpf: ");        
        cli.cpf = scan.next();
        
        System.out.println("Digite o agência: ");        
        cli.agencia = scan.next();
        
        System.out.println("Digite o conta corrente: ");        
        cli.contaCorrente = scan.next();
        
        System.out.println("Digite o endereco: ");        
        cli.endereco = scan.next();
        
        System.out.println("Digite o telefone: ");        
        cli.telefone = scan.next(); 
        
        cli.imprimir(); // chama void imprimir la do cliente
        
        // ----------------------------------------------------------
        
        System.out.println("Cadastro de Cliente");
        Cliente cli2 = new Cliente(); // instancia um obj
        
        System.out.println("Digite o nome: ");
        cli2.nome = scan.next();
        
        System.out.println("Digite o cpf: ");        
        cli2.cpf = scan.next();
        
        System.out.println("Digite o agência: ");        
        cli2.agencia = scan.next();
        
        System.out.println("Digite o conta corrente: ");        
        cli2.contaCorrente = scan.next();
        
        System.out.println("Digite o endereco: ");        
        cli2.endereco = scan.next();
        
        System.out.println("Digite o telefone: ");        
        cli2.telefone = scan.next();        
        
        cli2.imprimir(); // chama void imprimir la do cliente

        // ----------------------------------------------------------
        
        System.out.println("Cadastro de Produto");
        Produto prod = new Produto(); // instancia um obj
        
        System.out.println("Digite o codigo: ");
        prod.codigo = scan.nextInt();
        
        System.out.println("Digite o modelo: ");        
        prod.modelo = scan.next();
        
        System.out.println("Digite o categoria: ");        
        prod.categoria = scan.next();
        
        System.out.println("Digite o nome: ");        
        prod.nome = scan.next();
        
        System.out.println("Digite o valor compra: ");        
        prod.valorCompra = scan.nextDouble();
        
        System.out.println("Digite o valor venda: ");        
        prod.valorVenda = scan.nextDouble();        

        System.out.println("Digite o quantidade: ");        
        prod.quantidade = scan.nextInt();  
        
        prod.imprimir(); // chama void imprimir la do cliente

        System.out.println("O valor da diferença da compra e venda é: " + prod.calculaDiferenca());
        scan.close();
    }
}
