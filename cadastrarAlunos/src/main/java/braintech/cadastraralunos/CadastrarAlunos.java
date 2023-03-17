/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package braintech.cadastraralunos;

/**
 *
 * @author aluno
 */
public class CadastrarAlunos {

    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno(1, "João");
        aluno1.setIdade(20);
        aluno1.setCurso("Engenharia");
        aluno1.setMediaNotas(8.5);

        Aluno aluno2 = new Aluno(2, "Maria");
        aluno2.setIdade(19);
        aluno2.setCurso("Administração");
        aluno2.setMediaNotas(7.2);

        Aluno aluno3 = new Aluno(3, "Pedro");
        aluno3.setIdade(22);
        aluno3.setCurso("Direito");
        aluno3.setMediaNotas(9.0);
        
        Turma turma1 = new Turma(1, "Turma A");
        turma1.setPeriodo("2023/1");
        turma1.addAluno(aluno1);
        turma1.addAluno(aluno2);

        Turma turma2 = new Turma(2, "Turma B");
        turma2.setPeriodo("2023/1");
        turma2.addAluno(aluno3);
        turma2.addAluno(aluno1);
        

        System.out.println("\nAlunos cadastrados:");
        System.out.println("Aluno 1: " + aluno1.getNome());
        System.out.println("Aluno 2: " + aluno2.getNome());
        System.out.println("Aluno 3: " + aluno3.getNome());
        
        System.out.println("\nTurmas cadastradas:");
        System.out.println("Turma 1: " + turma1.getNomeTurma());
        System.out.println("Turma 2: " + turma2.getNomeTurma());
        
        if(aluno1.getNome() != ""){
        System.out.println("\nAluno encontrado");
        }
        else{
        System.out.println("Aluno não encontrado");
                }
        
        if(aluno2.getNome() != ""){
        System.out.println("Aluno encontrado");
        }
        else{
        System.out.println("Aluno não encontrado");
        }
        
        if(aluno3.getNome() != ""){
        System.out.println("Aluno encontrado");
        }
        else{
        System.out.println("Aluno não encontrado");
                }
    }
}
