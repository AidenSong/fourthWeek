package hello.fourthweek.domain.product.record.request;


import hello.fourthweek.infra.product.entity.AddProductHistoryInfraEntity;

import java.time.LocalDateTime;



public record AddProductHistoryDomainRequest(
    long productId,
    int indeAmount,
    int totalQuantity,
    LocalDateTime createdAt
    ) {

    public AddProductHistoryInfraEntity toEntity() {
        AddProductHistoryInfraEntity entity = new AddProductHistoryInfraEntity();
        entity.setProductId(productId);
        entity.setIndeAmount(indeAmount);
        entity.setCreatedAt(createdAt);

        return entity;
    }
}
