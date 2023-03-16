/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrarbicicletas;

/**
 *
 * @author aluno
 */
public class bicicleta {
    
    public String marca;
    public int aro;
    public int tamanho;
    
    private String cor;
    private String modelo;
    private double valor;
    private String fornecedor;
    
    public bicicleta(String corBic, String modeloBic){
        this.cor = corBic;
        this.modelo = modeloBic;
        
    }
    
    public void cadastroFornecedor(double valor, String fornecedor){
        this.fornecedor = fornecedor;
        this.valor = valor;
    }
    
    public void cadastroMarca(String marca, int tamanho, int aro){
        this.marca = marca;
        this.tamanho = tamanho;
        this.aro = aro;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setAro(int aro){
        this.aro = aro;
    }
    
    public int getAro(){
        return aro;
    }
    
    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }
    
    public int getTamanho(){
        return tamanho;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public String getCor(){
        return cor;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setFornecedor(String fornecedor){
        this.fornecedor = fornecedor;
    }
    
    public String getFornecedor(){
        return fornecedor;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public double getValor(){
        return valor;
    }   
}
