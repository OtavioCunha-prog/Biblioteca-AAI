package Biblioteca;

public class Biblioteca {


    public static void main(String[] args) {

// Criação de objetos Livro com título, autor e preço

        Livro livro1 = new Livro("Java: Como Programar", "Deitel & Deitel", 45.00);
        Livro livro2 = new Livro("Clean Code", "Robert C. Martin", 75.00);
        Livro livro3 = new Livro("Effective Java", "Joshua Bloch", 120.00);

        Cliente cliente = new Cliente("João Silva");

// Cliente realiza a compra de cada livro, um por vez

        cliente.comprarLivro(livro1);
        cliente.comprarLivro(livro2);
        cliente.comprarLivro(livro3);
    }

}
