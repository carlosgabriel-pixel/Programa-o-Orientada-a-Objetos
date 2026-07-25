import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {

    @Test
    public void testCriacaoEGettersAutor() {
        Autor autor = new Autor("Jess", "Brasileira");

        assertEquals("Jess", autor.getNome());
        assertEquals("Brasileira", autor.getNacionalidade());
    }

    @Test
    public void testSettersAutor() {
        Autor autor = new Autor("Jess", "Brasileira");

        autor.setNome("Alan Turing");
        autor.setNacionalidade("Inglês");

        assertEquals("Alan Turing", autor.getNome());
        assertEquals("Inglês", autor.getNacionalidade());
    }
}