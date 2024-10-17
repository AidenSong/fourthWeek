package hello.fourthweek.interfaces.product.record.request;

import hello.fourthweek.domain.product.record.request.AddProductHistoryDomainRequest;

import java.time.LocalDateTime;



public record AddProductHistoryInterfaceRequest(
    long productId,
    int indeAmount,
    int totalQuantity,
    LocalDateTime createdAt
) {
    public AddProductHistoryDomainRequest toDomain() {
        return new AddProductHistoryDomainRequest(productId, indeAmount, totalQuantity, createdAt);
    }
}
