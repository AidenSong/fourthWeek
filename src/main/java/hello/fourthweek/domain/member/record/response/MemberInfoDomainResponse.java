package hello.fourthweek.domain.member.record.response;

import hello.fourthweek.interfaces.member.record.response.MemberInfoInterfacesResponse;

public record MemberInfoDomainResponse(long memberId, int memberBalance) {


    public MemberInfoInterfacesResponse toInterfaces() {
        return new MemberInfoInterfacesResponse(memberId, memberBalance);
    }
}
