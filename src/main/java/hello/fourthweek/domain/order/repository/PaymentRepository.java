package hello.fourthweek.domain.order.repository;


import hello.fourthweek.infra.order.entity.AddPaymentHistoryInfraEntity;

public interface PaymentRepository {


    void addPaymentHistory(AddPaymentHistoryInfraEntity addPaymentHistoryInfraEntity);

}
