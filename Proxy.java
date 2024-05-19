public class Proxy implements Assunto {
    private AssuntoReal assuntoReal;
    private String usuarioAutorizado;
    private String nivelAcesso;

    public Proxy(String usuario, String nivelAcesso) {
        this.usuarioAutorizado = usuario;
        this.nivelAcesso = nivelAcesso;
    }

    @Override
    public void imprimir(String mensagem) {
        if (estaAutorizado()) {
            if (assuntoReal == null) {
                assuntoReal = new AssuntoReal();
            }
            assuntoReal.imprimir(mensagem);
        } else {
            System.out.println("Proxy: Usuário não autorizado. Acesso negado.");
        }
    }

    @Override
    public int obterContagemAcessos() {
        if (assuntoReal == null) {
            return 0;
        }
        return assuntoReal.obterContagemAcessos();
    }

    private boolean estaAutorizado() {
        return "admin".equals(nivelAcesso) || "usuario".equals(nivelAcesso);
    }
}
