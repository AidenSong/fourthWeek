package hello.fourthweek.infra.product;

import hello.fourthweek.domain.product.record.response.AddToCartDomainResponse;
import hello.fourthweek.domain.product.repository.ShoppingCartRepository;
import hello.fourthweek.infra.product.entity.AddToCartInfraEntity;
import hello.fourthweek.infra.product.jparepository.AddToCartJpaRepository;
import hello.fourthweek.infra.product.jparepository.DeleteFromCartJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;


@Repository
@RequiredArgsConstructor
public class ShoppingCartRepositoryImpl implements ShoppingCartRepository {

    private final AddToCartJpaRepository addToCartJpaRepository;
    private final DeleteFromCartJpaRepository deleteFromCartJpaRepository;




    @Override
    public AddToCartDomainResponse addToCart(AddToCartInfraEntity addToCartInfraEntity) {
        AddToCartInfraEntity response = addToCartJpaRepository.save(addToCartInfraEntity);
        return response.toDomain();
    }

    @Override
    public void deleteFromCart(long productId) {
        deleteFromCartJpaRepository.deleteById(productId);
    }


}
