package hello.fourthweek.infra.member;

import hello.fourthweek.domain.MemberRepository;
import hello.fourthweek.domain.record.response.*;
import hello.fourthweek.infra.member.entity.*;
import hello.fourthweek.infra.member.jparepository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
@RequiredArgsConstructor

public class MemberRepositoryImpl implements MemberRepository {


    private final MemberRegistJpaRepository memberRegistJpaRepository;
    private final MemberInfoJpaRepository memberInfoJpaRepository;
    private final GetBalanceJpaRepository getBalanceJpaRepository;
    private final AddFundsJpaRepository addFundsJpaRepository;
    private final UpdateBalanceJpaRepository updateBalanceJpaRepository;


    @Override
    public MemberRegistDomainResponse memberRegist(MemberRegistEntity memberRegistEntity) {
        MemberRegistEntity response = memberRegistJpaRepository.save(memberRegistEntity);
        return response.toDomain();
    }

    @Override
    public MemberInfoDomainResponse memberInfo(MemberInfoEntity memberInfoEntity) {

        Optional<MemberInfoEntity> response = memberInfoJpaRepository.findById(memberInfoEntity.getMemberId());
        if (response.isPresent()) {
            return response.get().toDomain();

        }
        return null;
    }

    @Override
    public GetBalanceDomainResponse getMemberBalance(GetBalanceEntity getBalanceEntity) {

        GetBalanceEntity response = getBalanceJpaRepository.findByIdBalanceOnly(getBalanceEntity.getMemberId());
        return response.toDomain();

    }

    @Override
    public AddFundsDomainResponse addFunds(AddFundsEntity addFundsEntity) {
        AddFundsEntity response = addFundsJpaRepository.findByIdAddFunds(addFundsEntity.getMemberId(), addFundsEntity.getChargeAmount());
        return response.toDomain();
    }

    @Override
    public UpdateBalanceDomainResponse updateBalance(UpdateBalanceEntity updateBalanceEntity) {
        UpdateBalanceEntity response = updateBalanceJpaRepository.updateBalance(updateBalanceEntity.getMemberId(), updateBalanceEntity.getAmount());
        return response.toDomain();
    }
}
