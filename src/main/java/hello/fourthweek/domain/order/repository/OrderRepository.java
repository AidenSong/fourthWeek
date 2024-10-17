package hello.fourthweek.domain.order.repository;


import hello.fourthweek.domain.order.record.response.OrderInfoDomainResponse;
import hello.fourthweek.infra.order.entity.AddOrderHistoryInfraEntity;
import hello.fourthweek.infra.order.entity.OrderInfoInfraEntity;

public interface OrderRepository {


    OrderInfoDomainResponse orderInfo(OrderInfoInfraEntity orderInfoInfraEntity);

    void addOrderHistory(AddOrderHistoryInfraEntity addOrderHistoryInfraEntity);
}
