package hello.fourthweek.domain.product.record.request;


import hello.fourthweek.infra.product.entity.ProductRegistInfraEntity;

public record ProductRegistDomainRequest(
    long productId,
    String productName
//    long productOptionId,
//    int productQuantity
    ) {

    public ProductRegistInfraEntity toEntity() {
        ProductRegistInfraEntity entity = new ProductRegistInfraEntity();
        entity.setProductId(productId);
        entity.setProductName(productName);

        return entity;
    }

}
