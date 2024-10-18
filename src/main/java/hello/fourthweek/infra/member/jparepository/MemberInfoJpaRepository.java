package hello.fourthweek.infra.member.jparepository;


import hello.fourthweek.infra.member.entity.MemberInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberInfoJpaRepository extends JpaRepository<MemberInfoEntity, Long> {
}
