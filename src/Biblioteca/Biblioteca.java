package Biblioteca;

public class Biblioteca {


    public static void main(String[] args) {

// Criação de objetos Livro com título, autor e preço

        Livro livro1 = new Livro("Avaliação De Segurança De Redes", "Chris McNab", 45.00);
        Livro livro2 = new Livro("Análise de Tráfego em Redes TCP/IP: Utilize Tcpdump na Análise de Tráfegos em Qualquer Sistema Operacional", "João Eriberto Mota Filho", 75.00);
        Livro livro3 = new Livro("Arquitetura De Redes De Computadores", "Maia", 120.00);

        Cliente cliente = new Cliente("Otávio Alvernaz");

// Cliente realiza a compra de cada livro, um por vez

        cliente.comprarLivro(livro1);
        cliente.comprarLivro(livro2);
        cliente.comprarLivro(livro3);
    }

}
