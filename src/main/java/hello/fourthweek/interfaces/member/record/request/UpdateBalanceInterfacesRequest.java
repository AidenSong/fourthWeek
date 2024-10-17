package hello.fourthweek.interfaces.member.record.request;

import hello.fourthweek.domain.member.record.request.UpdateBalanceDomainRequest;

public record UpdateBalanceInterfacesRequest(long memberId, int amount) {

    public UpdateBalanceDomainRequest toDomain() {
        return new UpdateBalanceDomainRequest(memberId, amount);
    }
}
