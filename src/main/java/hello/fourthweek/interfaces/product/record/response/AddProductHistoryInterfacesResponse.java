package hello.fourthweek.interfaces.product.record.response;


import java.time.LocalDateTime;

public record AddProductHistoryInterfacesResponse(
    long productId,
    int indeAmount,
    int totalQuantity,
    LocalDateTime createdAt
) {

}
