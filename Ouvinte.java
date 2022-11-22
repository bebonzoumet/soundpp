public class Ouvinte {
    private String nome;
    private String cpf;
    private String fk_plano_assinatura;

    public Ouvinte(String nome, String cpf, String fk_plano_assinatura) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return cpf;
    }
    
    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    public String getFKplanoAssinatura() {
        return fk_plano_assinatura;
    }
    
    public void getFKplanoAssinatura(String fk_plano_assinatura){
        this.fk_plano_assinatura = fk_plano_assinatura;
    }

}