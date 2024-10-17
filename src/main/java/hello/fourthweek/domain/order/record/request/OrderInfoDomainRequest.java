package hello.fourthweek.domain.order.record.request;

import hello.fourthweek.infra.order.entity.OrderInfoInfraEntity;

public record OrderInfoDomainRequest(long orderId, long memberId) {


    public OrderInfoInfraEntity toEntity() {
        OrderInfoInfraEntity entity = new OrderInfoInfraEntity();
        entity.setOrderId(orderId);
        entity.setMemberId(memberId);

        return entity;
    }
}
