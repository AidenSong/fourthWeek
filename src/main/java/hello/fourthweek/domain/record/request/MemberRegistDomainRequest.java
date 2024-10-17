package hello.fourthweek.domain.record.request;

import hello.fourthweek.infra.member.entity.MemberRegistEntity;

public record MemberRegistDomainRequest(long memberId, int memberBalance) {


    public MemberRegistEntity toEntity() {
        MemberRegistEntity entity = new MemberRegistEntity();
        entity.setMemberId(memberId);
        entity.setMemberBalance(memberBalance);

        return entity;
    }
}
