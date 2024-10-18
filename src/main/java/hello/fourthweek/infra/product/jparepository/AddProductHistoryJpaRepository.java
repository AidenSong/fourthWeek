package hello.fourthweek.infra.product.jparepository;

import hello.fourthweek.infra.product.entity.AddProductHistoryInfraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddProductHistoryJpaRepository extends JpaRepository<AddProductHistoryInfraEntity, Long> {
}
