package hello.fourthweek.domain;


import hello.fourthweek.domain.record.response.*;
import hello.fourthweek.infra.member.entity.*;

public interface MemberRepository {


    MemberRegistDomainResponse memberRegist(MemberRegistEntity memberRegistEntity);

    MemberInfoDomainResponse memberInfo(MemberInfoEntity memberInfoEntity);

    GetBalanceDomainResponse getMemberBalance(GetBalanceEntity getBalanceEntity);

    AddFundsDomainResponse addFunds(AddFundsEntity addFundsEntity);

    UpdateBalanceDomainResponse updateBalance(UpdateBalanceEntity updateBalanceEntity);


}
