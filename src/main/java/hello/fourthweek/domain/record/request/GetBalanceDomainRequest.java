package hello.fourthweek.domain.record.request;

import hello.fourthweek.infra.member.entity.GetBalanceEntity;

public record GetBalanceDomainRequest(long memberId) {

    public GetBalanceEntity toEntity() {
        GetBalanceEntity entity = new GetBalanceEntity();
        entity.setMemberId(memberId);

        return entity;
    }
}
