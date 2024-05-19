public class Main {
        public static void main(String[] args) {
            Usuario usuarioAdmin = new Usuario("Alice", "admin");
            Usuario usuarioComum = new Usuario("Alana", "usuario");
            Usuario usuarioConvidado = new Usuario("Ana", "convidado");
    
            Assunto proxy1 = new Proxy(usuarioAdmin.getNome(), usuarioAdmin.getNivelAcesso());
            proxy1.imprimir("Olá do admin!");
            System.out.println("Contagem de acessos: " + proxy1.obterContagemAcessos());
    
            Assunto proxy2 = new Proxy(usuarioComum.getNome(), usuarioComum.getNivelAcesso());
            proxy2.imprimir("Olá do usuário!");
            System.out.println("Contagem de acessos: " + proxy2.obterContagemAcessos());
    
            Assunto proxy3 = new Proxy(usuarioConvidado.getNome(), usuarioConvidado.getNivelAcesso());
            proxy3.imprimir("Olá do convidado!");
            System.out.println("Contagem de acessos: " + proxy3.obterContagemAcessos());
        }
    
    
}
