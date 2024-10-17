package hello.fourthweek.domain.order.record.response;

import hello.fourthweek.interfaces.order.record.response.OrderInfoInterfacesResponse;

public record OrderInfoDomainResponse(
    long orderId,
    long memberId,
    String productList,
    String optionList,
    String quantityList
) {

    public OrderInfoInterfacesResponse toInterfaces() {
        return new OrderInfoInterfacesResponse(orderId, memberId, productList, optionList, quantityList);
    }

}
