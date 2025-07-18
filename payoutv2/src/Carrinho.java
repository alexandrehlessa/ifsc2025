public class Carrinho {
    private int numeroSerie;
    private int diaUltimaVistoria;
    private int mesUltimaVistoria;
    private int anoUltimaVistoria;
    private boolean funcionando;

    public Carrinho(int numeroSerie, int diaUltimaVistoria, int mesUltimaVistoria, int anoUltimaVistoria, boolean funcionando) {
        this.numeroSerie = numeroSerie;
        this.diaUltimaVistoria = diaUltimaVistoria;
        this.mesUltimaVistoria = mesUltimaVistoria;
        this.anoUltimaVistoria = anoUltimaVistoria;
        this.funcionando = funcionando;
    }


    public int getNumeroSerie() {
        return numeroSerie;
    }

    public int getDiaUltimaVistoria() {
        return diaUltimaVistoria;
    }

    public int getMesUltimaVistoria() {
        return mesUltimaVistoria;
    }

    public int getAnoUltimaVistoria() {
        return anoUltimaVistoria;
    }

    public boolean isFuncionando() {
        return funcionando;
    }

    public void setDiaUltimaVistoria(int diaUltimaVistoria) {
        this.diaUltimaVistoria = diaUltimaVistoria;
    }

    public void setMesUltimaVistoria(int mesUltimaVistoria) {
        this.mesUltimaVistoria = mesUltimaVistoria;
    }

    public void setAnoUltimaVistoria(int anoUltimaVistoria) {
        this.anoUltimaVistoria = anoUltimaVistoria;
    }

    public void setFuncionando(boolean funcionando) {
        this.funcionando = funcionando;
    }
}