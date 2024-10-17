package hello.fourthweek.interfaces.order.controller;


import hello.fourthweek.domain.order.service.PaymentService;
import hello.fourthweek.interfaces.order.record.request.AddPaymentHistoryInterfacesRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/payment")
public class PaymentController {


    private final PaymentService paymentService;


    @PostMapping("/addPaymentHistory")
    public boolean addPaymentHistory(@RequestBody AddPaymentHistoryInterfacesRequest addPaymentHistoryInterfacesRequest) {
        return paymentService.addPaymentHistory(addPaymentHistoryInterfacesRequest.toDomain());
    }
}
