public class Main {
    public static void main(String[] args) {
        // Criando Autor e Livro
        Autor autor = new Autor("Jessica Felix", "Brasileira");
        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia");

        // Criando Usuário
        Usuario usuario = new Usuario("Lucas Rafael", 25);

        // Criando Empréstimo
        Emprestimo emprestimo = new Emprestimo(livro, usuario);

        // Imprimindo a saída exata do enunciado
        livro.validarDisponibilidade();
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome());
        System.out.println("Genero: " + livro.getGenero());
        System.out.println("Usuario: " + emprestimo.getUsuario().getNome());
        System.out.println("Idade: " + emprestimo.getUsuario().getIdade());
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data de Devolucao: " + emprestimo.getDataDevolucao());
    }
}