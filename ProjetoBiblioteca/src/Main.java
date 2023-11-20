import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        Pessoa funcionario1 = new Func_Bibliotecario(20,"Ana Paula Rodrigues", "7bdd3d56-dcb6-4916-b3b4-1fd8b86894ee");
        Pessoa funcionario2 = new Func_Bibliotecario(48,"José Barreto da Silva", "9d59849a-fd1c-4e20-b638-60a19b9b645f");
        CadastroDoador cd = new CadastroDoador();
        CadastroLeitor cl = new CadastroLeitor();
        System.out.println("Bem-vindo ao sistema de biblioteca.");
        System.out.println("------------------------------------");

//Responsável pelo LOOP do código
        do {

            Doador doador1 = new Doador();
            Leitor leitor1 = new Leitor();

            System.out.println("Cadastro iniciado");
            System.out.println("------------------------------------");
            System.out.println("Caso seja um doador digite 0");
            System.out.println("Caso seja um leitor digite 1");


            int escolha = sc.nextInt();
            switch (escolha) {
//Responsável por cadastrar o Doador
                case 0:
                    doador1.entrar();
                    System.out.println("------------------------------------");
                    System.out.println("Digite seu nome: ");
                    sc.nextLine();
                    doador1.setNome(sc.nextLine());
                    System.out.println("Digite sua idade: ");
                    doador1.setIdade(sc.nextInt());
                    System.out.println("------------------------------------");

                    cd.cadastrarDoador(doador1);
                    System.out.println("------------------------------------");
                    System.out.println("Doadores cadastrados: ");
                    cd.listarDoador();
                    System.out.println("------------------------------------");
                    break;
//Responsável por cadastrar o Leitor
                case 1:
                    leitor1.entrar();
                    System.out.println("------------------------------------");
                    System.out.println("Digite seu nome: ");
                    sc.nextLine();
                    leitor1.setNome(sc.nextLine());
                    System.out.println("Digite sua idade: ");
                    leitor1.setIdade(sc.nextInt());
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
//Responsável por fazer a doação dos livros para o Doador
            if (escolha == 0) {
                System.out.println("Quantos livros deseja doar?");
                doador1.setLivrosDoados(sc.nextInt());
                if (doador1.getLivrosDoados() != 0){
                    System.out.println("Você ajudou a educação e cultura doando: " + doador1.getLivrosDoados() + " Livros!");
                } else {
                    System.out.println("Obrigado por se cadastrar na biblioteca.");
                }
                System.out.println("------------------------------------");
//Responsável por fazer o empréstimo dos livros para o Doador
                System.out.println("Deseja pegar algum livro por empréstimo? \n Digite 1 para Sim \n Digite 2 para Não");
                int y = sc.nextInt();
                if (y == 1){
                    System.out.println("Quantos livros deseja pegar emprestado?");
                    doador1.setLivrosEmprestados(sc.nextInt());
                    if (doador1.getLivrosEmprestados() != 0){
                        System.out.println("Muito bem! você tem 10 dias para devolver os: " + doador1.getLivrosEmprestados() + " livros que pegou por empréstimo! Aproveite.");
                    } else {
                        System.out.println("Obrigado por doar para a biblioteca.");
                    }
                } else {
                    System.out.println("Agradecemos por sua doação!");
                }
                System.out.println("------------------------------------");
                doador1.sair();
//Responsável por fazer o empréstimo dos livros para o Leitor
            } else if (escolha == 1) {
                System.out.println("Quantos livros deseja pegar emprestado?");
                leitor1.setLivrosEmprestados(sc.nextInt());
                if (leitor1.getLivrosEmprestados() != 0){
                    System.out.println("Muito bem! você tem 10 dias para devolver os: " + leitor1.getLivrosEmprestados() + " livros que pegou por empréstimo! Aproveite.");

                } else {
                    System.out.println("Obrigado por cadastrar-se na biblioteca.");
                }
                System.out.println("------------------------------------");
                leitor1.sair();
            }
//Responsável por dar continuidade ao programa
            System.out.println("Se deseja continuar com o programa digite 0 e para encerrar digite qualquer outro número.");
            x = sc.nextInt();
        } while (x == 0);
        System.out.println("Programa encerrado.");




    }
}