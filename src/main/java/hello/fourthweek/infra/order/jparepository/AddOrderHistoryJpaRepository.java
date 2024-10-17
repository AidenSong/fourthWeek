package hello.fourthweek.infra.order.jparepository;

import hello.fourthweek.infra.order.entity.AddOrderHistoryInfraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddOrderHistoryJpaRepository extends JpaRepository<AddOrderHistoryInfraEntity, Long> {
}
