package hello.fourthweek.interfaces.member.record.request;


import hello.fourthweek.domain.member.record.request.AddMemberHistoryDomainRequest;

import java.time.LocalDateTime;

public record AddMemberHistoryInterfacesRequest(
    long memberId,
    int indeAmount,
    int totalBalance,
    LocalDateTime createdAt
) {

    public AddMemberHistoryDomainRequest toDomain() {
        return new AddMemberHistoryDomainRequest(memberId, indeAmount, totalBalance, createdAt);
    }
}
