package hello.fourthweek.infra.product;


import hello.fourthweek.domain.product.record.response.AddProductHistoryDomainResponse;
import hello.fourthweek.domain.product.record.response.ProductOptionRegistDomainResponse;
import hello.fourthweek.domain.product.record.response.ProductRegistDomainResponse;
import hello.fourthweek.domain.product.record.response.ProductStockInfoDomainResponse;
import hello.fourthweek.domain.product.repository.ProductRepository;
import hello.fourthweek.infra.product.entity.*;
import hello.fourthweek.infra.product.jparepository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ProductRepositoryImpl implements ProductRepository {


    private final ProductRegistJpaRepository productRegistJpaRepository;
    private final AddProductHistoryJpaRepository addProductHistoryJpaRepository;
    private final UpdateProductQuantityJpaRepository updateProductQuantityJpaRepository;
    private final ProductStockInfoJpaRepository productStockInfoJpaRepository;
    private final ProductOptionRegistJpaRepository productOptionRegistJpaRepository;


    // 제품 등록
    @Override
    public ProductRegistDomainResponse productRegist(ProductRegistInfraEntity productRegistInfraEntity) {
        ProductRegistInfraEntity response = productRegistJpaRepository.save(productRegistInfraEntity);
        return response.toDomain();
    }

    @Override
    public ProductOptionRegistDomainResponse productOptionRegist(ProductOptionRegistInfraEntity productOptionRegistInfraEntity) {
        ProductOptionRegistInfraEntity response = productOptionRegistJpaRepository.save(productOptionRegistInfraEntity);
        return response.toDomain();
    }


    // 제품 정보 확인
    @Override
    public ProductStockInfoDomainResponse productStockInfo(ProductStockInfoInfraEntity productStockInfoInfraEntity) {
        ProductStockInfoInfraEntity response = productStockInfoJpaRepository.findByProductIdAndProductOptionId(productStockInfoInfraEntity.getProrductId(), productStockInfoInfraEntity.getProductOptionId());
        return response.toDomain();
    }


    // 제품 히스토리 추가
    @Override
    public AddProductHistoryDomainResponse addProductHistory(AddProductHistoryInfraEntity addProductHistoryInfraEntity) {
        AddProductHistoryInfraEntity response = addProductHistoryJpaRepository.save(addProductHistoryInfraEntity);
        return response.toDomain();
    }

    // 재품 증감 업데이트
    @Override
    public ProductStockInfoDomainResponse updateProductQuantity(UpdateProductQuantityInfraEntity updateProductQuantityInfraEntity) {
        ProductStockInfoInfraEntity response = updateProductQuantityJpaRepository.updateProductStock(updateProductQuantityInfraEntity.getProductId(), updateProductQuantityInfraEntity.getProductOptionId(), updateProductQuantityInfraEntity.getIndeAmount());
        return response.toDomain();
    }


}
