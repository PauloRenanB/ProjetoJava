import java.util.ArrayList;

public class CadastroDoador {
    private ArrayList<Doador> doadores = new ArrayList<Doador>();

    public void cadastrarDoador(Doador d) {
        String idUnico = GeradordeID.gerarID();
        d.setCadastro(idUnico);
        doadores.add(d);
        System.out.println("Doador cadastrado!");
    }

    public void listarDoador(){
        for (Doador d : doadores) {
            System.out.printf("Nome: %s. Idade: %d. ID do Cadastro: %s%n", d.getNome(),d.getIdade(), d.getCadastro());
        }
    }
}
