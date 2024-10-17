package hello.fourthweek.domain.record.response;

import hello.fourthweek.interfaces.record.response.UpdateBalanceInterfacesResponse;

public record UpdateBalanceDomainResponse(long memberId, int memberBalance) {


    public UpdateBalanceInterfacesResponse toInterfaces() {
        return new UpdateBalanceInterfacesResponse(memberId, memberBalance);
    }
}
