package hello.fourthweek.domain.order.service;


import hello.fourthweek.domain.order.record.request.AddPaymentHistoryDomainRequest;
import hello.fourthweek.domain.order.repository.PaymentRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {


    private final PaymentRepository paymentRepository;


    @Transactional
    public boolean addPaymentHistory(AddPaymentHistoryDomainRequest addPaymentHistoryDomainRequest) {
        try {
            paymentRepository.addPaymentHistory(addPaymentHistoryDomainRequest.toEntity());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
