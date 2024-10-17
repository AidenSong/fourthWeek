package hello.fourthweek.infra.member.entity;


import hello.fourthweek.domain.record.response.UpdateBalanceDomainResponse;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "MEMBER_INFO")
public class UpdateBalanceEntity {

    @Id
    private long memberId;
    private int amount;

    public UpdateBalanceDomainResponse toDomain() {
        return new UpdateBalanceDomainResponse(memberId, amount);
    }
}
