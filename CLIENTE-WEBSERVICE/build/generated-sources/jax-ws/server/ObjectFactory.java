
package server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the server package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AlugaDisco_QNAME = new QName("http://server/", "alugaDisco");
    private final static QName _AlugaDiscoResponse_QNAME = new QName("http://server/", "alugaDiscoResponse");
    private final static QName _DevolveDisco_QNAME = new QName("http://server/", "devolveDisco");
    private final static QName _DevolveDiscoResponse_QNAME = new QName("http://server/", "devolveDiscoResponse");
    private final static QName _InserirAssociado_QNAME = new QName("http://server/", "inserirAssociado");
    private final static QName _InserirAssociadoResponse_QNAME = new QName("http://server/", "inserirAssociadoResponse");
    private final static QName _InserirDisco_QNAME = new QName("http://server/", "inserirDisco");
    private final static QName _InserirDiscoResponse_QNAME = new QName("http://server/", "inserirDiscoResponse");
    private final static QName _PesquisaDiscoEstiloMusica_QNAME = new QName("http://server/", "pesquisaDiscoEstiloMusica");
    private final static QName _PesquisaDiscoEstiloMusicaResponse_QNAME = new QName("http://server/", "pesquisaDiscoEstiloMusicaResponse");
    private final static QName _PesquisaDiscoGrupoMusico_QNAME = new QName("http://server/", "pesquisaDiscoGrupoMusico");
    private final static QName _PesquisaDiscoGrupoMusicoResponse_QNAME = new QName("http://server/", "pesquisaDiscoGrupoMusicoResponse");
    private final static QName _PesquisaDiscoTitulo_QNAME = new QName("http://server/", "pesquisaDiscoTitulo");
    private final static QName _PesquisaDiscoTituloResponse_QNAME = new QName("http://server/", "pesquisaDiscoTituloResponse");
    private final static QName _RemoverAssociado_QNAME = new QName("http://server/", "removerAssociado");
    private final static QName _RemoverAssociadoResponse_QNAME = new QName("http://server/", "removerAssociadoResponse");
    private final static QName _RemoverDisco_QNAME = new QName("http://server/", "removerDisco");
    private final static QName _RemoverDiscoResponse_QNAME = new QName("http://server/", "removerDiscoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AlugaDisco }
     * 
     */
    public AlugaDisco createAlugaDisco() {
        return new AlugaDisco();
    }

    /**
     * Create an instance of {@link AlugaDiscoResponse }
     * 
     */
    public AlugaDiscoResponse createAlugaDiscoResponse() {
        return new AlugaDiscoResponse();
    }

    /**
     * Create an instance of {@link DevolveDisco }
     * 
     */
    public DevolveDisco createDevolveDisco() {
        return new DevolveDisco();
    }

    /**
     * Create an instance of {@link DevolveDiscoResponse }
     * 
     */
    public DevolveDiscoResponse createDevolveDiscoResponse() {
        return new DevolveDiscoResponse();
    }

    /**
     * Create an instance of {@link InserirAssociado }
     * 
     */
    public InserirAssociado createInserirAssociado() {
        return new InserirAssociado();
    }

    /**
     * Create an instance of {@link InserirAssociadoResponse }
     * 
     */
    public InserirAssociadoResponse createInserirAssociadoResponse() {
        return new InserirAssociadoResponse();
    }

    /**
     * Create an instance of {@link InserirDisco }
     * 
     */
    public InserirDisco createInserirDisco() {
        return new InserirDisco();
    }

    /**
     * Create an instance of {@link InserirDiscoResponse }
     * 
     */
    public InserirDiscoResponse createInserirDiscoResponse() {
        return new InserirDiscoResponse();
    }

    /**
     * Create an instance of {@link PesquisaDiscoEstiloMusica }
     * 
     */
    public PesquisaDiscoEstiloMusica createPesquisaDiscoEstiloMusica() {
        return new PesquisaDiscoEstiloMusica();
    }

    /**
     * Create an instance of {@link PesquisaDiscoEstiloMusicaResponse }
     * 
     */
    public PesquisaDiscoEstiloMusicaResponse createPesquisaDiscoEstiloMusicaResponse() {
        return new PesquisaDiscoEstiloMusicaResponse();
    }

    /**
     * Create an instance of {@link PesquisaDiscoGrupoMusico }
     * 
     */
    public PesquisaDiscoGrupoMusico createPesquisaDiscoGrupoMusico() {
        return new PesquisaDiscoGrupoMusico();
    }

    /**
     * Create an instance of {@link PesquisaDiscoGrupoMusicoResponse }
     * 
     */
    public PesquisaDiscoGrupoMusicoResponse createPesquisaDiscoGrupoMusicoResponse() {
        return new PesquisaDiscoGrupoMusicoResponse();
    }

    /**
     * Create an instance of {@link PesquisaDiscoTitulo }
     * 
     */
    public PesquisaDiscoTitulo createPesquisaDiscoTitulo() {
        return new PesquisaDiscoTitulo();
    }

    /**
     * Create an instance of {@link PesquisaDiscoTituloResponse }
     * 
     */
    public PesquisaDiscoTituloResponse createPesquisaDiscoTituloResponse() {
        return new PesquisaDiscoTituloResponse();
    }

    /**
     * Create an instance of {@link RemoverAssociado }
     * 
     */
    public RemoverAssociado createRemoverAssociado() {
        return new RemoverAssociado();
    }

    /**
     * Create an instance of {@link RemoverAssociadoResponse }
     * 
     */
    public RemoverAssociadoResponse createRemoverAssociadoResponse() {
        return new RemoverAssociadoResponse();
    }

    /**
     * Create an instance of {@link RemoverDisco }
     * 
     */
    public RemoverDisco createRemoverDisco() {
        return new RemoverDisco();
    }

    /**
     * Create an instance of {@link RemoverDiscoResponse }
     * 
     */
    public RemoverDiscoResponse createRemoverDiscoResponse() {
        return new RemoverDiscoResponse();
    }

    /**
     * Create an instance of {@link Disco }
     * 
     */
    public Disco createDisco() {
        return new Disco();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlugaDisco }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlugaDisco }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "alugaDisco")
    public JAXBElement<AlugaDisco> createAlugaDisco(AlugaDisco value) {
        return new JAXBElement<AlugaDisco>(_AlugaDisco_QNAME, AlugaDisco.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlugaDiscoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlugaDiscoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "alugaDiscoResponse")
    public JAXBElement<AlugaDiscoResponse> createAlugaDiscoResponse(AlugaDiscoResponse value) {
        return new JAXBElement<AlugaDiscoResponse>(_AlugaDiscoResponse_QNAME, AlugaDiscoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevolveDisco }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DevolveDisco }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "devolveDisco")
    public JAXBElement<DevolveDisco> createDevolveDisco(DevolveDisco value) {
        return new JAXBElement<DevolveDisco>(_DevolveDisco_QNAME, DevolveDisco.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevolveDiscoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DevolveDiscoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "devolveDiscoResponse")
    public JAXBElement<DevolveDiscoResponse> createDevolveDiscoResponse(DevolveDiscoResponse value) {
        return new JAXBElement<DevolveDiscoResponse>(_DevolveDiscoResponse_QNAME, DevolveDiscoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirAssociado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InserirAssociado }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "inserirAssociado")
    public JAXBElement<InserirAssociado> createInserirAssociado(InserirAssociado value) {
        return new JAXBElement<InserirAssociado>(_InserirAssociado_QNAME, InserirAssociado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirAssociadoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InserirAssociadoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "inserirAssociadoResponse")
    public JAXBElement<InserirAssociadoResponse> createInserirAssociadoResponse(InserirAssociadoResponse value) {
        return new JAXBElement<InserirAssociadoResponse>(_InserirAssociadoResponse_QNAME, InserirAssociadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirDisco }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InserirDisco }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "inserirDisco")
    public JAXBElement<InserirDisco> createInserirDisco(InserirDisco value) {
        return new JAXBElement<InserirDisco>(_InserirDisco_QNAME, InserirDisco.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirDiscoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InserirDiscoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "inserirDiscoResponse")
    public JAXBElement<InserirDiscoResponse> createInserirDiscoResponse(InserirDiscoResponse value) {
        return new JAXBElement<InserirDiscoResponse>(_InserirDiscoResponse_QNAME, InserirDiscoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisaDiscoEstiloMusica }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesquisaDiscoEstiloMusica }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "pesquisaDiscoEstiloMusica")
    public JAXBElement<PesquisaDiscoEstiloMusica> createPesquisaDiscoEstiloMusica(PesquisaDiscoEstiloMusica value) {
        return new JAXBElement<PesquisaDiscoEstiloMusica>(_PesquisaDiscoEstiloMusica_QNAME, PesquisaDiscoEstiloMusica.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisaDiscoEstiloMusicaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesquisaDiscoEstiloMusicaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "pesquisaDiscoEstiloMusicaResponse")
    public JAXBElement<PesquisaDiscoEstiloMusicaResponse> createPesquisaDiscoEstiloMusicaResponse(PesquisaDiscoEstiloMusicaResponse value) {
        return new JAXBElement<PesquisaDiscoEstiloMusicaResponse>(_PesquisaDiscoEstiloMusicaResponse_QNAME, PesquisaDiscoEstiloMusicaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisaDiscoGrupoMusico }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesquisaDiscoGrupoMusico }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "pesquisaDiscoGrupoMusico")
    public JAXBElement<PesquisaDiscoGrupoMusico> createPesquisaDiscoGrupoMusico(PesquisaDiscoGrupoMusico value) {
        return new JAXBElement<PesquisaDiscoGrupoMusico>(_PesquisaDiscoGrupoMusico_QNAME, PesquisaDiscoGrupoMusico.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisaDiscoGrupoMusicoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesquisaDiscoGrupoMusicoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "pesquisaDiscoGrupoMusicoResponse")
    public JAXBElement<PesquisaDiscoGrupoMusicoResponse> createPesquisaDiscoGrupoMusicoResponse(PesquisaDiscoGrupoMusicoResponse value) {
        return new JAXBElement<PesquisaDiscoGrupoMusicoResponse>(_PesquisaDiscoGrupoMusicoResponse_QNAME, PesquisaDiscoGrupoMusicoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisaDiscoTitulo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesquisaDiscoTitulo }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "pesquisaDiscoTitulo")
    public JAXBElement<PesquisaDiscoTitulo> createPesquisaDiscoTitulo(PesquisaDiscoTitulo value) {
        return new JAXBElement<PesquisaDiscoTitulo>(_PesquisaDiscoTitulo_QNAME, PesquisaDiscoTitulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisaDiscoTituloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesquisaDiscoTituloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "pesquisaDiscoTituloResponse")
    public JAXBElement<PesquisaDiscoTituloResponse> createPesquisaDiscoTituloResponse(PesquisaDiscoTituloResponse value) {
        return new JAXBElement<PesquisaDiscoTituloResponse>(_PesquisaDiscoTituloResponse_QNAME, PesquisaDiscoTituloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverAssociado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoverAssociado }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "removerAssociado")
    public JAXBElement<RemoverAssociado> createRemoverAssociado(RemoverAssociado value) {
        return new JAXBElement<RemoverAssociado>(_RemoverAssociado_QNAME, RemoverAssociado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverAssociadoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoverAssociadoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "removerAssociadoResponse")
    public JAXBElement<RemoverAssociadoResponse> createRemoverAssociadoResponse(RemoverAssociadoResponse value) {
        return new JAXBElement<RemoverAssociadoResponse>(_RemoverAssociadoResponse_QNAME, RemoverAssociadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverDisco }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoverDisco }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "removerDisco")
    public JAXBElement<RemoverDisco> createRemoverDisco(RemoverDisco value) {
        return new JAXBElement<RemoverDisco>(_RemoverDisco_QNAME, RemoverDisco.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverDiscoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoverDiscoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server/", name = "removerDiscoResponse")
    public JAXBElement<RemoverDiscoResponse> createRemoverDiscoResponse(RemoverDiscoResponse value) {
        return new JAXBElement<RemoverDiscoResponse>(_RemoverDiscoResponse_QNAME, RemoverDiscoResponse.class, null, value);
    }

}
