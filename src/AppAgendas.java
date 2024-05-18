public class AppAgendas {
    public static void main(String[] args) {
        AgendaDeContatos contatos = new AgendaDeContatos(null);

        contatos.adcionarContato("Sabrina", 94947929);
        contatos.adcionarContato("Ronald", 94855252);

        contatos.exibirContatos();
        contatos.atualizarnumeroContato("Ronald",9788);
        contatos.exibirContatos();
       System.out.println( contatos.pesquisarPornome("Ronald"));
    }
}
