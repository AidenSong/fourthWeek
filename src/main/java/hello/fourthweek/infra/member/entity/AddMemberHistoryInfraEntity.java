package hello.fourthweek.infra.member.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "MEMBER_BALANCE_HISTORY")
public class AddMemberHistoryInfraEntity {

    @Id
    private long memberId;
    private int indeAmount;
    private int totalBalance;
    private LocalDateTime createdAt;
}
