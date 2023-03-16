/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package braintech.cadastrarpacientes;

/**
 *
 * @author aluno
 */
public class Paciente {
    
    public String nomePaciente;
    public String cpfPaciente;
    public int idadePaciente;
    public double pesoPaciente;
    public boolean pessoaDeficiente;
    
    public Paciente(String nome, String cpf, int idade,double peso, boolean deficiente){
        this.nomePaciente = nome;
        this.cpfPaciente = cpf;
        this.idadePaciente = idade;
        this.pesoPaciente = peso;
        this.pessoaDeficiente = deficiente;
    }
    public String getInfoClientes(){
        return "\nNome do paciente: " + nomePaciente + " CPF do paciente: "+ cpfPaciente+ "idade do paciente: " +
                idadePaciente + "peso do paciente: " + pesoPaciente + "deficiente? " + pessoaDeficiente;
    }
    
}
