package hello.fourthweek.interfaces.product.record.request;

import hello.fourthweek.domain.product.record.request.AddToCartDomainRequest;

public record AddToShoppingCartInterfacesRequest(long productId, long productOptionId, int quantity) {


    public AddToCartDomainRequest toDomain() {
        return new AddToCartDomainRequest(productId, productOptionId, quantity);
    }
}
