package hello.fourthweek.interfaces.record.request;

import hello.fourthweek.domain.record.request.GetBalanceDomainRequest;

public record GetBalanceInterfacesRequest(long memberId) {

    public GetBalanceDomainRequest toDomain() {
        return new GetBalanceDomainRequest(memberId);
    }
}
