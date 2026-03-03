package br.com.fiapride.main;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Notebook notebook1 = new Notebook("Dell", "Preto");
        System.out.println("Carregando notebook 1");
        notebook1.carregarBateria(30);

        Notebook notebook2 = new Notebook("Samsung", "Prata");
        System.out.println("Carregando notebook 2");
        notebook2.carregarBateria(20);

        System.out.println(" Sistema Notebook ");
        System.out.println("Notebook: " + notebook1.marca + " | Cor: " + notebook1.cor + " | Bateria: " + notebook1.bateria + "%");
        System.out.println("Notebook: " + notebook2.marca + " | Cor: " + notebook2.cor + " | Bateria: " + notebook2.bateria + "%");

        System.out.println("Usando notebook 1");
        notebook1.usarNotebook(40);

        System.out.println("Usando notebook 2");
        notebook2.usarNotebook(80);
    }
}