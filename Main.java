import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Usuario usuario = new Usuario("Renan", "1234");

        String nomeDigitado;
        String senhaDigitado;

        //repete até o usuario acertar o nome e a senha
        do {
            System.out.println("Digite o nome: ");
            nomeDigitado = scan.nextLine();

            System.out.println("Digite a senha");
            senhaDigitado = scan.nextLine();

            if (!usuario.login(nomeDigitado, senhaDigitado)) {
                System.out.println("Nome ou senha incorretos!\n");
            }
        } while (!usuario.login(nomeDigitado, senhaDigitado));

        System.out.println("Acesso liberado!/n");


        ArrayList<String> nomes = new ArrayList<>(); // lista

        int opcao;
        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1 - Cadastrar nome");
            System.out.println("2 - Mostrar nomes");
            System.out.println("3 - Sair");

            opcao = scan.nextInt();
            scan.nextLine(); // limpa buffer

            switch (opcao) {
                case 1:
                String nome;
                    do {
                        System.out.println("Digite seu nome: ");
                        nome = scan.nextLine();

                        if (nome.trim().length() < 3) {
                            System.out.println("Nome invalido!");
                        }
                    } while (nome.trim().length() < 3);

                    nomes.add(nome); // salva na lista
                    System.out.println("Nome Cadastrado!");
                    break;

                case 2:
                    if (nomes.isEmpty()) {
                        System.out.println("Nenhum nome cadastrado.");
                    } else {
                        System.out.println("Lista de nomes:");
                        for (String n : nomes) {
                            System.out.println(n);
                        }
                    }
                    break;


            }
        } while (opcao !=3);

    }
}
