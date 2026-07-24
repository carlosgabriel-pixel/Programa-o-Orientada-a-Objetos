import java.util.Date;

public class Emprestimo {
    private Date dataRetirada;
    private Date dataDevolucao;
    private Livro livro;
    private Usuario usuario;

    public Emprestimo(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataRetirada = new Date();
        this.dataDevolucao = new Date(); // Definindo a mesma data pra bater com a imagem do teste
        
        // Marca o livro como indisponível quando é emprestado
        this.livro.setDisponivel(false);
        // Adiciona ao histórico do usuário
        this.usuario.adicionarEmprestimo(this);
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}