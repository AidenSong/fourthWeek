package hello.fourthweek.domain.record.response;

import hello.fourthweek.interfaces.record.response.MemberInfoInterfacesResponse;

public record MemberInfoDomainResponse(long memberId, int memberBalance) {


    public MemberInfoInterfacesResponse toInterfaces() {
        return new MemberInfoInterfacesResponse(memberId, memberBalance);
    }
}
