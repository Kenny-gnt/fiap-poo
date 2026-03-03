package br.com.fiapride.main;

public class Notebook {
    
    public String marca;
    public String cor;
    public int bateria;

    public Notebook(String marca, String cor) {
        this.marca = marca;
        this.cor = cor;
        this.bateria = 50;
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

        this.bateria += valor;
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

        this.bateria -= tempoUso;
        System.out.println("Notebook utilizado. Bateria restante: " + this.bateria + "%");
    }
}
