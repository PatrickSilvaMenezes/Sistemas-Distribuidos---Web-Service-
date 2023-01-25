/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server;

/**
 *
 * @author patri
 */
public class Historico {
    
    private int id_associado;
    private int id_disco;
    private String data_aluguer;
    private String data_devolucao;
    
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

    public void setDataDevolucao(String data_devolucao) {
        this.data_devolucao = data_devolucao;
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

    public String getDataDevolucao() {
        return data_devolucao;
    }
    
    
}
