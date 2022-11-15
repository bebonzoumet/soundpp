import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

public class Obra {
    private String titulo;
    private String letra;
    private Date lancamento;
    private ArrayList<Autor> autores = new ArrayList<>();
    private ArrayList<Produtor> produtores = new ArrayList<>();
    private String categoria;
    private Time duracao;
    private Boolean censura;

    public Obra (String titulo, String letra, Date lancamento, ArrayList<Autor> autores, ArrayList<Produtor> produtores, String categoria, Time duracao, Boolean censura) {
        this.titulo = titulo;
        this.letra = letra;
        this.lancamento = lancamento;
        this.autores = autores;
        this.produtores = produtores;
        this.categoria = categoria;
        this.duracao = duracao;
        this.censura = censura;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public Date getLancamento() {
        return lancamento;
    }

    public void setLancamento(Date lancamento) {
        this.lancamento = lancamento;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    public void addAutor(Autor autor) {
        this.autores.add(autor);
    }

    public ArrayList<Produtor> getProdutores() {
        return produtores;
    }

    public void addProdutor(Produtor produtor) {
        this.produtores.add(produtor);
    }

    public void setProdutores(ArrayList<Produtor> produtores) {
        this.produtores = produtores;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Time getDuracao() {
        return duracao;
    }

    public void setDuracao(Time duracao) {
        this.duracao = duracao;
    }

    public Boolean getCensura() {
        return censura;
    }

    public void setCensura(Boolean censura) {
        this.censura = censura;
    }

    public String toString () {

        return "Titulo: " + this.titulo + "\n" + "Letra: " + this.letra + "\n" + "Autor(es): " + arrayAutores() + "\n" + "Produtor(es): " + this.produtores + "\n" + "Categoria: " + this.categoria + "\n" + "Data lancamento: " + this.lancamento.toString() + "\n" + "Tempo duracao: " + this.duracao.toString() + "\n" + "Censura: " + this.censura.toString();
    }

    public String arrayAutores(){
        String autoresA[] = new String[autores.size()];
        for(Autor autor : this.autores){
            int i = 0;
            autoresA[i] = (autor.getNome());
            i++;     
        }
        return autoresA.toString();
    }

}
