package hello.fourthweek.infra.member.entity;


import hello.fourthweek.domain.member.record.response.GetBalanceDomainResponse;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "MEMBER_INFO")
public class GetBalanceEntity {

    @Id
    private long memberId;
    private int memberBalance;

    public GetBalanceDomainResponse toDomain(){
        return new GetBalanceDomainResponse(memberId, memberBalance);
    }
}
