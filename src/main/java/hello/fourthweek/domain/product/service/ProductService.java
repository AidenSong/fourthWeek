package hello.fourthweek.domain.product.service;


import hello.fourthweek.domain.product.record.request.*;
import hello.fourthweek.domain.product.record.response.*;
import hello.fourthweek.domain.product.repository.ProductRepository;
import hello.fourthweek.interfaces.product.record.response.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;


    // 제품 등록
    public ProductRegistInterfacesResponse productRegist(ProductRegistDomainRequest productRegistDomainRequest) {
        ProductRegistDomainResponse response = productRepository.productRegist(productRegistDomainRequest.toEntity());
        return response.toInterfaces();
    }

    // 제품 옵션 등록
    public ProductOptionRegistInterfacesResponse productOptionRegist(ProductOptionRegistDomainRequest productOptionRegistDomainRequest) {
        ProductOptionRegistDomainResponse response = productRepository.productOptionRegist(productOptionRegistDomainRequest.toEntity());
        return response.toInterfaces();
    }

    // 제품 재고 정보
    public ProductStockInfoInterfacesResponse productStockInfo(ProductStockInfoDomainRequest productStockInfoDomainRequest) {
        ProductStockInfoDomainResponse response = productRepository.productStockInfo(productStockInfoDomainRequest.toEntity());
        return response.toInterfaces();
    }

    // 제품 히스토리 추가
    public AddProductHistoryInterfacesResponse addProductHistory(AddProductHistoryDomainRequest addProductHistoryDomainRequest) {
        AddProductHistoryDomainResponse response = productRepository.addProductHistory(addProductHistoryDomainRequest.toEntity());
        return response.toInterfaces();
    }

    // 제품 증감 업데이트
    public ProductStockInfoInterfacesResponse updateProductQuantity(UpdateProductQuantityDomainRequest updateProductQuantityDomainRequest) {
        ProductStockInfoDomainResponse response = productRepository.updateProductQuantity(updateProductQuantityDomainRequest.toEntity());
        return response.toInterfaces();
    }



}
