public class Administrador {
    private int administradorId;
    private String primeiroNome;
    private String emailEmpresa;
    private String senha;

    public Administrador(int administradorId, String primeiroNome, String emailEmpresa, String senha) {
        this.administradorId = administradorId;
        this.primeiroNome = primeiroNome;
        this.emailEmpresa = emailEmpresa;
        this.senha = senha;
    }

    public int getAdministradorId() {
        return administradorId;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getEmailEmpresa() {
        return emailEmpresa;
    }

    public String getSenha() {
        return senha;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
