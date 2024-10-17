package hello.fourthweek.domain.product.record.request;

import hello.fourthweek.infra.product.entity.AddToCartInfraEntity;

public record AddToCartDomainRequest(long productId, long productOptionId, int quantity) {

    public AddToCartInfraEntity toEntity() {
        AddToCartInfraEntity entity = new AddToCartInfraEntity();
        entity.setProductId(productId);
        entity.setProductOptionId(productOptionId);
        entity.setQuantity(quantity);

        return entity;
    }
}
