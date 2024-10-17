package hello.fourthweek.interfaces.member.record.request;


import hello.fourthweek.domain.member.record.request.MemberRegistDomainRequest;

public record MemberRegistInterfacesRequest(long memberId, int memberBalance) {

    public MemberRegistDomainRequest toDomain() {
        return new MemberRegistDomainRequest(memberId, memberBalance);
    }
}
