package br.com.fiapride.main;

public class Notebook {
    
    private String marca;
    private String cor;
    private int bateria;

    public Notebook(String marca, String cor) {
        this.setMarca(marca);
        this.setCor(cor);
        this.setBateria(50);
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
            System.out.println("Erro: O valor da carga deve ser maior que zero.");
            return;
        }

        if (this.bateria + valor > 100) {
            System.out.println("Erro: A bateria não pode ultrapassar 100%.");
            return;
        }

        this.setBateria(this.bateria + valor);
        System.out.println("Notebook carregado. Bateria atual: " + this.bateria + "%");
    }

    public void usarNotebook(int tempoUso) {
        if (tempoUso <= 0) {
            System.out.println("Erro: Tempo de uso inválido.");
            return;
        }

        if (this.bateria <= 0) {
            System.out.println("Erro: Bateria insuficiente. Carregue o notebook.");
            return;
        }

        if (this.bateria - tempoUso < 0) {
            System.out.println("Erro: Bateria insuficiente para esse tempo de uso.");
            return;
        }

        this.setBateria(this.bateria - tempoUso);
        System.out.println("Notebook utilizado. Bateria restante: " + this.bateria + "%");
    }
}