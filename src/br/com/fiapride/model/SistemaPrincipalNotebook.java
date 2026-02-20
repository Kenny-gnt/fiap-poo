package br.com.fiapride.model;

public class SistemaPrincipalNotebook {

    public static void main(String[] args) {

        Notebook meuNotebook = new Notebook();
        meuNotebook.marca = "Acer";
        meuNotebook.cor = "Preto";
        meuNotebook.capacidade = 512;

        Notebook notebookDoProfessor = new Notebook();
        notebookDoProfessor.marca = "Dell";
        notebookDoProfessor.cor = "Prata";
        notebookDoProfessor.capacidade = 256;

        System.out.println("Meu notebook é da marca: " + meuNotebook.marca);
        System.out.println("O notebook do professor é da marca: " + notebookDoProfessor.marca);

    }
}