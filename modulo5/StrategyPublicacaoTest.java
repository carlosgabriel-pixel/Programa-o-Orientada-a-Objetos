import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StrategyPublicacaoTest {

    @Test
    void devePublicarUsandoEstrategiaLivro() {
        Autor autor = new Autor("Machado de Assis");
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro());

        assertDoesNotThrow(() -> autor.publicar());
    }

    @Test
    void devePublicarUsandoEstrategiaArtigo() {
        Autor autor = new Autor("Carlos Oliveira");
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo());

        assertDoesNotThrow(() -> autor.publicar());
    }

    @Test
    void deveLancarExcecaoQuandoEstrategiaNaoForDefinida() {
        Autor autor = new Autor("Autor Sem Estratégia");

        assertThrows(IllegalStateException.class, () -> autor.publicar());
    }
}