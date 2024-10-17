package hello.fourthweek.infra.member.jparepository;

import hello.fourthweek.infra.member.entity.AddFundsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AddFundsJpaRepository extends JpaRepository<AddFundsEntity, Long> {

    @Modifying
    @Query(value = "UPDATE MEMBER_INFO SET MEMBER_BALANCE = :chargeAmout WHERE MEMBER_ID = :memberId", nativeQuery = true)
    AddFundsEntity findByIdAddFunds(@Param("memberId") long memberId, @Param("chargeAmount") int chargeAmount);
}
