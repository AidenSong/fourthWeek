package hello.fourthweek.domain.record.request;

import hello.fourthweek.infra.member.entity.UpdateBalanceEntity;

public record UpdateBalanceDomainRequest(long memberId, int amount) {

    public UpdateBalanceEntity toEntity() {
        UpdateBalanceEntity entity = new UpdateBalanceEntity();
        entity.setMemberId(memberId);
        entity.setAmount(amount);

        return entity;
    }
}
