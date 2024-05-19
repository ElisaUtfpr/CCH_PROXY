public class Usuario {
    private String nome;
    private String nivelAcesso;

    public Usuario(String nome, String nivelAcesso) {
        this.nome = nome;
        this.nivelAcesso = nivelAcesso;
    }

    public String getNome() {
        return nome;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }
}
