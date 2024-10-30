package Biblioteca;

public class Biblioteca {


    public static void main(String[] args) {

// Criação de objetos Livro com título, autor e preço

        Livro livro1 = new Livro("Entenda Algoritmos", "O Programador Pragmático: De Aprendiz a Mestre", 45.00);
        Livro livro2 = new Livro("Análise de Tráfego em Redes TCP/IP: Utilize Tcpdump na Análise de Tráfegos em Qualquer Sistema Operacional", "Avaliação De Segurança De Redes", 75.00);
        Livro livro3 = new Livro("Arquitetura De Redes De Computadores", "Redes De Computadores - Use A Cabeça!", 120.00);

        Cliente cliente = new Cliente("Otávio Alvernaz");

// Cliente realiza a compra de cada livro, um por vez

        cliente.comprarLivro(livro1);
        cliente.comprarLivro(livro2);
        cliente.comprarLivro(livro3);
    }

}
