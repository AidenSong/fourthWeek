package hello.fourthweek.interfaces.product.record.response;




public record ProductStockInfoInterfacesResponse(
    long productId,
    long productOptionId,
    int productQuantity
) { }
