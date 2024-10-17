package hello.fourthweek.interfaces.product.record.request;

import hello.fourthweek.domain.product.record.request.ProductRegistDomainRequest;

public record ProductRegistInterfacesRequest(
        long productId,
        String productName,
        long productOptionId,
        int productQuantity
) {

        public ProductRegistDomainRequest toDomain() {
                return new ProductRegistDomainRequest(productId, productName);
        }

}
