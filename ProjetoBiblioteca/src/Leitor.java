public class Leitor extends Pessoa implements Emprestado{

    public int getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(int livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    private int livrosEmprestados;
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
