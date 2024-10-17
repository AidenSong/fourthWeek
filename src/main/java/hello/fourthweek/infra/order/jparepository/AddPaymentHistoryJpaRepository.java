package hello.fourthweek.infra.order.jparepository;

import hello.fourthweek.infra.order.entity.AddPaymentHistoryInfraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddPaymentHistoryJpaRepository extends JpaRepository<AddPaymentHistoryInfraEntity, Long> {
}
