/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.pedidomesadebar;

/**
 *
 * @author aluno
 */
public class PedidoMesaDeBar {

    public static void main(String[] args) {

        cadastrarPedido pedido1 = new cadastrarPedido("Cerveja", 12, 4, 2, 15.0);
        cadastrarPedido pedido2 = new cadastrarPedido("Vodka", 2, 5, 1, 25.0);
        cadastrarPedido pedido3 = new cadastrarPedido("Caipirinha", 4, 2, 5, 30.0);
        cadastrarPedido pedido4 = new cadastrarPedido("Café com leite", 10, 5, 1, 5.0);
        cadastrarPedido pedido5 = new cadastrarPedido("Refrigerante", 1, 8, 3, 6.0);

        System.out.println(pedido1.getBebida());
        System.out.println( pedido1.getMesa());
        System.out.println(pedido1.getQntCopos());
        System.out.println(pedido1.getQntBebidas());
        System.out.println(pedido1.getValor());


        System.out.println("\n Qual seu pedido?");

        System.out.println(pedido2.getBebida());
        System.out.println( pedido2.getMesa());
        System.out.println( pedido2.getQntCopos());
        System.out.println( pedido2.getQntBebidas());
        System.out.println(pedido2.getValor());

        
        System.out.println("\nQual seu pedido? ");

        System.out.println(pedido3.getBebida());
        System.out.println(pedido3.getMesa());
        System.out.println( pedido3.getQntCopos());
        System.out.println(pedido3.getQntBebidas());
        System.out.println(pedido3.getValor());

        System.out.println("\nQual seu pedido? ");

        System.out.println(pedido4.getBebida());
        System.out.println( pedido4.getMesa());
        System.out.println(pedido4.getQntCopos());
        System.out.println( pedido4.getQntBebidas());
        System.out.println(pedido4.getValor());

        System.out.println("\nQual seu pedido? ");

        System.out.println(pedido5.getBebida());
        System.out.println(pedido5.getMesa());
        System.out.println(pedido5.getQntCopos());
        System.out.println(pedido5.getQntBebidas());
        System.out.println(pedido5.getValor());
        
        System.out.println("\nO valor total de cada pedido é: " + pedido1.getValor() + "\n" + pedido2.getValor() + "\n" + pedido3.getValor() + "\n" + pedido4.getValor() + "\n" + pedido5.getValor());

    }
}
