package hello.fourthweek.infra.member.jparepository;


import hello.fourthweek.infra.member.entity.AddMemberHistoryInfraEntity;
import org.springframework.data.jpa.repository.JpaRepository;




public interface AddMemberHistoryJpaRepository extends JpaRepository<AddMemberHistoryInfraEntity, Long> {
}
