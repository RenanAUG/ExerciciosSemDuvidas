package com.mycompany.cadastrarpacientes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Paciente {
    
    public String nome;
    public int idade;
    public int peso;
    public int cpf;
    private Sintoma sintoma;
    
    public Paciente(String nome, int idade, int peso, int cpf){
        this.cpf = cpf;
        this.idade = idade;
        this.nome = nome;
        this.peso = peso;
    }
    
//    public void informarSintoma(Sintoma sintoma){
//        this.sintoma.caracteristica = sintoma
//    }
}
