package introducao.aula_80_81.dominio;

public enum TipoCliente {
    PESSOA_FISCA(1, "Pessoa física"),
    PESSOA_JURIDICA(2, "Pessoa jurídica");
    private int VALOR;
    public String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public int getValor() {
        return VALOR;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
