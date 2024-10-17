package hello.fourthweek.interfaces.record.request;


import hello.fourthweek.domain.record.request.MemberRegistDomainRequest;

public record MemberRegistInterfacesRequest(long memberId, int memberBalance) {

    public MemberRegistDomainRequest toDomain() {
        return new MemberRegistDomainRequest(memberId, memberBalance);
    }
}
