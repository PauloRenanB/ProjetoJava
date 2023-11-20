import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        Pessoa funcionario1 = new Func_Bibliotecario(20,"Ana Paula Rodrigues", 0000001);
        Pessoa funcionario2 = new Func_Bibliotecario(48,"José Barreto da Silva", 0000002);
        CadastroDoador cd = new CadastroDoador();
        CadastroLeitor cl = new CadastroLeitor();

        System.out.println("Bem-vindo ao sistema de biblioteca.");
        System.out.println("------------------------------------");


        do {

            Doador doador1 = new Doador();
            Leitor leitor1 = new Leitor();

            System.out.println("Cadastro iniciado");
            System.out.println("------------------------------------");
            System.out.println("Caso seja um doador digite 0");
            System.out.println("Caso seja um leitor digite 1");


            int escolha = sc.nextInt();
            switch (escolha) {
                case 0:
                    System.out.println("Digite seu nome: ");
                    sc.nextLine();
                    doador1.setNome(sc.nextLine());
                    System.out.println("Digite sua idade: ");
                    doador1.setIdade(sc.nextInt());
                    System.out.println("Digite seu número de cadastro: ");
                    doador1.setCadastro(sc.nextInt());
                    System.out.println("------------------------------------");

                    cd.cadastrarDoador(doador1);
                    System.out.println("------------------------------------");
                    System.out.println("Doadores cadastrados: ");
                    cd.listarDoador();
                    System.out.println("------------------------------------");
                    break;

                case 1:
                    System.out.println("Digite seu nome: ");
                    sc.nextLine();
                    leitor1.setNome(sc.nextLine());
                    System.out.println("Digite sua idade: ");
                    leitor1.setIdade(sc.nextInt());
                    System.out.println("Digite seu número de cadastro: ");
                    leitor1.setCadastro(sc.nextInt());
                    System.out.println("------------------------------------");

                    cl.cadastrarLeitor(leitor1);
                    System.out.println("------------------------------------");
                    System.out.println("Leitores cadastrados: ");
                    cl.listar();
                    System.out.println("------------------------------------");
                    break;

                default:
                    System.out.println("Opção invalida!");
                    break;

            }



            System.out.println("Se continuar com o programa digite 0 e para encerrar digite qualquer outro número.");
            x = sc.nextInt();
        } while (x == 0);
        System.out.println("Programa encerrado.");




    }
}