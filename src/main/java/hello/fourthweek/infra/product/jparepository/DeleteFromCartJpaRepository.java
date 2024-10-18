package hello.fourthweek.infra.product.jparepository;

import hello.fourthweek.infra.product.entity.DeleteFromCartInfraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeleteFromCartJpaRepository extends JpaRepository<DeleteFromCartInfraEntity, Long> {
}
