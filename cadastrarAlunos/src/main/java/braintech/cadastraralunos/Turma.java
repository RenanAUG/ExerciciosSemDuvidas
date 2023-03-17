/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package braintech.cadastraralunos;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Turma {
    private int numeroTurma;
    private String nomeTurma;
    private String periodo;
    private ArrayList<Aluno> alunos;

    public Turma(int numeroTurma, String nomeTurma) {
        this.numeroTurma = numeroTurma;
        this.nomeTurma = nomeTurma;
        alunos = new ArrayList<>();
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public int getNumeroTurma() {
        return numeroTurma;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public String getPeriodo() {
        return periodo;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
}
