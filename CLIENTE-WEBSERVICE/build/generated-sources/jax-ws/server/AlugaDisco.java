
package server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de alugaDisco complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="alugaDisco"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_associado" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id_disco" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="data_aluguer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="data_max_devolucao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alugaDisco", propOrder = {
    "idAssociado",
    "idDisco",
    "dataAluguer",
    "dataMaxDevolucao"
})
public class AlugaDisco {

    @XmlElement(name = "id_associado")
    protected int idAssociado;
    @XmlElement(name = "id_disco")
    protected int idDisco;
    @XmlElement(name = "data_aluguer")
    protected String dataAluguer;
    @XmlElement(name = "data_max_devolucao")
    protected String dataMaxDevolucao;

    /**
     * Obtém o valor da propriedade idAssociado.
     * 
     */
    public int getIdAssociado() {
        return idAssociado;
    }

    /**
     * Define o valor da propriedade idAssociado.
     * 
     */
    public void setIdAssociado(int value) {
        this.idAssociado = value;
    }

    /**
     * Obtém o valor da propriedade idDisco.
     * 
     */
    public int getIdDisco() {
        return idDisco;
    }

    /**
     * Define o valor da propriedade idDisco.
     * 
     */
    public void setIdDisco(int value) {
        this.idDisco = value;
    }

    /**
     * Obtém o valor da propriedade dataAluguer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAluguer() {
        return dataAluguer;
    }

    /**
     * Define o valor da propriedade dataAluguer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAluguer(String value) {
        this.dataAluguer = value;
    }

    /**
     * Obtém o valor da propriedade dataMaxDevolucao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataMaxDevolucao() {
        return dataMaxDevolucao;
    }

    /**
     * Define o valor da propriedade dataMaxDevolucao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataMaxDevolucao(String value) {
        this.dataMaxDevolucao = value;
    }

}
