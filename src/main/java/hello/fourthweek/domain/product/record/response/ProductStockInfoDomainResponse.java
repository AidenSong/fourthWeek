package hello.fourthweek.domain.product.record.response;

import hello.fourthweek.interfaces.product.record.response.ProductStockInfoInterfacesResponse;

public record ProductStockInfoDomainResponse(
    long productId,
    long productOptionId,
    int productQuantity
) {

    public ProductStockInfoInterfacesResponse toInterfaces() {
        return new ProductStockInfoInterfacesResponse(productId, productOptionId, productQuantity);
    }
}
