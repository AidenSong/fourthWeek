package hello.fourthweek.interfaces.record.request;

import hello.fourthweek.domain.record.request.UpdateBalanceDomainRequest;

public record UpdateBalanceInterfacesRequest(long memberId, int amount) {

    public UpdateBalanceDomainRequest toDomain() {
        return new UpdateBalanceDomainRequest(memberId, amount);
    }
}
