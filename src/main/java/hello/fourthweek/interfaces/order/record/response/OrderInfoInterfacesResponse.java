package hello.fourthweek.interfaces.order.record.response;

public record OrderInfoInterfacesResponse(
    long orderId,
    long memberId,
    String productList,
    String optionList,
    String quantityList
) {


}
