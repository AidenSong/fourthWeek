package hello.fourthweek.infra.order;

import hello.fourthweek.domain.order.repository.PaymentRepository;
import hello.fourthweek.infra.order.entity.AddPaymentHistoryInfraEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;


@Repository
@RequiredArgsConstructor
public class PaymentRepositoryImpl implements PaymentRepository {

    private final PaymentRepository paymentRepository;


    @Override
    public void addPaymentHistory(AddPaymentHistoryInfraEntity addPaymentHistoryInfraEntity) {
        paymentRepository.addPaymentHistory(addPaymentHistoryInfraEntity);
    }
}
