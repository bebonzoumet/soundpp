import java.sql.Date;
import java.util.ArrayList;

public class Playlist {
    private String nome;
    private Date cricao;
    private ArrayList<Obra> obras;
    private String descricao;
    private boolean download;
    private Usuario criador;

    public Playlist(String nome, Date cricao, ArrayList<Obra> obras, String descricao, boolean download,
            Usuario criador) {
        this.nome = nome;
        this.cricao = cricao;
        this.obras = obras;
        this.descricao = descricao;
        this.download = download;
        this.criador = criador;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getCricao() {
        return cricao;
    }
    public void setCricao(Date cricao) {
        this.cricao = cricao;
    }
    public ArrayList<Obra> getObras() {
        return obras;
    }

    public void addObra(Obra obra) {
        this.obras.add(obra);
    }

    public void setObras(ArrayList<Obra> obras) {
        this.obras = obras;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public boolean isDownload() {
        return download;
    }
    public void setDownload(boolean download) {
        this.download = download;
    }
    public Usuario getCriador() {
        return criador;
    }
    public void setCriador(Usuario criador) {
        this.criador = criador;
    }

}
