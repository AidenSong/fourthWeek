package hello.fourthweek.domain.record.request;

import hello.fourthweek.infra.member.entity.MemberInfoEntity;

public record MemberInfoDomainRequest(long memberId) {

    public MemberInfoEntity toEntity() {
        MemberInfoEntity entity = new MemberInfoEntity();
        entity.setMemberId(memberId);

        return entity;
    }
}
