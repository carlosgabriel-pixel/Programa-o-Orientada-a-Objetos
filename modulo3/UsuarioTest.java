import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    public void testCriacaoEGettersUsuario() {
        Usuario usuario = new Usuario("Gabriel", 21);

        assertEquals("Gabriel", usuario.getNome());
        assertEquals(21, usuario.getIdade());
    }

    @Test
    public void testSettersUsuario() {
        Usuario usuario = new Usuario("Gabriel", 21);

        usuario.setNome("Lucas");
        usuario.setIdade(25);

        assertEquals("Lucas", usuario.getNome());
        assertEquals(25, usuario.getIdade());
    }
}