package hello.fourthweek.interfaces.record.request;

import hello.fourthweek.domain.record.request.MemberInfoDomainRequest;

public record MemberInfoInterfacesRequest(long memberId) {

    public MemberInfoDomainRequest toDomain(){
        return new MemberInfoDomainRequest(memberId);
    }
}
