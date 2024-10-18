package hello.fourthweek.domain.product.record.response;


import hello.fourthweek.interfaces.product.record.response.AddToCartInterfacesResponse;

public record AddToCartDomainResponse(long productId, long productOptionId, int quantity) {



    public AddToCartInterfacesResponse toInterfaces() {
        return new AddToCartInterfacesResponse(productId, productOptionId, quantity);
    }
}
