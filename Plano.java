

public class Plano {
    private String titulo;
    private String descricao;
    private double cobranca;
    private int playlists_disponivel;
    private boolean download;
    private int download_disponivel;
    private boolean anuncios;
    
    Plano(String titulo, String descricao, double cobranca, int playlists_disponivel, boolean download, int download_disponivel, boolean anuncios) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cobranca = cobranca;
        this.playlists_disponivel = playlists_disponivel;
        this.download = download;
        this.download_disponivel = download_disponivel;
        this.anuncios = anuncios;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getCobranca() {
        return cobranca;
    }

    public void setCobranca(double cobranca) {
        this.cobranca = cobranca;
    }

    public int getPlaylists_disponivel() {
        return playlists_disponivel;
    }

    public void setPlaylists_disponivel(int playlists_disponivel) {
        this.playlists_disponivel = playlists_disponivel;
    }

    public boolean isDownload() {
        return download;
    }

    public void setDownload(boolean download) {
        this.download = download;
    }

    public int getDownload_disponivel() {
        return download_disponivel;
    }

    public void setDownload_disponivel(int download_disponivel) {
        this.download_disponivel = download_disponivel;
    }

    public boolean isAnuncios() {
        return anuncios;
    }

    public void setAnuncios(boolean anuncios) {
        this.anuncios = anuncios;
    }

}
