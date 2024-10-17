package hello.fourthweek.domain.product.repository;


import hello.fourthweek.domain.product.record.response.AddToCartDomainResponse;
import hello.fourthweek.infra.product.entity.AddToCartInfraEntity;

public interface ShoppingCartRepository {


    AddToCartDomainResponse addToCart(AddToCartInfraEntity addToCartInfraEntity);

    void deleteFromCart(long productId);
}
