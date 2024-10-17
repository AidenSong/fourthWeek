package hello.fourthweek.interfaces.order.record.request;

import hello.fourthweek.domain.order.record.request.OrderInfoDomainRequest;

public record OrderInfoInterfacesRequest(long orderId, long memberId) {


    public OrderInfoDomainRequest toDomain() {
        return new OrderInfoDomainRequest(orderId, memberId);
    }
}
