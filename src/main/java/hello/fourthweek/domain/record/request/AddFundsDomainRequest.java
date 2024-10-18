package hello.fourthweek.domain.record.request;

import hello.fourthweek.infra.member.entity.AddFundsEntity;

public record AddFundsDomainRequest(long memberId, int chargeAmount) {

    public AddFundsEntity toEntity() {
        AddFundsEntity entity = new AddFundsEntity();
        entity.setMemberId(memberId);
        entity.setChargeAmount(chargeAmount);

        return entity;
    }
}
