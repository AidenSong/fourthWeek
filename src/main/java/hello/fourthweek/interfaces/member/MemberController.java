package hello.fourthweek.interfaces.member;


import hello.fourthweek.domain.member.MemberService;
import hello.fourthweek.interfaces.member.record.request.*;
import hello.fourthweek.interfaces.member.record.response.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {


    private final MemberService memberService;


    // 회원 등록
    @PostMapping("memberRegist")
    public MemberRegistInterfacesResponse memberRegist(@RequestBody MemberRegistInterfacesRequest memberRegistInterfacesRequest) {
        return memberService.memberRegist(memberRegistInterfacesRequest.toDomain());
    }

    // 회원 정보 조회
    @PostMapping("memberInfo")
    public MemberInfoInterfacesResponse memberInfo(@RequestParam MemberInfoInterfacesRequest memberInfoInterfacesRequest) {
        return memberService.memberInfo(memberInfoInterfacesRequest.toDomain());
    }


    // 회원 충전 금액 확인
    @GetMapping("memberBalance")
    public GetBalanceInterfacesResponse getMemberBalance(@RequestBody GetBalanceInterfacesRequest getBalanceInterfacesRequest) {
        return memberService.getMemberBalance(getBalanceInterfacesRequest.toDomain());
    }


    // 회원 금액 충전
    @PostMapping("/addFunds")
    public AddFundsInterfacesResponse addFunds(@RequestBody AddFundsInterfacesRequest addFundsInterfacesRequest) {
        return memberService.addFunds(addFundsInterfacesRequest.toDomain());
    }

    // 회원 금액 증감
    @PutMapping("/updateBalance")
    public UpdateBalanceInterfacesResponse updateBalance(@RequestBody UpdateBalanceInterfacesRequest updateBalanceInterfacesRequest) {
        return memberService.updateBalance(updateBalanceInterfacesRequest.toDomain());
    }

    // 회원 히스토리 추가
    @PostMapping("/addMemberHistory")
    public boolean addMemberHistory(@RequestBody AddMemberHistoryInterfacesRequest addMemberHistoryInterfacesRequest) {
        return memberService.addMemberHistory(addMemberHistoryInterfacesRequest.toDomain());
    }
}
