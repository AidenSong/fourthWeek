package hello.fourthweek.infra.member.jparepository;

import hello.fourthweek.infra.member.entity.UpdateBalanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UpdateBalanceJpaRepository extends JpaRepository<UpdateBalanceEntity, Long> {

    @Modifying
    @Query(value = "UPDATE MEMBER_INFO SET MEMBER_BALANCE = :amount WHERE MEMBER_ID = :memberId", nativeQuery = true)
    UpdateBalanceEntity updateBalance(@Param("memberId") long memberId, @Param("amount") int amount);
}
