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
        System.out.println("Notebook: " + notebook1.getMarca() + 
                           " | Cor: " + notebook1.getCor() + 
                           " | Bateria: " + notebook1.getBateria() + "%");

        System.out.println("Notebook: " + notebook2.getMarca() + 
                           " | Cor: " + notebook2.getCor() + 
                           " | Bateria: " + notebook2.getBateria() + "%");

        System.out.println("Usando notebook 1");
        notebook1.usarNotebook(40);

        System.out.println("Usando notebook 2");
        notebook2.usarNotebook(80);

        System.out.println("Tentando burlar o sistema...");
        notebook1.setBateria(150);
    }
}