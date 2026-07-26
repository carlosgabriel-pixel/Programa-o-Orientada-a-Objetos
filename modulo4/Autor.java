public class Autor {
    private String nome;
    private boolean ehUsuario; // true se for Usuário, false se for Autor Tradicional

    // Construtor padrão
    public Autor(String nome, boolean ehUsuario) {
        this.nome = nome;
        this.ehUsuario = ehUsuario;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isEhUsuario() {
        return ehUsuario;
    }

    public void setEhUsuario(boolean ehUsuario) {
        this.ehUsuario = ehUsuario;
    }
}