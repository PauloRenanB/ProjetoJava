public class Doador extends Pessoa implements Emprestado{

    public int getLivrosDoados() {
        return livrosDoados;
    }

    public void setLivrosDoados(int livrosDoados) {
        this.livrosDoados = livrosDoados;
    }

    private int livrosDoados;

    public int getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(int livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    private int livrosEmprestados;

    @Override
    public void entrar() {
        System.out.println("Doador entrou na biblioteca.");
    }

    @Override
    public void sair() {
        System.out.println("Doador saiu da biblioteca.");
    }

    @Override
    public void pegar_emprestado() {
        System.out.println("O cliente pegou um livro emprestado.");
    }
}
