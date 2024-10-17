package hello.fourthweek.infra.member.jparepository;

import hello.fourthweek.infra.member.entity.GetBalanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface GetBalanceJpaRepository extends JpaRepository<GetBalanceEntity, Long> {

    @Modifying
    @Query(value = "SELECT MEMBER_BALANCE FROM MEMBER_INFO WHERE MEMBER_ID = :memberId", nativeQuery = true)
    GetBalanceEntity findByIdBalanceOnly(@Param("memberId") long memberId);
}
