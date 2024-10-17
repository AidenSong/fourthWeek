package hello.fourthweek.infra.order.jparepository;

import hello.fourthweek.infra.order.entity.OrderInfoInfraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrderInfoJpaRepository extends JpaRepository<OrderInfoInfraEntity, Long> {


    @Modifying
    @Query(value = "SELECT * FROM ORDER_INFO WHERE MEMBER_ID = :memberId", nativeQuery = true)
    OrderInfoInfraEntity findByOrderIdAndMemberId(@Param("orderId") long orerId, @Param("memberId") long memberId);


}
