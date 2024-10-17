package hello.fourthweek.domain.record.response;

import hello.fourthweek.interfaces.record.response.GetBalanceInterfacesResponse;

public record GetBalanceDomainResponse(long memberId, int memberBalance) {

    public GetBalanceInterfacesResponse toInterfaces() {
        return new GetBalanceInterfacesResponse(memberId, memberBalance);
    }
}
