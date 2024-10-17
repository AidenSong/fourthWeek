package hello.fourthweek.infra.product.jparepository;

import hello.fourthweek.infra.product.entity.ProductOptionRegistInfraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductOptionRegistJpaRepository extends JpaRepository<ProductOptionRegistInfraEntity, Long> {
}
