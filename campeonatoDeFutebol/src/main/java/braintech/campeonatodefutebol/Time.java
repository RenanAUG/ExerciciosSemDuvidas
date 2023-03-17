/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package braintech.campeonatodefutebol;

/**
 *
 * @author aluno
 */
public class Time extends Jogador{
    public String nomeTime;
    public String corTime;
    public String tecnico;
    public int titulos;
    public Jogador jogadorTime;

    public Time(String nome, int num, String posi, String tm, int idd, String nomeTimes, String cor, String tecnicos, int titulo) {
        super(nome, num, posi, tm, idd);
        nomeTime = nomeTimes;
        corTime = cor;
        tecnico = tecnicos;
        titulos = titulo;
    }
}
