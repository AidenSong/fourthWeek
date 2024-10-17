package hello.fourthweek.domain.product.record.response;


import hello.fourthweek.interfaces.product.record.response.ProductRegistInterfacesResponse;

public record ProductRegistDomainResponse(long productId, String productName) {

    public ProductRegistInterfacesResponse toInterfaces() {
        return new ProductRegistInterfacesResponse(productId, productName);
    }
}
