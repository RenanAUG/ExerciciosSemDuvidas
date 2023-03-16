/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cadastrarbicicletas;

/**
 *
 * @author aluno
 */
public class CadastrarBicicletas {

    public static void main(String[] args){
            bicicleta bike = new bicicleta("branca", "Gt Sprint");
            bike.cadastroFornecedor(100, "decathlon");
            bike.cadastroMarca("BMX", 15, 26);
            
            System.out.println("\nCor da bike: " + bike.getCor());
            System.out.println("Modelo da bike: " + bike.getModelo());
            System.out.println("Valor da bike: " + bike.getValor());
            System.out.println("Fornecedor da bike: " + bike.getFornecedor());
            System.out.println("Marca da bike: " + bike.getMarca());
            System.out.println("Tamanho da bike: " + bike.getTamanho());
            System.out.println("Aro da bike: " + bike.getAro());
            
            bicicleta bike1 = new bicicleta("rosa", "Ultra Bike");
            bike1.cadastroFornecedor(100, "PACO");
            bike1.cadastroMarca("Caloi", 10, 28);
            
            System.out.println("\nCor da bike: " + bike.getCor());
            System.out.println("Modelo da bike: " + bike.getModelo());
            System.out.println("Valor da bike: " + bike.getValor());
            System.out.println("Fornecedor da bike: " + bike.getFornecedor());
            System.out.println("Marca da bike: " + bike.getMarca());
            System.out.println("Tamanho da bike: " + bike.getTamanho());
            System.out.println("Aro da bike: " + bike.getAro());
            
            bicicleta bike2 = new bicicleta("vermelho", "Droop Aluminium");
            bike2.cadastroFornecedor(100, "Casa das Bicicletas");
            bike2.cadastroMarca("Giant", 7, 26);
            
            System.out.println("\nCor da bike: " + bike.getCor());
            System.out.println("Modelo da bike: " + bike.getModelo());
            System.out.println("Valor da bike: " + bike.getValor());
            System.out.println("Fornecedor da bike: " + bike.getFornecedor());
            System.out.println("Marca da bike: " + bike.getMarca());
            System.out.println("Tamanho da bike: " + bike.getTamanho());
            System.out.println("Aro da bike: " + bike.getAro());
            
            bicicleta bike3 = new bicicleta("preto", "Avance Onix");
            bike3.cadastroFornecedor(100, "Kubo Cycle");
            bike3.cadastroMarca("Focus", 8, 20);
            
            System.out.println("\nCor da bike: " + bike.getCor());
            System.out.println("Modelo da bike: " + bike.getModelo());
            System.out.println("Valor da bike: " + bike.getValor());
            System.out.println("Fornecedor da bike: " + bike.getFornecedor());
            System.out.println("Marca da bike: " + bike.getMarca());
            System.out.println("Tamanho da bike: " + bike.getTamanho());
            System.out.println("Aro da bike: " + bike.getAro());
            
            bicicleta bike4 = new bicicleta("marrom", "Coli Gps");
            bike4.cadastroFornecedor(100, "Perere");
            bike4.cadastroMarca("Sense", 10, 15);
            
            System.out.println("\nCor da bike: " + bike.getCor());
            System.out.println("Modelo da bike: " + bike.getModelo());
            System.out.println("Valor da bike: " + bike.getValor());
            System.out.println("Fornecedor da bike: " + bike.getFornecedor());
            System.out.println("Marca da bike: " + bike.getMarca());
            System.out.println("Tamanho da bike: " + bike.getTamanho());
            System.out.println("Aro da bike: " + bike.getAro());
            
            bicicleta bike5 = new bicicleta("azul", "Blitz Pontal   ");
            bike5.cadastroFornecedor(100, "casa da bike");
            bike5.cadastroMarca("Cannondale", 20, 10);
            
            System.out.println("\nCor da bike: " + bike.getCor());
            System.out.println("Modelo da bike: " + bike.getModelo());
            System.out.println("Valor da bike: " + bike.getValor());
            System.out.println("Fornecedor da bike: " + bike.getFornecedor());
            System.out.println("Marca da bike: " + bike.getMarca());
            System.out.println("Tamanho da bike: " + bike.getTamanho());
            System.out.println("Aro da bike: " + bike.getAro());
    }
}
