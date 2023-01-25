
package server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de pesquisaDiscoEstiloMusica complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="pesquisaDiscoEstiloMusica"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="estilo_musica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pesquisaDiscoEstiloMusica", propOrder = {
    "estiloMusica"
})
public class PesquisaDiscoEstiloMusica {

    @XmlElement(name = "estilo_musica")
    protected String estiloMusica;

    /**
     * Obtém o valor da propriedade estiloMusica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstiloMusica() {
        return estiloMusica;
    }

    /**
     * Define o valor da propriedade estiloMusica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstiloMusica(String value) {
        this.estiloMusica = value;
    }

}
