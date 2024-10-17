package hello.fourthweek.domain.product.record.request;

import hello.fourthweek.infra.product.entity.UpdateProductQuantityInfraEntity;

public record UpdateProductQuantityDomainRequest(
    long productId,
    long productOptionId,
    int indeAmount
) {

    public UpdateProductQuantityInfraEntity toEntity() {
        UpdateProductQuantityInfraEntity entity = new UpdateProductQuantityInfraEntity();
        entity.setProductId(productId);
        entity.setProductOptionId(productOptionId);
        entity.setIndeAmount(indeAmount);

        return entity;
    }
}
