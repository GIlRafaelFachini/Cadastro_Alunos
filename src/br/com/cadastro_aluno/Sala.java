package br.com.cadastro_aluno;

import java.util.ArrayList;

public class Sala {
    ArrayList<Aluno> listaDeAlunos;

    public Sala() {
        this.listaDeAlunos = new ArrayList<> ();
    }

    public void insereAluno(Aluno novoAluno){
        novoAluno.calculaNotaAluno ();
        listaDeAlunos.add (novoAluno);
    }
    public void listarAlunos(){
        System.out.println ("Lista de alunos:");
        for (Aluno alunoNaLista : listaDeAlunos){ // pra cada aluno a dentro da lista de alunos.
            alunoNaLista.listar ();
        }
    }

    public void listarSituacoes(){
        System.out.println ("Situações:");
        for (Aluno alunoNaLista : listaDeAlunos){ // pra cada aluno a dentro da lista de alunos.
            alunoNaLista.mostraSituacaoAluno ();
        }

    }

}
