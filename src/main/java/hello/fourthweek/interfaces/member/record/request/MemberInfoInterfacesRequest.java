package hello.fourthweek.interfaces.member.record.request;

import hello.fourthweek.domain.member.record.request.MemberInfoDomainRequest;

public record MemberInfoInterfacesRequest(long memberId) {

    public MemberInfoDomainRequest toDomain(){
        return new MemberInfoDomainRequest(memberId);
    }
}
