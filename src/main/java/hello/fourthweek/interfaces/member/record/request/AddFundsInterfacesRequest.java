package hello.fourthweek.interfaces.member.record.request;

import hello.fourthweek.domain.member.record.request.AddFundsDomainRequest;

public record AddFundsInterfacesRequest(long memberId, int chargeAmount) {

    public AddFundsDomainRequest toDomain() {
        return new AddFundsDomainRequest(memberId, chargeAmount);
    }
}
