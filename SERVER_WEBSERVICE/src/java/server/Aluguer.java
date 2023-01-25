package server;

/**
 *
 * @author patri
 */
public class Aluguer {
    
    private int id_associado;
    private int id_disco;
    private String data_aluguer;
    private String data_max_devolucao;
    
    
    // setters
    
    public void setIdAssociado(int id_associado) {
        this.id_associado = id_associado;
    }

    public void setIdDisco(int id_disco) {
        this.id_disco = id_disco;
    }

    public void setDataAluguer(String data_aluguer) {
        this.data_aluguer = data_aluguer;
    }

    public void setDataMaxDevolucao(String data_max_devolucao) {
        this.data_max_devolucao = data_max_devolucao;
    }

    // getters

    public int getIdAssociado() {
        return id_associado;
    }

    public int getIdDisco() {
        return id_disco;
    }

    public String getDataAluguer() {
        return data_aluguer;
    }

    public String getDataMaxDevolucao() {
        return data_max_devolucao;
    }


}
