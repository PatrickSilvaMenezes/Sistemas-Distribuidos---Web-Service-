
package server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de inserirDisco complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="inserirDisco"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="editora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="grupo_musico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ano" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "inserirDisco", propOrder = {
    "id",
    "titulo",
    "editora",
    "grupoMusico",
    "ano",
    "estiloMusica"
})
public class InserirDisco {

    protected int id;
    protected String titulo;
    protected String editora;
    @XmlElement(name = "grupo_musico")
    protected String grupoMusico;
    protected int ano;
    @XmlElement(name = "estilo_musica")
    protected String estiloMusica;

    /**
     * Obtém o valor da propriedade id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade titulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define o valor da propriedade titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

    /**
     * Obtém o valor da propriedade editora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditora() {
        return editora;
    }

    /**
     * Define o valor da propriedade editora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditora(String value) {
        this.editora = value;
    }

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

    /**
     * Obtém o valor da propriedade ano.
     * 
     */
    public int getAno() {
        return ano;
    }

    /**
     * Define o valor da propriedade ano.
     * 
     */
    public void setAno(int value) {
        this.ano = value;
    }

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
