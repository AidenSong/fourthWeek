package hello.fourthweek.interfaces.order.record.request;


import hello.fourthweek.domain.order.record.request.AddPaymentHistoryDomainRequest;

public record AddPaymentHistoryInterfacesRequest(
    long memberId,
    long orderId,
    int paymentAmount
) {


    public AddPaymentHistoryDomainRequest toDomain() {
        return new AddPaymentHistoryDomainRequest(memberId, orderId, paymentAmount);
    }

}
