package hello.fourthweek.domain.member.record.response;

import hello.fourthweek.interfaces.member.record.response.GetBalanceInterfacesResponse;

public record GetBalanceDomainResponse(long memberId, int memberBalance) {

    public GetBalanceInterfacesResponse toInterfaces() {
        return new GetBalanceInterfacesResponse(memberId, memberBalance);
    }
}
