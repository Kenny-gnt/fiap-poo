package br.com.fiapride.main;

public class Notebook {

    private String marca;
    private String cor;
    private int bateria;

    public Notebook() {
        this.bateria = 50;
    }

    public Notebook(String marca, String cor) {
        this();
        this.setMarca(marca);
        this.setCor(cor);
    }

    public Notebook(String marca, String cor, int bateria) {
        this.setMarca(marca);
        this.setCor(cor);
        this.setBateria(bateria);
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getBateria() {
        return this.bateria;
    }

    public void setBateria(int bateria) {
        if (bateria < 0 || bateria > 100) {
            System.out.println("Erro: A bateria deve estar entre 0% e 100%.");
            return;
        }
        this.bateria = bateria;
    }

    public void carregarBateria(int valor) {

        if (valor <= 0) {
            System.out.println("Erro: valor inválido.");
            return;
        }

        if (this.bateria + valor > 100) {
            System.out.println("Erro: bateria não pode passar de 100%");
            return;
        }

        this.setBateria(this.bateria + valor);
        System.out.println("Bateria atual: " + this.bateria);
    }

    public void usarNotebook(int tempoUso) {

        if (tempoUso <= 0) {
            System.out.println("Erro: tempo inválido.");
            return;
        }

        if (this.bateria - tempoUso < 0) {
            System.out.println("Erro: bateria insuficiente.");
            return;
        }

        this.setBateria(this.bateria - tempoUso);
        System.out.println("Bateria restante: " + this.bateria);
    }
}