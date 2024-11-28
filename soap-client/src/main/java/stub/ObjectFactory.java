
package stub;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the stub package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _GetAllCustomers_QNAME = new QName("http://controller.soap_service.soap_test_project.net/", "getAllCustomers");
    private static final QName _GetAllCustomersResponse_QNAME = new QName("http://controller.soap_service.soap_test_project.net/", "getAllCustomersResponse");
    private static final QName _GetCustomerByIdentity_QNAME = new QName("http://controller.soap_service.soap_test_project.net/", "getCustomerByIdentity");
    private static final QName _GetCustomerByIdentityResponse_QNAME = new QName("http://controller.soap_service.soap_test_project.net/", "getCustomerByIdentityResponse");
    private static final QName _RemoveCustomer_QNAME = new QName("http://controller.soap_service.soap_test_project.net/", "removeCustomer");
    private static final QName _RemoveCustomerResponse_QNAME = new QName("http://controller.soap_service.soap_test_project.net/", "removeCustomerResponse");
    private static final QName _SaveNewCustomer_QNAME = new QName("http://controller.soap_service.soap_test_project.net/", "saveNewCustomer");
    private static final QName _SaveNewCustomerResponse_QNAME = new QName("http://controller.soap_service.soap_test_project.net/", "saveNewCustomerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllCustomers }
     * 
     * @return
     *     the new instance of {@link GetAllCustomers }
     */
    public GetAllCustomers createGetAllCustomers() {
        return new GetAllCustomers();
    }

    /**
     * Create an instance of {@link GetAllCustomersResponse }
     * 
     * @return
     *     the new instance of {@link GetAllCustomersResponse }
     */
    public GetAllCustomersResponse createGetAllCustomersResponse() {
        return new GetAllCustomersResponse();
    }

    /**
     * Create an instance of {@link GetCustomerByIdentity }
     * 
     * @return
     *     the new instance of {@link GetCustomerByIdentity }
     */
    public GetCustomerByIdentity createGetCustomerByIdentity() {
        return new GetCustomerByIdentity();
    }

    /**
     * Create an instance of {@link GetCustomerByIdentityResponse }
     * 
     * @return
     *     the new instance of {@link GetCustomerByIdentityResponse }
     */
    public GetCustomerByIdentityResponse createGetCustomerByIdentityResponse() {
        return new GetCustomerByIdentityResponse();
    }

    /**
     * Create an instance of {@link RemoveCustomer }
     * 
     * @return
     *     the new instance of {@link RemoveCustomer }
     */
    public RemoveCustomer createRemoveCustomer() {
        return new RemoveCustomer();
    }

    /**
     * Create an instance of {@link RemoveCustomerResponse }
     * 
     * @return
     *     the new instance of {@link RemoveCustomerResponse }
     */
    public RemoveCustomerResponse createRemoveCustomerResponse() {
        return new RemoveCustomerResponse();
    }

    /**
     * Create an instance of {@link SaveNewCustomer }
     * 
     * @return
     *     the new instance of {@link SaveNewCustomer }
     */
    public SaveNewCustomer createSaveNewCustomer() {
        return new SaveNewCustomer();
    }

    /**
     * Create an instance of {@link SaveNewCustomerResponse }
     * 
     * @return
     *     the new instance of {@link SaveNewCustomerResponse }
     */
    public SaveNewCustomerResponse createSaveNewCustomerResponse() {
        return new SaveNewCustomerResponse();
    }

    /**
     * Create an instance of {@link CustomerResponse }
     * 
     * @return
     *     the new instance of {@link CustomerResponse }
     */
    public CustomerResponse createCustomerResponse() {
        return new CustomerResponse();
    }

    /**
     * Create an instance of {@link CustomerRequest }
     * 
     * @return
     *     the new instance of {@link CustomerRequest }
     */
    public CustomerRequest createCustomerRequest() {
        return new CustomerRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCustomers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllCustomers }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.soap_service.soap_test_project.net/", name = "getAllCustomers")
    public JAXBElement<GetAllCustomers> createGetAllCustomers(GetAllCustomers value) {
        return new JAXBElement<>(_GetAllCustomers_QNAME, GetAllCustomers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCustomersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllCustomersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.soap_service.soap_test_project.net/", name = "getAllCustomersResponse")
    public JAXBElement<GetAllCustomersResponse> createGetAllCustomersResponse(GetAllCustomersResponse value) {
        return new JAXBElement<>(_GetAllCustomersResponse_QNAME, GetAllCustomersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerByIdentity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCustomerByIdentity }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.soap_service.soap_test_project.net/", name = "getCustomerByIdentity")
    public JAXBElement<GetCustomerByIdentity> createGetCustomerByIdentity(GetCustomerByIdentity value) {
        return new JAXBElement<>(_GetCustomerByIdentity_QNAME, GetCustomerByIdentity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerByIdentityResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCustomerByIdentityResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.soap_service.soap_test_project.net/", name = "getCustomerByIdentityResponse")
    public JAXBElement<GetCustomerByIdentityResponse> createGetCustomerByIdentityResponse(GetCustomerByIdentityResponse value) {
        return new JAXBElement<>(_GetCustomerByIdentityResponse_QNAME, GetCustomerByIdentityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.soap_service.soap_test_project.net/", name = "removeCustomer")
    public JAXBElement<RemoveCustomer> createRemoveCustomer(RemoveCustomer value) {
        return new JAXBElement<>(_RemoveCustomer_QNAME, RemoveCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.soap_service.soap_test_project.net/", name = "removeCustomerResponse")
    public JAXBElement<RemoveCustomerResponse> createRemoveCustomerResponse(RemoveCustomerResponse value) {
        return new JAXBElement<>(_RemoveCustomerResponse_QNAME, RemoveCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveNewCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveNewCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.soap_service.soap_test_project.net/", name = "saveNewCustomer")
    public JAXBElement<SaveNewCustomer> createSaveNewCustomer(SaveNewCustomer value) {
        return new JAXBElement<>(_SaveNewCustomer_QNAME, SaveNewCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveNewCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveNewCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.soap_service.soap_test_project.net/", name = "saveNewCustomerResponse")
    public JAXBElement<SaveNewCustomerResponse> createSaveNewCustomerResponse(SaveNewCustomerResponse value) {
        return new JAXBElement<>(_SaveNewCustomerResponse_QNAME, SaveNewCustomerResponse.class, null, value);
    }

}
