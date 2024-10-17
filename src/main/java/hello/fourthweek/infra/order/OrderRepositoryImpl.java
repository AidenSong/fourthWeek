package hello.fourthweek.infra.order;


import hello.fourthweek.domain.order.repository.OrderRepository;
import hello.fourthweek.domain.order.record.response.OrderInfoDomainResponse;
import hello.fourthweek.infra.order.entity.AddOrderHistoryInfraEntity;
import hello.fourthweek.infra.order.entity.OrderInfoInfraEntity;
import hello.fourthweek.infra.order.jparepository.AddOrderHistoryJpaRepository;
import hello.fourthweek.infra.order.jparepository.OrderInfoJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class OrderRepositoryImpl implements OrderRepository {

    private final OrderInfoJpaRepository orderInfoJpaRepository;
    private final AddOrderHistoryJpaRepository addOrderHistoryJpaRepository;


    @Override
    public OrderInfoDomainResponse orderInfo(OrderInfoInfraEntity orderInfoInfraEntity) {
        OrderInfoInfraEntity response = orderInfoJpaRepository.findByOrderIdAndMemberId(orderInfoInfraEntity.getOrderId(), orderInfoInfraEntity.getMemberId());
        return response.toDomain();
    }

    @Override
    public void addOrderHistory(AddOrderHistoryInfraEntity addOrderHistoryInfraEntity) {
        addOrderHistoryJpaRepository.save(addOrderHistoryInfraEntity);
    }

}
