public class Autor {
    private String nome;
    private PublicavelInterface estrategiaPublicacao;

    public Autor(String nome) {
        this.nome = nome;
    }

    public void setEstrategiaPublicacao(PublicavelInterface estrategiaPublicacao) {
        this.estrategiaPublicacao = estrategiaPublicacao;
    }

    public void publicar() {
        if (estrategiaPublicacao == null) {
            throw new IllegalStateException("Nenhuma estratégia de publicação foi definida.");
        }
        estrategiaPublicacao.publicar();
    }

    public String getNome() {
        return nome;
    }
}