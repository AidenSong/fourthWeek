package hello.fourthweek.domain.member;


import hello.fourthweek.domain.member.record.response.*;
import hello.fourthweek.infra.member.entity.*;

public interface MemberRepository {


    MemberRegistDomainResponse memberRegist(MemberRegistEntity memberRegistEntity);

    MemberInfoDomainResponse memberInfo(MemberInfoEntity memberInfoEntity);

    GetBalanceDomainResponse getMemberBalance(GetBalanceEntity getBalanceEntity);

    AddFundsDomainResponse addFunds(AddFundsEntity addFundsEntity);

    UpdateBalanceDomainResponse updateBalance(UpdateBalanceEntity updateBalanceEntity);


}
