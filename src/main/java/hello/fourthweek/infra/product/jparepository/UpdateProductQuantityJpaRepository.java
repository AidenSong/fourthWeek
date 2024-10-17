package hello.fourthweek.infra.product.jparepository;


import hello.fourthweek.infra.product.entity.ProductStockInfoInfraEntity;
import hello.fourthweek.infra.product.entity.UpdateProductQuantityInfraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UpdateProductQuantityJpaRepository extends JpaRepository<UpdateProductQuantityInfraEntity, Long> {


    @Modifying
    @Query(value = "UPDATE PRODUCT_STOCK SET INDE_AMOUNT = :indeAmount WHERE PRODUCT_ID = :productId AND PRODUCT_OPTION_ID = :productOptionId", nativeQuery = true)
    ProductStockInfoInfraEntity updateProductStock(@Param("productId") long productId, @Param("productOptionId") long productOptionId, @Param("indeAmount") int indeAmount);

}
