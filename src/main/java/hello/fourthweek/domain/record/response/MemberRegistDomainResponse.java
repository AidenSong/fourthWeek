package hello.fourthweek.domain.record.response;

import hello.fourthweek.interfaces.record.response.MemberRegistInterfacesResponse;

public record MemberRegistDomainResponse(long memberId, int memberBalance) {


    public MemberRegistInterfacesResponse toInterfaces(){
        return new MemberRegistInterfacesResponse(memberId, memberBalance);
    }
}
