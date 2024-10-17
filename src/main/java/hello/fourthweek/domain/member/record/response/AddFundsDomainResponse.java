package hello.fourthweek.domain.member.record.response;

import hello.fourthweek.interfaces.member.record.response.AddFundsInterfacesResponse;

public record AddFundsDomainResponse(long memberId, int memberBalance) {

    public AddFundsInterfacesResponse toInterfaces() {
        return new AddFundsInterfacesResponse(memberId, memberBalance);
    }
}
