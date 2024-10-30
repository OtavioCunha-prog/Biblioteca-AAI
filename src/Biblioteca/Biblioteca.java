package Biblioteca;

import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {

        // Criação de objetos Livro com título, autor e preço
        Livro livro1 = new Livro("Avaliação De Segurança De Redes", "Chris McNab", 45.00);
        Livro livro2 = new Livro("Análise de Tráfego em Redes TCP/IP: Utilize Tcpdump na Análise de Tráfegos em Qualquer Sistema Operacional", "João Eriberto Mota Filho", 75.00);
        Livro livro3 = new Livro("Arquitetura De Redes De Computadores", "Maia", 120.00);

        // Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira seu nome
        System.out.print("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        // Criação de um objeto Cliente com o nome fornecido pelo usuário
        Cliente cliente = new Cliente(nomeCliente);

        // MOstrar os livros para escolher
        System.out.println("Livros disponíveis:");
        System.out.println("1 - " + livro1.getTitulo() + " por " + livro1.getAutor() + " - R$ " + livro1.getPreco());
        System.out.println("2 - " + livro2.getTitulo() + " por " + livro2.getAutor() + " - R$ " + livro2.getPreco());
        System.out.println("3 - " + livro3.getTitulo() + " por " + livro3.getAutor() + " - R$ " + livro3.getPreco());

        // Pergunta ao usuário qual livro ele deseja comprar
        System.out.print("Escolha o número do livro que deseja comprar (1, 2 ou 3): ");
        int opcao = scanner.nextInt();

        // Verifica a escolha do usuário e realiza a compra do livro selecionado
        switch (opcao) {
            case 1:
                cliente.comprarLivro(livro1);
                break;
            case 2:
                cliente.comprarLivro(livro2);
                break;
            case 3:
                cliente.comprarLivro(livro3);
                break;
            default:
                System.out.println("Opção inválida. Nenhuma compra realizada.");
                break;
        }

        // Fecha o scanner 
        scanner.close();
    }
}
