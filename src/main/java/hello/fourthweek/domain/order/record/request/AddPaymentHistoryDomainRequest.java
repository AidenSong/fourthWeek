package hello.fourthweek.domain.order.record.request;


import hello.fourthweek.infra.order.entity.AddPaymentHistoryInfraEntity;

public record AddPaymentHistoryDomainRequest(
    long memberId,
    long orderId,
    int paymentAmount
) {


    public AddPaymentHistoryInfraEntity toEntity() {
        AddPaymentHistoryInfraEntity entity = new AddPaymentHistoryInfraEntity();
        entity.setMemberId(memberId);
        entity.setOrderId(orderId);
        entity.setPaymentAmount(paymentAmount);

        return entity;
    }
}
