/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrarpacientes;

/**
 *
 * @author aluno
 */
public class Sintoma {
 
    public String nome;
    public int gravidade;
    public String local;
    public String caracteristica;
    
    public Sintoma(String nome, int gravidade, String local, String caracteristica){
        this.caracteristica = caracteristica;
        this.gravidade = gravidade;
        this.local = local;
        this.nome = nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setGravidade(int gravidade){
        this.gravidade = gravidade;
    }
    
    public int getGravidade(){
        return this.gravidade;
    }
    
    public void setLocal(String local){
        this.local = local;
    }
    
    public String getLocal(){
        return this.local;
    }
    
    public void setCaracteristica(String caracteristica){
        this.caracteristica = caracteristica;
    }
    
    public String getCaracteristica(){
        return this.caracteristica;
    }
    
}
