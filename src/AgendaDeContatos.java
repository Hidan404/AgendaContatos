import java.util.HashSet;
import java.util.Set;

public class AgendaDeContatos {
    private Set<Convidados> contatos;

    public AgendaDeContatos(Set<Convidados> contatos) {
        this.contatos = new HashSet<>();
    }


    public void adcionarContato(String nome, int numeroTelefone){
        contatos.add(new Convidados(nome, numeroTelefone));
    }

    public void exibirContatos(){
        System.out.println(contatos);
    }

    public Set<Convidados> pesquisarPornome(String nome){
        Set<Convidados> contatoPorNome = new HashSet<>();
        for (Convidados convidados : contatos) {
            if(convidados.getNome().startsWith(nome)){
                contatoPorNome.add(convidados);
            }
        }
        return contatoPorNome;
    }

    public Convidados atualizarnumeroContato(String nome, int numeroTelefone){
        Convidados contatoatualizar = null;
        for (Convidados convidados : contatos) {
            if(convidados.getNome().equalsIgnoreCase(nome)){
                convidados.setNumeroTelefone(numeroTelefone);
                contatoatualizar = convidados;
                break;
            }
        }
        return contatoatualizar;
    }
}
