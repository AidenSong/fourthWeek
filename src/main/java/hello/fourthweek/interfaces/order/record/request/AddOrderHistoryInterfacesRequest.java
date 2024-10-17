package hello.fourthweek.interfaces.order.record.request;


import hello.fourthweek.domain.order.record.request.AddOrderHistoryDomainRequest;

import java.time.LocalDateTime;

public record AddOrderHistoryInterfacesRequest(
    long memberId,
    long productId,
    int quantity,
    LocalDateTime createdAt
) {


    public AddOrderHistoryDomainRequest toDomain() {
        return new AddOrderHistoryDomainRequest(memberId, productId, quantity, createdAt);
    }
}
