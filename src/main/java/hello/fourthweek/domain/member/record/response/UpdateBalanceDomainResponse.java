package hello.fourthweek.domain.member.record.response;

import hello.fourthweek.interfaces.member.record.response.UpdateBalanceInterfacesResponse;

public record UpdateBalanceDomainResponse(long memberId, int memberBalance) {


    public UpdateBalanceInterfacesResponse toInterfaces() {
        return new UpdateBalanceInterfacesResponse(memberId, memberBalance);
    }
}
