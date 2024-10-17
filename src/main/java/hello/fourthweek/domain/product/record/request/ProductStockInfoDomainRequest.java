package hello.fourthweek.domain.product.record.request;


import hello.fourthweek.infra.product.entity.ProductStockInfoInfraEntity;

public record ProductStockInfoDomainRequest(long productId, long productOptionId) {

    public ProductStockInfoInfraEntity toEntity() {
        ProductStockInfoInfraEntity entity = new ProductStockInfoInfraEntity();
        entity.setProrductId(productId);
        entity.setProductOptionId(productOptionId);

        return entity;
    }
}
