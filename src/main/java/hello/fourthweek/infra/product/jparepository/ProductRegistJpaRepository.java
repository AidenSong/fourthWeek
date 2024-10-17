package hello.fourthweek.infra.product.jparepository;


import hello.fourthweek.infra.product.entity.ProductRegistInfraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRegistJpaRepository extends JpaRepository<ProductRegistInfraEntity, Long> {


}
