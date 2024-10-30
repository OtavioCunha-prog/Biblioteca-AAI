package Biblioteca;

public class Cliente {

    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void comprarLivro(Livro livro) {
        double precoOriginal = livro.getPreco();
        double desconto = calcularDesconto(precoOriginal);
        double precoFinal = precoOriginal - desconto;

        System.out.println("Comprovante de Compra:");
        System.out.println("Cliente: " + nome);
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Preço Original: R$ " + precoOriginal);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Preço Final: R$ " + precoFinal);
    }

    private double calcularDesconto(double preco) {
        if (preco <= 50) {
            return preco * 0.10;
        } else if (preco <= 100) {
            return preco * 0.15;
        } else {
            return preco * 0.20;
        }
    }

}
