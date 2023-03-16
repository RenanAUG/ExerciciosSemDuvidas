/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedidomesadebar;

/**
 *
 * @author aluno
 */
public class cadastrarPedido {
    
    public String bebida;
    public int mesa;
    public int qntCopos;
    public int qntBebidas;
    public double valor;

    cadastrarPedido(String tipoBebida, int numMesa, int copos, int QuantBebida, double valorDeCompra) {
        this.bebida = tipoBebida;
        this.mesa = numMesa;
        this.qntCopos = copos;
        this.qntBebidas = QuantBebida;
        this.valor = valorDeCompra;
    }
    
    public String getBebida(){
        return "Qual a sua bebida? " + bebida;
    }
    
    public String getMesa(){
        return "Qual o número da sua mesa? " + mesa;
    }
    
    public String getQntCopos(){
        return "Quantos copos são necessários? "  + qntCopos;
    }
    
    public String getQntBebidas(){
        return "Quantas bebidas vão querer? " + qntBebidas;
    }
    
    public double getValor(){
        return this.valor;
    }
    
    public void setValor(double valorVenda){
        this.valor = valorVenda;
    }
}
