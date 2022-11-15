import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String plano;
    private ArrayList<Playlist> playlists;
    private ArrayList<Obra> obras;

    Usuario(String nome, String plano, ArrayList<Playlist> playlists, ArrayList<Obra> obras) {
        this.nome = nome;
        this.plano = plano;
        this.playlists = playlists;
        this.obras = obras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public void addPlaylist(Playlist playlist) {
        this.playlists.add(playlist);
    }

    public void setPlaylists(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
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


}
