public class contato {
    private int numero,ddd;
    private String tipo;

    public contato(int numero, int ddd, String tipo) {
        this.numero = numero;
        this.ddd = ddd;
        this.tipo = tipo;
    }
    
    public contato() {
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getDdd() {
        return ddd;
    }
    public void setDdd(int ddd) {
        this.ddd = ddd;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}
