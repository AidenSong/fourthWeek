package hello.fourthweek.infra.product.jparepository;

import hello.fourthweek.infra.product.entity.AddToCartInfraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddToCartJpaRepository extends JpaRepository<AddToCartInfraEntity, Long> {
}
