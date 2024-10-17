package hello.fourthweek.domain.order.record.request;

import hello.fourthweek.infra.order.entity.AddOrderHistoryInfraEntity;

import java.time.LocalDateTime;

public record AddOrderHistoryDomainRequest(
    long memberId,
    long productId,
    int quantity,
    LocalDateTime createdAt
) {


    public AddOrderHistoryInfraEntity toEntity() {
        AddOrderHistoryInfraEntity entity = new AddOrderHistoryInfraEntity();
        entity.setMemberId(memberId);
        entity.setProductId(productId);
        entity.setQuantity(quantity);
        entity.setCreatedAt(createdAt);

        return entity;
    }
}
