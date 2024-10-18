package hello.fourthweek.domain.record.response;

import hello.fourthweek.interfaces.record.response.AddFundsInterfacesResponse;

public record AddFundsDomainResponse(long memberId, int memberBalance) {

    public AddFundsInterfacesResponse toInterfaces() {
        return new AddFundsInterfacesResponse(memberId, memberBalance);
    }
}
