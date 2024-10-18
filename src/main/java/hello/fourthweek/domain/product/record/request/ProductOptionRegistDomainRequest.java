package hello.fourthweek.domain.product.record.request;

import hello.fourthweek.infra.product.entity.ProductOptionRegistInfraEntity;

public record ProductOptionRegistDomainRequest(long productOptionId, long productId, String productOption) {


    public ProductOptionRegistInfraEntity toEntity() {
        ProductOptionRegistInfraEntity entity = new ProductOptionRegistInfraEntity();
        entity.setProductOptionId(productOptionId);
        entity.setProductId(productId);
        entity.setProductOption(productOption);

        return entity;
    }
}
