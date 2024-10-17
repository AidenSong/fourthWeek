package hello.fourthweek.interfaces.member.record.request;

import hello.fourthweek.domain.member.record.request.GetBalanceDomainRequest;

public record GetBalanceInterfacesRequest(long memberId) {

    public GetBalanceDomainRequest toDomain() {
        return new GetBalanceDomainRequest(memberId);
    }
}
