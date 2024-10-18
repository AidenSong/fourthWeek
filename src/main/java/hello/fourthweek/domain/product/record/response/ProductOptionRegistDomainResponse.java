package hello.fourthweek.domain.product.record.response;

import hello.fourthweek.interfaces.product.record.response.ProductOptionRegistInterfacesResponse;

public record ProductOptionRegistDomainResponse(long productOptionId, long productId, String productOption) {


    public ProductOptionRegistInterfacesResponse toInterfaces() {
        return new ProductOptionRegistInterfacesResponse(productOptionId, productId, productOption);
    }
}
