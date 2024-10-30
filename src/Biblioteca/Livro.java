package Biblioteca;

public class Livro {


    private String titulo;
    private String autor;
    private double preco;

// Construtor da classe Livro

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }
//obter titulo,autor e preço do livro
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

}
