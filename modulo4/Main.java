public class Main {
    public static void main(String[] args) {
        // 1. Criando autor atualizado
        Autor autor = new Autor("Carlos Oliveira", true);

        // 3. Criando objeto Artigo com os parâmetros solicitados
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);

        // Exibição dos dados no console
        System.out.println("Título: " + artigo.getTitulo());
        System.out.println("Autor: " + artigo.getAutor().getNome() + " (É usuário: " + artigo.getAutor().isEhUsuario() + ")");
        System.out.println("Gênero: " + artigo.getGenero());
        System.out.println("Publicado: " + artigo.isPublicado());
    }
}

