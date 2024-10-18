package hello.fourthweek.interfaces.record.request;

import hello.fourthweek.domain.record.request.AddFundsDomainRequest;

public record AddFundsInterfacesRequest(long memberId, int chargeAmount) {

    public AddFundsDomainRequest toDomain() {
        return new AddFundsDomainRequest(memberId, chargeAmount);
    }
}
