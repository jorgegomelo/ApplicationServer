
package artifacts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the artifacts package. 
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

    private final static QName _GeTitles_QNAME = new QName("http://ws/", "geTitles");
    private final static QName _GeTitlesResponse_QNAME = new QName("http://ws/", "geTitlesResponse");
    private final static QName _GetAuthors_QNAME = new QName("http://ws/", "getAuthors");
    private final static QName _GetAuthorsResponse_QNAME = new QName("http://ws/", "getAuthorsResponse");
    private final static QName _GetBookByTitle_QNAME = new QName("http://ws/", "getBookByTitle");
    private final static QName _GetBookByTitleResponse_QNAME = new QName("http://ws/", "getBookByTitleResponse");
    private final static QName _GetBooks_QNAME = new QName("http://ws/", "getBooks");
    private final static QName _GetBooksResponse_QNAME = new QName("http://ws/", "getBooksResponse");
    private final static QName _GetFormatsByTitles_QNAME = new QName("http://ws/", "getFormatsByTitles");
    private final static QName _GetFormatsByTitlesResponse_QNAME = new QName("http://ws/", "getFormatsByTitlesResponse");
    private final static QName _GetWeightByTitles_QNAME = new QName("http://ws/", "getWeightByTitles");
    private final static QName _GetWeightByTitlesResponse_QNAME = new QName("http://ws/", "getWeightByTitlesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: artifacts
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GeTitles }
     * 
     */
    public GeTitles createGeTitles() {
        return new GeTitles();
    }

    /**
     * Create an instance of {@link GeTitlesResponse }
     * 
     */
    public GeTitlesResponse createGeTitlesResponse() {
        return new GeTitlesResponse();
    }

    /**
     * Create an instance of {@link GetAuthors }
     * 
     */
    public GetAuthors createGetAuthors() {
        return new GetAuthors();
    }

    /**
     * Create an instance of {@link GetAuthorsResponse }
     * 
     */
    public GetAuthorsResponse createGetAuthorsResponse() {
        return new GetAuthorsResponse();
    }

    /**
     * Create an instance of {@link GetBookByTitle }
     * 
     */
    public GetBookByTitle createGetBookByTitle() {
        return new GetBookByTitle();
    }

    /**
     * Create an instance of {@link GetBookByTitleResponse }
     * 
     */
    public GetBookByTitleResponse createGetBookByTitleResponse() {
        return new GetBookByTitleResponse();
    }

    /**
     * Create an instance of {@link GetBooks }
     * 
     */
    public GetBooks createGetBooks() {
        return new GetBooks();
    }

    /**
     * Create an instance of {@link GetBooksResponse }
     * 
     */
    public GetBooksResponse createGetBooksResponse() {
        return new GetBooksResponse();
    }

    /**
     * Create an instance of {@link GetFormatsByTitles }
     * 
     */
    public GetFormatsByTitles createGetFormatsByTitles() {
        return new GetFormatsByTitles();
    }

    /**
     * Create an instance of {@link GetFormatsByTitlesResponse }
     * 
     */
    public GetFormatsByTitlesResponse createGetFormatsByTitlesResponse() {
        return new GetFormatsByTitlesResponse();
    }

    /**
     * Create an instance of {@link GetWeightByTitles }
     * 
     */
    public GetWeightByTitles createGetWeightByTitles() {
        return new GetWeightByTitles();
    }

    /**
     * Create an instance of {@link GetWeightByTitlesResponse }
     * 
     */
    public GetWeightByTitlesResponse createGetWeightByTitlesResponse() {
        return new GetWeightByTitlesResponse();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link Format }
     * 
     */
    public Format createFormat() {
        return new Format();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeTitles }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GeTitles }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "geTitles")
    public JAXBElement<GeTitles> createGeTitles(GeTitles value) {
        return new JAXBElement<GeTitles>(_GeTitles_QNAME, GeTitles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeTitlesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GeTitlesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "geTitlesResponse")
    public JAXBElement<GeTitlesResponse> createGeTitlesResponse(GeTitlesResponse value) {
        return new JAXBElement<GeTitlesResponse>(_GeTitlesResponse_QNAME, GeTitlesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuthors }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAuthors }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAuthors")
    public JAXBElement<GetAuthors> createGetAuthors(GetAuthors value) {
        return new JAXBElement<GetAuthors>(_GetAuthors_QNAME, GetAuthors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuthorsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAuthorsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAuthorsResponse")
    public JAXBElement<GetAuthorsResponse> createGetAuthorsResponse(GetAuthorsResponse value) {
        return new JAXBElement<GetAuthorsResponse>(_GetAuthorsResponse_QNAME, GetAuthorsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookByTitle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBookByTitle }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getBookByTitle")
    public JAXBElement<GetBookByTitle> createGetBookByTitle(GetBookByTitle value) {
        return new JAXBElement<GetBookByTitle>(_GetBookByTitle_QNAME, GetBookByTitle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookByTitleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBookByTitleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getBookByTitleResponse")
    public JAXBElement<GetBookByTitleResponse> createGetBookByTitleResponse(GetBookByTitleResponse value) {
        return new JAXBElement<GetBookByTitleResponse>(_GetBookByTitleResponse_QNAME, GetBookByTitleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooks }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBooks }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getBooks")
    public JAXBElement<GetBooks> createGetBooks(GetBooks value) {
        return new JAXBElement<GetBooks>(_GetBooks_QNAME, GetBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooksResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBooksResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getBooksResponse")
    public JAXBElement<GetBooksResponse> createGetBooksResponse(GetBooksResponse value) {
        return new JAXBElement<GetBooksResponse>(_GetBooksResponse_QNAME, GetBooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFormatsByTitles }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFormatsByTitles }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getFormatsByTitles")
    public JAXBElement<GetFormatsByTitles> createGetFormatsByTitles(GetFormatsByTitles value) {
        return new JAXBElement<GetFormatsByTitles>(_GetFormatsByTitles_QNAME, GetFormatsByTitles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFormatsByTitlesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFormatsByTitlesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getFormatsByTitlesResponse")
    public JAXBElement<GetFormatsByTitlesResponse> createGetFormatsByTitlesResponse(GetFormatsByTitlesResponse value) {
        return new JAXBElement<GetFormatsByTitlesResponse>(_GetFormatsByTitlesResponse_QNAME, GetFormatsByTitlesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeightByTitles }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetWeightByTitles }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getWeightByTitles")
    public JAXBElement<GetWeightByTitles> createGetWeightByTitles(GetWeightByTitles value) {
        return new JAXBElement<GetWeightByTitles>(_GetWeightByTitles_QNAME, GetWeightByTitles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeightByTitlesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetWeightByTitlesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getWeightByTitlesResponse")
    public JAXBElement<GetWeightByTitlesResponse> createGetWeightByTitlesResponse(GetWeightByTitlesResponse value) {
        return new JAXBElement<GetWeightByTitlesResponse>(_GetWeightByTitlesResponse_QNAME, GetWeightByTitlesResponse.class, null, value);
    }

}
