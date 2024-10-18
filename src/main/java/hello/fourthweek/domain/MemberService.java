package hello.fourthweek.domain;


import hello.fourthweek.domain.record.request.*;
import hello.fourthweek.domain.record.response.*;
import hello.fourthweek.interfaces.record.response.*;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    
    public MemberRegistInterfacesResponse memberRegist(MemberRegistDomainRequest memberRegistDomainRequest) {
        MemberRegistDomainResponse response = memberRepository.memberRegist(memberRegistDomainRequest.toEntity());
        return new MemberRegistInterfacesResponse(response.memberId(), response.memberBalance());
    }
    
    
    public MemberInfoInterfacesResponse memberInfo(MemberInfoDomainRequest memberInfoDomainRequest) {
        MemberInfoDomainResponse memberInfoDomainResponse = memberRepository.memberInfo(memberInfoDomainRequest.toEntity());
        return memberInfoDomainResponse.toInterfaces();
    }
    
    public GetBalanceInterfacesResponse getMemberBalance(GetBalanceDomainRequest getBalanceDomainRequest) {
        GetBalanceDomainResponse memberBalance = memberRepository.getMemberBalance(getBalanceDomainRequest.toEntity());
        return memberBalance.toInterfaces();
    }


    public AddFundsInterfacesResponse addFunds(AddFundsDomainRequest addFundsDomainRequest) {
        AddFundsDomainResponse response = memberRepository.addFunds(addFundsDomainRequest.toEntity());
        return response.toInterfaces();
    }


    public UpdateBalanceInterfacesResponse updateBalance(UpdateBalanceDomainRequest updateBalanceDomainRequest) {
        UpdateBalanceDomainResponse response = memberRepository.updateBalance(updateBalanceDomainRequest.toEntity());
        return response.toInterfaces();
    }
    
}
