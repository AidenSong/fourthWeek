package hello.fourthweek.interfaces.product.record.request;

import hello.fourthweek.domain.product.record.request.ProductOptionRegistDomainRequest;

public record ProductOptionRegistInterfacesRequest(long productOptionId, long productId, String productOption) {


    public ProductOptionRegistDomainRequest toDomain() {
        return new ProductOptionRegistDomainRequest(productOptionId, productId, productOption);
    }

}
