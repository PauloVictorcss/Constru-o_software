package livros;

public class Livro {

    private String titulo;
    private String autor;
    private String anoPublicacao;

    public Livro(String titulo, String autor, String anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void informacaoLivro(){
        System.out.println("Titulo: " + titulo + "\nautor: " + autor + "\nAno Publicação: " + anoPublicacao);
    }


}

package livros;

public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro("Java", "Paulo", "12/05/2003");

        livro.informacaoLivro();
    }
}
