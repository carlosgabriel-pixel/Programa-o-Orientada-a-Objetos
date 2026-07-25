import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LivroTest {

    @Test
    public void testCriacaoEEttersLivro() {
        // Instâncias especificadas nas regras da atividade:
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", false);

        // Testes de verificação para o livro1 (Disponível)
        assertEquals("Java Basico", livro1.getTitulo());
        assertEquals(autor, livro1.getAutor());
        assertEquals("tecnologia", livro1.getCategoria());
        assertTrue(livro1.isDisponivel());

        // Testes de verificação para o livro2 (Indisponível)
        assertEquals("Java Avançado", livro2.getTitulo());
        assertFalse(livro2.isDisponivel());
    }

    @Test
    public void testSettersLivro() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia", true);

        // Alterando os valores via Setters
        livro.setTitulo("Algoritmos");
        livro.setCategoria("Programação");
        livro.setDisponivel(false);

        // Asserções para validar as alterações
        assertEquals("Algoritmos", livro.getTitulo());
        assertEquals("Programação", livro.getCategoria());
        assertFalse(livro.isDisponivel());
    }
}