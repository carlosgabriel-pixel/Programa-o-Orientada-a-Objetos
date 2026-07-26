import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {

    @Test
    void deveCriarAutorComoUsuario() {
        Autor autor = new Autor("Maria Silva", true);
        
        assertEquals("Maria Silva", autor.getNome());
        assertTrue(autor.isEhUsuario());
    }

    @Test
    void deveCriarAutorTradicional() {
        Autor autor = new Autor("Machado de Assis", false);
        
        assertEquals("Machado de Assis", autor.getNome());
        assertFalse(autor.isEhUsuario());
    }
}