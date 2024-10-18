package hello.fourthweek.infra.member.entity;


import hello.fourthweek.domain.record.response.AddFundsDomainResponse;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "MEMBER_INFO")
public class AddFundsEntity {

    @Id
    private long memberId;
    private int chargeAmount;

    public AddFundsDomainResponse toDomain() {
        return new AddFundsDomainResponse(memberId, chargeAmount);
    }
}
