
package server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de pesquisaDiscoGrupoMusico complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="pesquisaDiscoGrupoMusico"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="grupo_musico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pesquisaDiscoGrupoMusico", propOrder = {
    "grupoMusico"
})
public class PesquisaDiscoGrupoMusico {

    @XmlElement(name = "grupo_musico")
    protected String grupoMusico;

    /**
     * Obtém o valor da propriedade grupoMusico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrupoMusico() {
        return grupoMusico;
    }

    /**
     * Define o valor da propriedade grupoMusico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrupoMusico(String value) {
        this.grupoMusico = value;
    }

}
