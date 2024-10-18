package hello.fourthweek.domain.member.record.request;

import hello.fourthweek.infra.member.entity.AddMemberHistoryInfraEntity;

import java.time.LocalDateTime;

public record AddMemberHistoryDomainRequest(
    long memberId,
    int indeAmount,
    int totalBalance,
    LocalDateTime createdAt
) {


    public AddMemberHistoryInfraEntity toEntity() {
        AddMemberHistoryInfraEntity entity = new AddMemberHistoryInfraEntity();
        entity.setMemberId(memberId);
        entity.setIndeAmount(indeAmount);
        entity.setTotalBalance(totalBalance);
        entity.setCreatedAt(createdAt);

        return entity;
    }
}
