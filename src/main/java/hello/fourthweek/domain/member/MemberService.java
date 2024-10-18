package hello.fourthweek.domain.member;


import hello.fourthweek.domain.member.record.request.*;
import hello.fourthweek.domain.member.record.response.*;
import hello.fourthweek.interfaces.member.record.response.*;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;


    @Transactional
    public MemberRegistInterfacesResponse memberRegist(MemberRegistDomainRequest memberRegistDomainRequest) {
        MemberRegistDomainResponse response = memberRepository.memberRegist(memberRegistDomainRequest.toEntity());
        return new MemberRegistInterfacesResponse(response.memberId(), response.memberBalance());
    }

    @Transactional
    public MemberInfoInterfacesResponse memberInfo(MemberInfoDomainRequest memberInfoDomainRequest) {
        MemberInfoDomainResponse memberInfoDomainResponse = memberRepository.memberInfo(memberInfoDomainRequest.toEntity());
        return memberInfoDomainResponse.toInterfaces();
    }

    @Transactional
    public GetBalanceInterfacesResponse getMemberBalance(GetBalanceDomainRequest getBalanceDomainRequest) {
        GetBalanceDomainResponse memberBalance = memberRepository.getMemberBalance(getBalanceDomainRequest.toEntity());
        return memberBalance.toInterfaces();
    }

    @Transactional
    public AddFundsInterfacesResponse addFunds(AddFundsDomainRequest addFundsDomainRequest) {
        AddFundsDomainResponse response = memberRepository.addFunds(addFundsDomainRequest.toEntity());
        return response.toInterfaces();
    }

    @Transactional
    public UpdateBalanceInterfacesResponse updateBalance(UpdateBalanceDomainRequest updateBalanceDomainRequest) {
        UpdateBalanceDomainResponse response = memberRepository.updateBalance(updateBalanceDomainRequest.toEntity());
        return response.toInterfaces();
    }

    @Transactional
    public boolean addMemberHistory(AddMemberHistoryDomainRequest addMemberHistoryDomainRequest) {
        try {
            memberRepository.addMemberHistory(addMemberHistoryDomainRequest.toEntity());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}
