package hello.fourthweek.domain.member.record.response;

import hello.fourthweek.interfaces.member.record.response.MemberRegistInterfacesResponse;

public record MemberRegistDomainResponse(long memberId, int memberBalance) {


    public MemberRegistInterfacesResponse toInterfaces(){
        return new MemberRegistInterfacesResponse(memberId, memberBalance);
    }
}
