import java.util.ArrayList;

public class CadastroLeitor {
    private ArrayList<Leitor> leitores = new ArrayList<Leitor>();

    public void cadastrarLeitor(Leitor l) {
        String idUnico = GeradordeID.gerarID();
        l.setCadastro(idUnico);
        leitores.add(l);
        System.out.println("Leitor cadastrado!");
    }

    public void listar() {
        for (Leitor l : leitores) {
            System.out.printf("Nome: %s. Idade: %d. ID do Cadastro: %s%n",l.getNome(),l.getIdade(), l.getCadastro());
        }
    }
}
