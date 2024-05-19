public class AssuntoReal implements Assunto {
    private int contagemAcessos = 0;

    @Override
    public void imprimir(String mensagem) {
        contagemAcessos++;
        System.out.println("AssuntoReal: Imprimindo mensagem: " + mensagem);
    }

    @Override
    public int obterContagemAcessos() {
        return contagemAcessos;
    }
}
