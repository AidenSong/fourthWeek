package hello.fourthweek.infra.member.jparepository;

import hello.fourthweek.infra.member.entity.MemberRegistEntity;
import org.springframework.data.jpa.repository.JpaRepository;



public interface MemberRegistJpaRepository extends JpaRepository<MemberRegistEntity, Long> {

}
