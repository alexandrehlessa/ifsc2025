public class MercadoParceiro {
    private int MercadoParceiroId;
    private String MercadoParceiroRazaoSocial;
    private String MercadoParceiroCnpj;
    private String MercadoParceiroCEP;
    private String MercadoParceiroDominio;

    public MercadoParceiro(int mercadoParceiroId, String mercadoParceiroRazaoSocial, String mercadoParceiroCnpj, String mercadoParceiroCEP, String mercadoParceiroDominio) {
        MercadoParceiroId = mercadoParceiroId;
        MercadoParceiroRazaoSocial = mercadoParceiroRazaoSocial;
        MercadoParceiroCnpj = mercadoParceiroCnpj;
        MercadoParceiroCEP = mercadoParceiroCEP;
        MercadoParceiroDominio = mercadoParceiroDominio;
    }

    public int getMercadoParceiroId() {
        return MercadoParceiroId;
    }

    public String getMercadoParceiroRazaoSocial() {
        return MercadoParceiroRazaoSocial;
    }

    public String getMercadoParceiroCnpj() {
        return MercadoParceiroCnpj;
    }

    public String getMercadoParceiroCEP() {
        return MercadoParceiroCEP;
    }

    public String getMercadoParceiroDominio() {
        return MercadoParceiroDominio;
    }


    public void setMercadoParceiroCEP(String mercadoParceiroCEP) {
        MercadoParceiroCEP = mercadoParceiroCEP;
    }

    public void setMercadoParceiroDominio(String mercadoParceiroDominio) {
        MercadoParceiroDominio = mercadoParceiroDominio;
    }
}
