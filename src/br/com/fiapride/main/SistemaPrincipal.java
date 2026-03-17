package br.com.fiapride.main;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Notebook notebook1 = new Notebook();
        notebook1.setMarca("Dell");
        notebook1.setCor("Preto");

        Notebook notebook2 = new Notebook("Samsung", "Prata");

        Notebook notebook3 = new Notebook("Lenovo", "Cinza", 80);

        notebook1.carregarBateria(20);
        notebook2.usarNotebook(10);
        notebook3.usarNotebook(30);

        System.out.println(notebook1.getMarca() + " " + notebook1.getBateria());
        System.out.println(notebook2.getMarca() + " " + notebook2.getBateria());
        System.out.println(notebook3.getMarca() + " " + notebook3.getBateria());
    }
}