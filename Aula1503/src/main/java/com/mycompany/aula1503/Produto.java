package com.mycompany.aula1503;

public class Produto {
    int codigo;
    String modelo;
    String categoria;
    String nome;
    double valorCompra;
    double valorVenda;
    int quantidade;
        
    public Produto(){
        
    }
    
    public void imprimir(){
        System.out.println("CADASTRO PRODUTO");
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Modelo: " + this.modelo);  
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Nome: " + this.nome);
        System.out.println("Valor Compra: " + this.valorCompra);
        System.out.println("Valor Venda: " + this.valorVenda);
        System.out.println("Quantidade: " + this.quantidade);
    }
    
    public double calculaDiferenca(){
        return this.valorVenda - this.valorCompra;
    }
}
