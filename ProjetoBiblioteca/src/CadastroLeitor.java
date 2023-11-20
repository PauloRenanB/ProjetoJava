import java.util.ArrayList;

public class CadastroLeitor {
    private ArrayList<Leitor> leitores = new ArrayList<Leitor>();

    public void cadastrarLeitor(Leitor l) {
        leitores.add(l);
        System.out.println("Leitor cadastrado!");
    }

    public void listar() {
        for (Leitor l : leitores) {
            System.out.printf("Nome: %s. Idade: %d. Cadastro: %d%n",l.getNome(),l.getIdade(), l.getCadastro());
        }
    }
}
