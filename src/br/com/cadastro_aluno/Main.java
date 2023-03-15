package br.com.cadastro_aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opc;

        Scanner teclado;
        teclado = new Scanner (System.in);

        String nome;
        String cpf;
        float nota = 0;
        int qtdNotas;
        Aluno novoAluno = new Aluno ();
        Sala novaSala = new Sala ();


        do {
            System.out.println ("------------------------------------");
            System.out.println ("Menu");
            System.out.println ("------------------------------------");
            System.out.println ("Escolha as opções");
            System.out.println (" 1 - Inserir Aluno");
            System.out.println (" 2 - Listar Aluno");
            System.out.println (" 3 - Situações");
            System.out.println (" 0 - Sair");
            System.out.println ("------------------------------------");
            opc = teclado.nextInt ();
            teclado.nextLine ();

            switch (opc) {

                case 1:
                    System.out.println ("Opção número 1");
                    System.out.println ("Digite o nome do aluno");
                    nome = teclado.nextLine ();
                    System.out.println ("Digite o CPF do aluno");
                    cpf = teclado.nextLine ();
                    System.out.println ("Digite quantidade de notas do aluno");
                    qtdNotas = teclado.nextInt ();
                    novoAluno = new Aluno (nome,cpf);


                    for(int i = 0 ; i < qtdNotas ; i++){
                        System.out.println ("Nota" + (i + 1));
                        nota = teclado.nextFloat ();
                        novoAluno.insereNotas (nota);
                    }
                    novaSala.insereAluno (novoAluno);
                    break;
                case 2:
                    System.out.println ("Opção número 2");
                    novaSala.listarAlunos ();
                    break;
                case 3:
                    System.out.println ("Opção número 3");
                    novaSala.listarSituacoes ();
                    break;
                case 0:
                    System.out.println ("Opção número 0");
                    System.out.println ("Saindo....");
                    break;
                default:
                    System.out.println ("Opção inválida");
            }

        } while (opc != 0);
    }
}
