package hello.fourthweek.infra.product.jparepository;

import hello.fourthweek.infra.product.entity.ProductStockInfoInfraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ProductStockInfoJpaRepository extends JpaRepository<ProductStockInfoInfraEntity, Long> {


    @Modifying
    @Query(value = "SELECT PRODUCT_ID, PRODUCT_OPTION_ID, PRODUCT_QUANTITY FROM PRODUCT_STOCK WHERE PRODUCT_ID = :productId AND PRODUCT_OPTION_ID = :productOptionId", nativeQuery = true)
    ProductStockInfoInfraEntity findByProductIdAndProductOptionId(@Param("productId") long productId, @Param("productOptionId") long productOptionId);
}
