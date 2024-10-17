package hello.fourthweek.interfaces.product.record.request;

import hello.fourthweek.domain.product.record.request.ProductStockInfoDomainRequest;

public record ProductStockInfoInterfacesRequest(
    long productId,
    long productOptionId
) {
    public ProductStockInfoDomainRequest toDomain() {
        return new ProductStockInfoDomainRequest(productId, productOptionId);
    }
}
