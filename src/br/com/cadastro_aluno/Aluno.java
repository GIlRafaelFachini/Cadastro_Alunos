package br.com.cadastro_aluno;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String cpf;
    private float total = 0;

    private String situacao = "Reprovado";

    ArrayList<Float>notasAlunos = new ArrayList<> ();


    public Aluno() {
    }

    public Aluno(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Float> getNotasAlunos() {
        return notasAlunos;
    }

    public void setNotasAlunos(ArrayList<Float> notasAlunos) {
        this.notasAlunos = notasAlunos;
    }

    public void listar(){
        System.out.println ("O nome do aluno é:" + this.nome);
        System.out.println ("O cpf do aluno é:" + this.cpf);

        for (int i = 0; i < notasAlunos.size (); i++) {
            System.out.println ("Resultado" + "Nota número " + (i+1) + " = " + this.notasAlunos.get (i));
        }
    }

    public void insereNotas(float nota){
        notasAlunos.add (nota);
    }

    public void mostraSituacaoAluno(){

        System.out.println ("Nome:" + this.nome);
        System.out.println ("Total:" + this.total);
        System.out.println ("Situações:" + this.situacao);
    }

    public void calculaNotaAluno(){
        for (float notaDaLista : notasAlunos){
            total =  total + notaDaLista;
        }
        if(total >= 70){
            this.situacao = "Aprovado";
        }else {
            this.situacao = "Reprovado";
        }
    }
}
