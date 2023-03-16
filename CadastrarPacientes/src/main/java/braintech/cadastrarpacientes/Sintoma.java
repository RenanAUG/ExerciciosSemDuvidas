/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package braintech.cadastrarpacientes;

/**
 *
 * @author aluno
 */
public class Sintoma {
    
    public String doenca;
    public boolean dorLocalizada;
    public int diasComSintoma;
    public double riscoInfeccao;
    public char tipoSanguineo;
    
    public Sintoma(String sintoma, boolean dorLoc, int dias, double risco, char tiposangue){
        this.doenca = sintoma;
        this.dorLocalizada = dorLoc;
        this.diasComSintoma = dias;
        this.riscoInfeccao = risco;
        this.tipoSanguineo = tiposangue;
    }
    public String getInfoCadastro(){
        return "\nSintoma informado: " + doenca + " Dor localizada: " + dorLocalizada+ " Dias com sintoma: " + diasComSintoma
                + " tem risco de infeccao? " + riscoInfeccao + " tipo sanguineo: " + tipoSanguineo;
    }
}
