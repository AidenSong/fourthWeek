package hello.fourthweek.domain.product.record.response;


import hello.fourthweek.interfaces.product.record.response.AddProductHistoryInterfacesResponse;

import java.time.LocalDateTime;

public record AddProductHistoryDomainResponse(
    long productId,
    int indeAmount,
    int totalQuantity,
    LocalDateTime createdAt
    ) {

    public AddProductHistoryInterfacesResponse toInterfaces() {
        return new AddProductHistoryInterfacesResponse(productId, indeAmount, totalQuantity, createdAt);
    }
}
