package com.mmall2.service;

import com.github.pagehelper.PageInfo;
import com.mmall2.common.ServerResponse;
import com.mmall2.pojo.Product;
import com.mmall2.vo.ProductDetailVo;

/**
 * Created by zhw on 2020/2/22.
 */
public interface IProductService {

    ServerResponse saveOrUpdateProduct(Product product);
    ServerResponse<String> setSaleStatus(Integer productId, Integer status);
    ServerResponse<ProductDetailVo> manageProductDetail(Integer productId);
    ServerResponse<PageInfo> getProductList(int pageNum, int pageSize);
    ServerResponse<PageInfo> searchProduct(String productName,Integer productId,int pageName,int pageSize);
    ServerResponse<ProductDetailVo> getProductDetail(Integer productId);
    ServerResponse<PageInfo> getProductByKeywordCategory(String keyword,Integer categoryId,int pageNum,int pageSize,String orderBy);
}
