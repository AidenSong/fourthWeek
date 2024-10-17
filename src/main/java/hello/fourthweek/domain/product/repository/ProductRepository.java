package hello.fourthweek.domain.product.repository;

import hello.fourthweek.domain.product.record.response.*;
import hello.fourthweek.infra.product.entity.*;

public interface ProductRepository {


    ProductRegistDomainResponse productRegist(ProductRegistInfraEntity productRegistInfraEntity);

    ProductOptionRegistDomainResponse productOptionRegist(ProductOptionRegistInfraEntity productOptionRegistInfraEntity);

    ProductStockInfoDomainResponse productStockInfo(ProductStockInfoInfraEntity productStockInfoInfraEntity);

    AddProductHistoryDomainResponse addProductHistory(AddProductHistoryInfraEntity addProductHistoryInfraEntity);

    ProductStockInfoDomainResponse updateProductQuantity(UpdateProductQuantityInfraEntity updateProductQuantityInfraEntity);

}
