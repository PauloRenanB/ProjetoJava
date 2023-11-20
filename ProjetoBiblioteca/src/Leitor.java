public class Leitor extends Pessoa implements Emprestado{
    @Override
    public void entrar() {
        System.out.println("Leitor entrou na biblioteca.");
    }

    @Override
    public void sair() {
        System.out.println("Leitor saiu da biblioteca.");
    }

    @Override
    public void pegar_emprestado() {
        System.out.println("O cliente pegou um livro emprestado.");
    }
}
