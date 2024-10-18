package hello.fourthweek.interfaces.product.record.response;



public record UpdateProductQuantityInterfacesResponse(
    long productId,
    long productOptionId,
    int productQuantity
) {

}
