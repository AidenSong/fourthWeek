package hello.fourthweek.interfaces.product.record.request;


import hello.fourthweek.domain.product.record.request.UpdateProductQuantityDomainRequest;

public record UpdateProductQuantityInterfacesRequest(
    long productId,
    long productOptionId,
    int indeAmount
) {

    public UpdateProductQuantityDomainRequest toDomain() {
        return new UpdateProductQuantityDomainRequest(productId, productOptionId, indeAmount);
    }

}
